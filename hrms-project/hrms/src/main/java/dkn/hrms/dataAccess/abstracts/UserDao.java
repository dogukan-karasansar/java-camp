package dkn.hrms.dataAccess.abstracts;

import dkn.hrms.core.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
