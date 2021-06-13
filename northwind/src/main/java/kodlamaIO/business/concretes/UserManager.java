package kodlamaIO.business.concretes;

import kodlamaIO.business.abstracts.UserService;
import kodlamaIO.core.dataAccess.UserDao;
import kodlamaIO.core.entities.User;
import kodlamaIO.core.utilities.results.DataResult;
import kodlamaIO.core.utilities.results.Result;
import kodlamaIO.core.utilities.results.SuccessDataResult;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {
    private UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessDataResult<User>("EKLENDİ");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findByEmail(email), "Datalar Listelendi");
    }
}
