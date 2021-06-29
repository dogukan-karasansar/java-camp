package dkn.hrms.business.abstracts;

import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.Applitaion;

import java.util.List;

public interface ApplicationService {
    DataResult<List<Applitaion>> findByJobAdvertisement(int jobAdvertisementId);
    Result add(Applitaion applitaion);
}
