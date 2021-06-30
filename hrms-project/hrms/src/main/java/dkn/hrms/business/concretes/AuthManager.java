package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.AuthService;
import dkn.hrms.business.abstracts.EmployerService;
import dkn.hrms.business.abstracts.JobSeekerService;
import dkn.hrms.business.abstracts.UserService;
import dkn.hrms.core.utilities.adapters.abstracts.EmailVerifyService;
import dkn.hrms.core.utilities.adapters.abstracts.MernisService;
import dkn.hrms.core.utilities.results.*;
import dkn.hrms.dataAccess.abstracts.EmployerDao;
import dkn.hrms.dataAccess.abstracts.JobSeekerDao;
import dkn.hrms.dataAccess.abstracts.SystemPersonnelDao;
import dkn.hrms.dataAccess.abstracts.UserDao;
import dkn.hrms.entities.concretes.Employer;
import dkn.hrms.entities.concretes.JobSeeker;
import dkn.hrms.core.entities.concretes.User;
import dkn.hrms.entities.concretes.SystemPersonnel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthManager<T> implements AuthService {
    private JobSeekerService jobSeekerService;
    private EmployerService employerService;
    private MernisService mrns;
    private EmailVerifyService emailVerified;
    private UserService userService;
    private UserDao userDao;
    private JobSeekerDao jobSeekerDao;
    private EmployerDao employerDao;
    private SystemPersonnelDao SystemPersonnelDao;

    public AuthManager(JobSeekerService jobSeekerService, EmployerService employerService, MernisService mrns, EmailVerifyService emailVerified, UserService userService, UserDao userDao, JobSeekerDao jobSeekerDao, EmployerDao employerDao, SystemPersonnelDao SystemPersonnelDao) {
        this.jobSeekerService = jobSeekerService;
        this.employerService = employerService;
        this.mrns = mrns;
        this.emailVerified = emailVerified;
        this.userService = userService;
        this.userDao = userDao;
        this.jobSeekerDao = jobSeekerDao;
        this.employerDao = employerDao;
        this.SystemPersonnelDao = SystemPersonnelDao;
    }

    @Override
    public Result employerRegister(User user, Employer employer, String r_pass) {
        boolean userCheck = false;
        List<User> users = this.userDao.findAll();
        for (User usr : users) {
            if (usr.getEmail().equals(user.getEmail())) {
                userCheck = true;
            } else {
                userCheck = false;
            }
        }

        if (user.getEmail().isEmpty() || user.getPassword().isEmpty() || employer.getCompanyName().isEmpty() || employer.getWebSites().isEmpty() || employer.getPhone().isEmpty() || r_pass.isEmpty()) {
            return new ErrorResult("Tüm alanlar zorunludur");
        } else if (!employer.getWebSites().equals(user.getEmail())) {
            return new ErrorResult("Web sitesi ile Email adresi aynı değil");
        } else if (!user.getPassword().equals(r_pass)) {
            return new ErrorResult("Hatalı şifre tekrarı");
        } else if (userCheck) {
            return new ErrorResult("Aynı Email kayıtlı");
        } else {
            if (emailVerified.verifyMail(user)) {
                this.employerService.add(employer, user);
                return new SuccessResult("İş veren eklendi");
            } else {
                return new ErrorResult("Email onaylanmadı");
            }
        }
    }

    @Override
    public Result jobSeekerRegister(User user, JobSeeker jobSeeker, String r_pass) {
        boolean userCheck = false;
        boolean nationalIdentityCheck = false;
        List<User> users = this.userDao.findAll();
        for (User usr : users) {
            if (usr.getEmail().equals(user.getEmail())) {
                userCheck = true;
            } else {
                userCheck = false;
            }
        }

        List<JobSeeker> jobSeekers = this.jobSeekerDao.findAll();
        for (JobSeeker jsbk : jobSeekers) {
            if (jsbk.getNationalIdentity().equals(jobSeeker.getNationalIdentity())) {
                nationalIdentityCheck = true;
            } else {
                nationalIdentityCheck = false;
            }
        }


        if (user.getEmail().isEmpty() || user.getPassword().isEmpty() || jobSeeker.getBirthdayDate() == null || jobSeeker.getFirstName().isEmpty() || jobSeeker.getLastName().isEmpty() || jobSeeker.getNationalIdentity().isEmpty() || r_pass.isEmpty()) {
            return new ErrorResult("Tüm alanlar zorunludur");
        } else if (userCheck) {
            return new ErrorResult("Aynı Email kayıtlı");
        } else if (nationalIdentityCheck) {
            return new ErrorResult("TC kimlik no kayıtlı");
        } else if (!mrns.checkMernis(jobSeeker)) {
            return new ErrorResult("Mernis onayı gerçekleşmedi");
        } else {
            if (emailVerified.verifyMail(user)) {
                this.jobSeekerService.add(jobSeeker, user);
                return new SuccessResult("İş arayan eklendi");
            } else {
                return new ErrorResult("Email onaylanmadı");
            }
        }
    }

    @Override
    public DataResult<T> loginUser(String email, String password) {
        var val = this.userDao.findByEmailAndPassword(email, password);
        var employer = this.employerDao.findByUserId(val.getId());
        var jobSeeker = this.jobSeekerDao.findByUserId(val.getId());
        var systemPersonnel = this.SystemPersonnelDao.findByUserId(val.getId());
        if (employer != null) {
            return new SuccessDataResult<Employer>(employer, "Giriş Başarılı");
        } else if (jobSeeker != null) {
            return new SuccessDataResult<JobSeeker>(jobSeeker, "Giriş Başarılı");
        } else if(systemPersonnel != null){
            return new SuccessDataResult<SystemPersonnel>(systemPersonnel, "Giriş Başarılı");
        }
        else {
            return new ErrorDataResult<User>(null, "Hatalı Giriş!");
        }
    }
}
