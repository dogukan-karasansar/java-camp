import bussiness.concretes.UserManager;
import core.GoogleSignUpAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        User engin = new User(1, "Engin", "Demirog", "engin@gmail.com", "1234567", false);
        UserManager manager = new UserManager(new HibernateUserDao(), new GoogleSignUpAdapter());
        manager.add(engin);
    }
}
