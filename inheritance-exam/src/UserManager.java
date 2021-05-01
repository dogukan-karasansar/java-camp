public class UserManager {
    public void login(User user) {
        if(user.getUsername() == "dkn" && user.getPassword() == "12345678") {
            System.out.println("Hoşgeldin, " + user.getName());
        } else {
            System.out.println("Hatalı Giriş");
        }
    }
}
