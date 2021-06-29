package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.JobAdvertisementService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.core.utilities.results.SuccessDataResult;
import dkn.hrms.core.utilities.results.SuccessResult;
import dkn.hrms.dataAccess.abstracts.JobAdvertisementDao;
import dkn.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

    private JobAdvertisementDao jobAdvertisementDao;

    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("İş ilanı eklendi");
    }

    @Override
    public DataResult<List<JobAdvertisement>> findByActivatedTrue() {
        return new SuccessDataResult(this.jobAdvertisementDao.findByActivatedTrueOrderByIdDesc(),"Aktif ilanlar listelendi");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllDeadline() {
        Sort sort = Sort.by(Sort.Direction.ASC, "applicationDeadline");
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort));
    }

    @Override
    public DataResult<List<JobAdvertisement>> findByJobAdvertisementEmployer(int employerId) {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findByEmployerIdOrderByIdDesc(employerId), "Datalar listelendi");
    }

    @Override
    public Result update(JobAdvertisement jobAdvertisement) {
        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("İlan Güncellendi");
    }

    @Override
    public DataResult<JobAdvertisement> jobAdvertisement(int id) {
        return new SuccessDataResult<JobAdvertisement>(this.jobAdvertisementDao.findJobAdvertisementById(id), "Data Listelendi");
    }
}
