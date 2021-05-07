package bussiness.concretes;

import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatorManager {
    private List<User> users = new ArrayList<User>();
    private static final Pattern ptr = Pattern.compile("^(.+)@(.+)$");
    private Scanner input = new Scanner(System.in);

    public boolean checkMail(User user) {
        for (User usr : users) {
            if (usr.getEmail().equals(user.getEmail())) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInvalidMail(User user) {
        if (!ptr.matcher(user.getEmail()).matches()) {
            return false;
        }
        return true;
    }

    public boolean checkPasswordLength(User user) {
        if (user.getPassword().length() < 6) {
            return false;
        }
        return true;
    }

    public boolean checkNameValid(User user) {
        if(user.getFirstName().length() < 2 && user.getLastName().length() < 2) {
            return false;
        }
        return true;
    }

    public boolean checkVerified(User user) {
        System.out.print("Emailinize gelen postayı onaylayın(onaylamak için onay yazın): ");
        String onay = input.next().toLowerCase(Locale.ROOT);
        if (onay.equals("onay")) {
            user.setVerified(true);
            System.out.println("Üyeliğiniz gerçekleşti");
            return true;
        } else {
            user.setVerified(false);
            return false;
        }
    }
}
