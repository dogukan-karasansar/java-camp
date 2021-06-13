package kodlamaIO.business.abstracts;

import kodlamaIO.core.entities.User;
import kodlamaIO.core.utilities.results.DataResult;
import kodlamaIO.core.utilities.results.Result;

public interface UserService {
    Result add(User user);
    DataResult<User> findByEmail(String email);
}
