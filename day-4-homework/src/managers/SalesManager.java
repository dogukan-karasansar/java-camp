package managers;

import entities.Campaign;
import entities.Game;
import entities.Gamer;
import interfaces.SalesInterface;

public class SalesManager implements SalesInterface {
    @Override
    public void gamesPurchased(Gamer gamer, Game game) {
       Utilities.sales(gamer, game, null);
    }

    @Override
    public void gamesPurchased(Gamer gamer, Game game, Campaign campaign) {
        Utilities.sales(gamer, game, campaign);
    }
}
