package dkn.hrms.core.utilities.adapters.abstracts;

import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.dataAccess.abstracts.UserDao;
import dkn.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;

public interface EmailVerifyService {
    boolean verifyMail(User user);
}
