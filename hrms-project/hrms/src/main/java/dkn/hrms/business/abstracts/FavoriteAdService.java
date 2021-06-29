package dkn.hrms.business.abstracts;

import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.FavoriteAd;

import java.util.List;

public interface FavoriteAdService {
    DataResult<List<FavoriteAd>> findByJobSeekerId(int jobSeekerId);
    Result findByJobAdvertisementIdAndJobSeekerId(int jobAdvertisementId, int jobSeekerId);
    Result add(FavoriteAd favoriteAd);
}
