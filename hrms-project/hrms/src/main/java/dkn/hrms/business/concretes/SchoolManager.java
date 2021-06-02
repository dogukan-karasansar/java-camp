package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.SchoolService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.core.utilities.results.SuccessDataResult;
import dkn.hrms.core.utilities.results.SuccessResult;
import dkn.hrms.dataAccess.abstracts.SchoolDao;
import dkn.hrms.entities.concretes.School;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolManager implements SchoolService {
    private SchoolDao schoolDao;

    public SchoolManager(SchoolDao schoolDao) {
        this.schoolDao = schoolDao;
    }

    @Override
    public DataResult<List<School>> getReversedAll() {
        Sort sort = Sort.by(Sort.Direction.DESC, "endSchoolYear");
        return new SuccessDataResult<List<School>>(this.schoolDao.findAll(sort), "Datalar Listelendi");
    }

    @Override
    public Result add(School school) {
        if(school.getEndSchoolYear().equals("")){
            school.setEndSchoolYear("devam ediyor");
        }
        this.schoolDao.save(school);
        return new SuccessResult("");
    }
}
