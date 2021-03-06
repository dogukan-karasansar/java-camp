package dkn.hrms.dataAccess.abstracts;

import dkn.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
    List<JobAdvertisement> findByActivatedTrueOrderByIdDesc();
    List<JobAdvertisement> findByEmployerIdOrderByIdDesc(int employerId);
    JobAdvertisement findJobAdvertisementById(int id);
}
