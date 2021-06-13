package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.JobSeekerService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.core.utilities.results.SuccessDataResult;
import dkn.hrms.core.utilities.results.SuccessResult;
import dkn.hrms.dataAccess.abstracts.JobSeekerDao;
import dkn.hrms.dataAccess.abstracts.UserDao;
import dkn.hrms.entities.concretes.JobSeeker;
import dkn.hrms.core.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {
    private JobSeekerDao jobSeekerDao;
    private UserDao userDao;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao, UserDao userDao) {
        this.jobSeekerDao = jobSeekerDao;
        this.userDao = userDao;
    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "İş arayanlar listelendi");
    }

    @Override
    public Result add(JobSeeker jobSeeker, User user) {
        this.userDao.save(user);
        jobSeeker.setUser(user);
        this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult();
    }
}
