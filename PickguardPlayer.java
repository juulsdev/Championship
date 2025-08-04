
/**
 * The Class PickguardPlayer.
 */
public class PickguardPlayer extends TennisPlayer {

    /**
     * Instantiates a new pickguard player.
     *
     * @param name       the name
     * @param shoes      the shoes
     * @param serve      the serve
     * @param remain     the remain
     * @param ranking    the ranking
     * @param country    the country
     * @param shoeNumber the shoe number
     */
    public PickguardPlayer(String name, Shoes shoes, double serve, double remain, int ranking, String country,
    int shoeNumber) {
        super(name, shoes, serve, remain, ranking, country, shoeNumber);
    }

    /**
     * Calculate the tennis player's hit and accumulate it in the accumulated
     * points.
     */
    @Override
    public void hit() {
        double points = this.getAccumulatedPoints();
        points += 0.1 * (this.getRacket().calculateSpeed());
        this.setAccumulatedPoints(points);
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "    ** Tenista (Golpeadores) [nombre=" + name + ", saque=" + serve + ", resto=" + remain + ", ranking="
        + ranking + ", pais=" + country + ", número pie=" + shoeNumber + "]" + "\n" + "       "
        + shoes.toString() + "\n" + racket.toString();
    }
}
