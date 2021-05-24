package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.JobSeekerService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.SuccessDataResult;
import dkn.hrms.dataAccess.abstracts.JobSeekerDao;
import dkn.hrms.entities.concretes.JobSeeker;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {
    private JobSeekerDao jobSeekerDao;

    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        this.jobSeekerDao = jobSeekerDao;
    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "İş arayanlar listelendi");
    }
}
