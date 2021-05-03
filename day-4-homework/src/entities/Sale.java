package entities;

public class Sale {
    private int id;
    private Game game;
    private Gamer gamer;
    private double price;
    private Campaign campaign;

    public Sale() {
    }

    public Sale(int id, Game game, Gamer gamer, double price, Campaign campaign) {
        this.setId(id);
        this.setGame(game);
        this.setGamer(gamer);
        this.setPrice(price);
        this.setCampaign(campaign);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Gamer getGamer() {
        return gamer;
    }

    public void setGamer(Gamer gamer) {
        this.gamer = gamer;
    }

    public double getPrice() {
        price = game.getPrice() - ((game.getPrice() * campaign.getPercentOfDiscount()) / 100);
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }
}
