package bussiness.concretes;

import bussiness.abstracts.UserService;
import core.UserSignService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserManager implements UserService {
    private List<User> users = new ArrayList<User>();
    private UserDao userDao;
    private UserSignService userSignService;

    private static final Pattern ptr = Pattern.compile("^(.+)@(.+)$");
    private Scanner input = new Scanner(System.in);

    public UserManager(UserDao userDao, UserSignService userSignService) {
        this.userDao = userDao;
        this.userSignService = userSignService;
    }

    @Override
    public void add(User user) {
        for(User usr : users) {
            if(usr.getEmail().equals(user.getEmail())){
                System.out.println("Bu email daha önce kayıt edilmiş");
                return;
            }
        }

        if(!ptr.matcher(user.getEmail()).matches()) {
            System.out.println("Hatalı tipde email girişi");
            return;
        } else if(user.getPassword().length() < 6) {
            System.out.println("Girilen şifre en az 6 karakterden oluşmalı");
            return;
        } else if(user.getFirstName().length() < 2 && user.getLastName().length() < 2) {
            System.out.println("ad ve soyad en az 2 karakterden oluşmalı");
            return;
        } else {
            System.out.print("Emailinize gelen postayı onaylayın: ");
            String onay = input.next().toLowerCase(Locale.ROOT);
            if (onay.equals("onay")) {
                user.setVerified(true);
            } else {
                user.setVerified(false);
            }
            if (user.isVerified()) {
                userDao.add(user);
                userSignService.register(user);
                System.out.println("Üyeliğiniz gerçekleşti");
            } else {
                System.out.println("Önce mailinizi onaylayın");
                return;
            }
        }
    }

    @Override
    public void login(User user) {
        userSignService.login(user);
        System.out.println("Giriş Yaptınız");
    }

    @Override
    public void logOut(User user) {
        System.out.println(user.getFirstName() + " Çıkış yaptınız");
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı Silindi");
    }

    @Override
    public void update(User user) {
        System.out.println("Kullanıcı Güncellendi");
    }

    @Override
    public User get(int id) {
        for (User user : users) {
            System.out.println("Hoşgeldin, " + user.getFirstName());
        }
        return null;
    }
}
