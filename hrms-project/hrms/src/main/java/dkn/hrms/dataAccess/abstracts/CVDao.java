package dkn.hrms.dataAccess.abstracts;

import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.entities.concretes.CV;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CVDao extends JpaRepository<CV, Integer> {
    List<CV> findByJobSeekerId(int jobSeekerId);
    List<CV> getById(int id);
}
