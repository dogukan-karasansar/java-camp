package googleSignServices;

import entities.concretes.User;

public class GoogleSignManager {
    public void login(User user) {
        System.out.println(user.getEmail() + " Kullanıcısı google ile giriş yaptı");
    }

    public void register(User user) {
        System.out.println(user.getEmail() + " Kullanıcısı google ile kayıt oldu");
    }
}
