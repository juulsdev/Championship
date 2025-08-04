 

import java.util.Iterator;
import java.util.Set;

/**
 * The Class VolleyerPlayer.
 */
public class VolleyerPlayer extends TennisPlayer {

	/**
	 * Instantiates a new volleyer player.
	 *
	 * @param name       the name
	 * @param shoes      the shoes
	 * @param serve      the serve
	 * @param remain     the remain
	 * @param ranking    the ranking
	 * @param country    the country
	 * @param shoeNumber the shoe number
	 */
	public VolleyerPlayer(String name, Shoes shoes, double serve, double remain, int ranking, String country,
			int shoeNumber) {
		super(name, shoes, serve, remain, ranking, country, shoeNumber);
	}

	/**
	 * He gets the first available racket that has a speed greater than his own and
	 * he will exchange his racket for that racket and is eliminated from the
	 * Championship (if there is no one with a higher speed, he will keep the same
	 * racket).
	 *
	 * @return true, if successful
	 */
	@Override
	protected boolean changeRacket() {
		Set<Racket> championshipRackets = Championship.getInstance().getChampionshipRackets();
		Iterator<Racket> ra = championshipRackets.iterator();
		boolean enc = false;
		while (ra.hasNext() && !enc) {
			Racket racket = ra.next();
			if (racket.calculateSpeed() > this.getRacket().calculateSpeed()) {
				this.setRacket(racket);
				enc = true;
				championshipRackets.remove(racket);
			}
		}
		return enc;
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
		return "    ** Tenista (Voleadores) [nombre=" + name + ", saque=" + serve + ", resto=" + remain + ", ranking="
				+ ranking + ", pais=" + country + ", número pie=" + shoeNumber + "]" + "\n" + "       "
				+ shoes.toString() + "\n" + racket.toString();
	}
}
