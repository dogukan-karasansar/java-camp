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
    private ValidatorManager validatorManager = new ValidatorManager();



    public UserManager(UserDao userDao, UserSignService userSignService) {
        this.userDao = userDao;
        this.userSignService = userSignService;
    }

    @Override
    public void add(User user) {
        if(!validatorManager.checkMail(user)) {
            System.out.println("Bu email daha önce kayıt edilmiş");
        }
        else if(!validatorManager.checkInvalidMail(user)) {
            System.out.println("Hatalı tipde email girişi");
        } else if(!validatorManager.checkPasswordLength(user)) {
            System.out.println("Girilen şifre en az 6 karakterden oluşmalı");
        } else if(!validatorManager.checkNameValid(user)) {
            System.out.println("ad ve soyad en az 2 karakterden oluşmalı");
        } else {

            if (validatorManager.checkVerified(user)) {
                userDao.add(user);
                userSignService.register(user);
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
