package dkn.hrms.core.utilities.adapters.abstracts;

import dkn.hrms.core.entities.concretes.User;

public interface EmailVerifyService {
    boolean verifyMail(User user);
}
