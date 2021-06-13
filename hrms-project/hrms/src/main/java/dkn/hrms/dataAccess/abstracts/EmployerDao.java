package dkn.hrms.dataAccess.abstracts;

import dkn.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
    Employer findByUserId(int id);
}
