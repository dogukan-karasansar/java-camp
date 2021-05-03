public class SalesManager implements SalesInterface{
    @Override
    public void gamesPurchased(Gamer gamer, Game game) {
       Utilities.sales(gamer, game, null);
    }

    @Override
    public void gamesPurchased(Gamer gamer, Game game, Campaign campaign) {
        Utilities.sales(gamer, game, campaign);
    }
}
