public class Gamer extends User{
    private int gamesPurchased;
    private double cash;

    public int getGamesPurchased() {
        return gamesPurchased;
    }

    public void setGamesPurchased(int gamesPurchased) {
        this.gamesPurchased = gamesPurchased;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
