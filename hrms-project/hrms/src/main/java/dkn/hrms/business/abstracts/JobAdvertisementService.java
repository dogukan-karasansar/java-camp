package dkn.hrms.business.abstracts;

import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.JobAdvertisement;
import java.util.List;

public interface JobAdvertisementService {
    Result add(JobAdvertisement jobAdvertisement);
    DataResult<List<JobAdvertisement>> findByActivatedTrue();
    DataResult<List<JobAdvertisement>> getAllDeadline();
    DataResult<List<JobAdvertisement>> findByJobAdvertisementEmployer(int employerId);
    Result update(JobAdvertisement jobAdvertisement);

}
