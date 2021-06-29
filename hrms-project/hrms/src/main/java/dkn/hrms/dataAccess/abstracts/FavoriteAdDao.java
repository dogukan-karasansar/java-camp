package dkn.hrms.dataAccess.abstracts;

import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.FavoriteAd;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteAdDao extends JpaRepository<FavoriteAd, Integer> {
    List<FavoriteAd> findByJobSeekerId(int jobSeekerId);
    FavoriteAd findByJobAdvertisementIdAndJobSeekerId(int jobAdvertisementId, int jobSeekerId);
}
