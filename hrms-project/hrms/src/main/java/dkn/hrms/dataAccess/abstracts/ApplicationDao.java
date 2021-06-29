package dkn.hrms.dataAccess.abstracts;

import dkn.hrms.entities.concretes.Applitaion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicationDao extends JpaRepository<Applitaion, Integer> {
    List<Applitaion> findByJobAdvertisementId(int jobAdvertisementId);
}
