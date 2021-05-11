package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.JobPositionService;
import dkn.hrms.dataAccess.abstracts.JobPositionDao;
import dkn.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {
    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }


    @Override
    public List<JobPosition> getAll() {
        return this.jobPositionDao.findAll();
    }
}
