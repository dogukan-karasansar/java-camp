package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.JobPositionService;
import dkn.hrms.core.utilities.results.*;
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
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(), "Bütün iş bölümleri listelendi");
    }

    @Override
    public Result add(JobPosition jobPosition) {
        boolean check = false;
        List<JobPosition> results = this.jobPositionDao.findAll();
        for (JobPosition jobs : results) {
            if (jobs.getPositionName().equals(jobPosition.getPositionName())) {
                check = true;
            }
        }
        if (check) {
            return new ErrorResult("İş pozisyonu daha önce kayıt edilmiş");
        } else {
            this.jobPositionDao.save(jobPosition);
            return new SuccessResult("İş pozisyonu başarıyla eklendi");
        }
    }
}
