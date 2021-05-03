public class Utilities {
    public static void checkUser(User user) {
        if (user.getFirstName().equals("Doğukan")) {
            System.out.println("Hoşgeldin, " + user.getFirstName());
        } else {
            System.out.println("isim hatalı!");
        }
    }

    public static void sales(Gamer gamer, Game game, Campaign campaign) {
        Sale sale = new Sale();
        sale.setGamer(gamer);
        sale.setGame(game);
        sale.setCampaign(campaign);
        gamer.setGamesPurchased(gamer.getGamesPurchased() + 1);
        StringBuilder invoice = new StringBuilder();
        invoice.append("**********JAVA FATURA**********\n");
        invoice.append("Satın Alan Oyuncu: " + sale.getGamer().getFirstName() + " " + sale.getGamer().getLastName()+"\n");
        invoice.append("Oyunun Adı: " + sale.getGame().getName()+"\n");
        invoice.append("Kampanyada Uygulanan İndirim: "+(sale.getGame().getPrice() * sale.getCampaign().getPercentOfDiscount())/100+"₺\n");
        invoice.append("İndirimsiz Fiyatı: "+sale.getGame().getPrice()+"₺\n");
        invoice.append("Tutar: "+sale.getPrice()+"₺");
        System.out.println(invoice);
    }
}
