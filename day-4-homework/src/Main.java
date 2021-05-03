public class Main {

    public static void main(String[] args) {
        Game game = new Game(1, "CALL OF DUTY", 500);

        UserManager user = new UserManager();
        User dkn = new User(1, "12345678910", "Doğukan", "Karasansasr", 2005);
        user.login(dkn);

        CampaignManager campaign = new CampaignManager();
        Campaign yeniKampanya = new Campaign(1, "Yeni Açılış", 20);

        GamerManager gamerManager = new GamerManager();
        Gamer gamer = new Gamer();
        gamer.setFirstName(dkn.getFirstName());
        gamer.setLastName(dkn.getLastName());
        gamer.setGamesPurchased(0);
        gamer.setCash(1000);
        gamerManager.add(gamer);


        SalesManager sale = new SalesManager();
        campaign.add(yeniKampanya);
        campaign.update(yeniKampanya);
        campaign.delete(yeniKampanya);
        sale.gamesPurchased(gamer, game, yeniKampanya);
    }
}
