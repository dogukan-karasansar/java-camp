package core;

import entities.concretes.User;
import googleSignServices.GoogleSignManager;

public class GoogleSignUpAdapter implements UserSignService {
    @Override
    public void login(User user) {
        GoogleSignManager google = new GoogleSignManager();
        google.login(user);
    }

    @Override
    public void register(User user) {
        GoogleSignManager google = new GoogleSignManager();
        google.register(user);
    }
}
