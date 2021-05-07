package bussiness.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void login(User user);
    void logOut(User user);
    void delete(User user);
    void update(User user);
    User get(int id);
}
