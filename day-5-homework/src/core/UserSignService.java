package core;

import entities.concretes.User;

public interface UserSignService {
    void login(User user);
    void register(User user);
}
