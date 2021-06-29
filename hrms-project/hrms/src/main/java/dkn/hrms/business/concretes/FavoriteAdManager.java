package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.FavoriteAdService;
import dkn.hrms.core.utilities.results.*;
import dkn.hrms.dataAccess.abstracts.FavoriteAdDao;
import dkn.hrms.entities.concretes.FavoriteAd;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteAdManager implements FavoriteAdService {

    private FavoriteAdDao favoriteAdDao;

    public FavoriteAdManager(FavoriteAdDao favoriteAdDao) {
        this.favoriteAdDao = favoriteAdDao;
    }

    @Override
    public DataResult<List<FavoriteAd>> findByJobSeekerId(int jobSeekerId) {
        return new SuccessDataResult<List<FavoriteAd>>(this.favoriteAdDao.findByJobSeekerId(jobSeekerId), "Data Listelendi");
    }

    @Override
    public Result findByJobAdvertisementIdAndJobSeekerId(int jobAdvertisementId, int jobSeekerId) {
        FavoriteAd favoriteAd = this.favoriteAdDao.findByJobAdvertisementIdAndJobSeekerId(jobAdvertisementId, jobSeekerId);
        if (favoriteAd != null) {
            return new SuccessResult();
        } else {
            return new ErrorResult();
        }
    }

    @Override
    public Result add(FavoriteAd favoriteAd) {
        this.favoriteAdDao.save(favoriteAd);
        return new SuccessResult("favorilere eklendi");
    }
}
