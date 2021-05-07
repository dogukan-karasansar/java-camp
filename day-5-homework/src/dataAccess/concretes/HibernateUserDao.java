package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    private List<User> users = new ArrayList<User>();

    @Override
    public void add(User user) {
        System.out.println(user.getEmail() + " Kullanıcısı Veri Tabanına Eklendi");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getEmail() + " Kullanıcısı Veri Tabanından Silindi");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getEmail() + " Kullanıcısı Verisi Güncellendi");
    }

    @Override
    public User get(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
