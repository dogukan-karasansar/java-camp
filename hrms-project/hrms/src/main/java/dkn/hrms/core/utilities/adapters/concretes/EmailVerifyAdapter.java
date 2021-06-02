package dkn.hrms.core.utilities.adapters.concretes;

import dkn.hrms.core.utilities.adapters.abstracts.EmailVerifyService;
import dkn.hrms.core.entities.concretes.User;
import org.springframework.stereotype.Service;

@Service
public class EmailVerifyAdapter implements EmailVerifyService {

    @Override
    public boolean verifyMail(User user) {
        user.setEmailVerified(true);
        if (user.isEmailVerified()) {
            return true;
        } else {
            return false;
        }
    }
}
