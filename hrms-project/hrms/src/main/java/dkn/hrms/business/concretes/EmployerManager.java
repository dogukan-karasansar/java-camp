package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.EmployerService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.core.utilities.results.SuccessDataResult;
import dkn.hrms.core.utilities.results.SuccessResult;
import dkn.hrms.dataAccess.abstracts.EmployerDao;
import dkn.hrms.dataAccess.abstracts.UserDao;
import dkn.hrms.entities.concretes.Employer;
import dkn.hrms.core.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;
    private UserDao userDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao, UserDao userDao) {
        this.employerDao = employerDao;
        this.userDao = userDao;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "İş verenler listelendi");
    }

    @Override
    public Result add(Employer employer, User user) {
        this.userDao.save(user);
        employer.setUser(user);
        this.employerDao.save(employer);
        return new SuccessResult();
    }

    @Override
    public DataResult<Employer> getEmployer(int id) {
        return new SuccessDataResult<Employer>(this.employerDao.findByUserId(id), "Başarılı");
    }
}
