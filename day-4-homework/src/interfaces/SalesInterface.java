package interfaces;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface SalesInterface {
    void gamesPurchased(Gamer gamer, Game game);
    void gamesPurchased(Gamer gamer, Game game, Campaign campaign);
}
