package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.ApplicationService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.core.utilities.results.SuccessDataResult;
import dkn.hrms.core.utilities.results.SuccessResult;
import dkn.hrms.dataAccess.abstracts.ApplicationDao;
import dkn.hrms.entities.concretes.Applitaion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationManager implements ApplicationService {
    private ApplicationDao applicationDao;

    public ApplicationManager(ApplicationDao applicationDao) {
        this.applicationDao = applicationDao;
    }

    @Override
    public DataResult<List<Applitaion>> findByJobAdvertisement(int jobAdvertisementId) {
        return new SuccessDataResult<List<Applitaion>>(this.applicationDao.findByJobAdvertisementId(jobAdvertisementId), "Başvurular Listelendi");
    }

    @Override
    public Result add(Applitaion applitaion) {
        this.applicationDao.save(applitaion);
        return new SuccessResult("Kayıt Başarılı");
    }
}
