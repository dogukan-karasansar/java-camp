package dkn.hrms.business.concretes;

import dkn.hrms.business.abstracts.UserService;
import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.core.utilities.results.SuccessDataResult;
import dkn.hrms.core.utilities.results.SuccessResult;
import dkn.hrms.dataAccess.abstracts.UserDao;
import dkn.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>(this.userDao.findAll(), "Kullanıcılar başarıyla listelendi");
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult();
    }
}
