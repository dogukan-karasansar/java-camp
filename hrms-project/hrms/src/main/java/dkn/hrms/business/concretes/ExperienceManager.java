package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.ExperienceService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.core.utilities.results.SuccessDataResult;
import dkn.hrms.core.utilities.results.SuccessResult;
import dkn.hrms.dataAccess.abstracts.ExperienceDao;
import dkn.hrms.entities.concretes.Experience;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceManager implements ExperienceService {
    private ExperienceDao experienceDao;

    public ExperienceManager(ExperienceDao experienceDao) {
        this.experienceDao = experienceDao;
    }

    @Override
    public DataResult<List<Experience>> getReversedAll() {
        Sort sort = Sort.by(Sort.Direction.DESC, "endExperienceYear");
        return new SuccessDataResult<List<Experience>>(this.experienceDao.findAll(sort), "Datalar Listelendi");
    }

    @Override
    public Result add(Experience experience) {
        if(experience.getEndExperienceYear().equals("")){
            experience.setEndExperienceYear("devam ediyor");
        }
        this.experienceDao.save(experience);
        return new SuccessResult("Tecrübeniz Eklendi");
    }
}
