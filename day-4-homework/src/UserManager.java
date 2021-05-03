public class UserManager implements UserInterface {
    @Override
    public void login(User user) {
        Utilities.checkUser(user);
    }

    @Override
    public void register(User user) {
        System.out.println("Kayıt Başarıyla Gerçekleştirildi");
    }

    @Override
    public void logOut(User user) {
        System.out.println("Çıkış Yaptınız");
    }

    @Override
    public void updated(User user) {
        System.out.println("Bilgileriniz Güncellendi");
    }

    @Override
    public void deleteAcount(User user) {
        System.out.println("Hesabınız Silindi");
    }
}
