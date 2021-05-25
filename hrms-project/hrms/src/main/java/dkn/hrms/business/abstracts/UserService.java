package dkn.hrms.business.abstracts;

import dkn.hrms.core.utilities.results.DataResult;
import dkn.hrms.core.utilities.results.Result;
import dkn.hrms.entities.concretes.User;

import java.util.List;

public interface UserService {
    DataResult<List<User>> getAll();
    Result add(User user);
}
