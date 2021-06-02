package dkn.hrms.dataAccess.abstracts;

import dkn.hrms.entities.concretes.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceDao extends JpaRepository<Experience, Integer> {
}
