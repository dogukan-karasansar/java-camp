package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.EmployerService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.SuccessDataResult;
import dkn.hrms.dataAccess.abstracts.EmployerDao;
import dkn.hrms.entities.concretes.Employer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;

    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "İş verenler listelendi");
    }
}
