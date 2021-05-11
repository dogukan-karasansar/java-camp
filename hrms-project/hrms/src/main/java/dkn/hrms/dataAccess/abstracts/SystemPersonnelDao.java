package dkn.hrms.dataAccess.abstracts;

import dkn.hrms.entities.concretes.SystemPersonnel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemPersonnelDao extends JpaRepository<SystemPersonnel, Integer> {
}
