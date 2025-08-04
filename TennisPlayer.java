
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * The Class TennisPlayer.
 */
public abstract class TennisPlayer {

    /** The accumulated points. */
    private double accumulatedPoints;

    /** The country. */
    protected String country;

    /** The eliminated position. */
    private int eliminatedPosition;

    /** The name. */
    protected String name;

    /** The racket. */
    protected Racket racket;

    /** The ranking. */
    protected int ranking;

    /** The remain. */
    protected double remain;

    /** The serve. */
    protected double serve;

    /** The shoe number. */
    protected double shoeNumber;

    /** The shoes. */
    protected Shoes shoes;

    /**
     * Instantiates a new tennis player.
     *
     * @param name       the name
     * @param shoes      the shoes
     * @param serve      the serve
     * @param remain     the remain
     * @param ranking    the ranking
     * @param country    the country
     * @param shoeNumber the shoe number
     */
    public TennisPlayer(String name, Shoes shoes, double serve, double remain, int ranking, String country,
    double shoeNumber) {
        this.name = name;
        this.shoes = shoes;
        this.serve = serve;
        this.remain = remain;
        this.ranking = ranking;
        this.country = country;
        this.shoeNumber = shoeNumber;
        this.accumulatedPoints = 0.0;

    }

    /**
     * Adds the accumulated points.
     *
     * @param points the points
     */
    public void addAccumulatedPoints(double points) {
        this.accumulatedPoints += points;
    }

    /**
     * Calculate remainder.
     *
     * @return the double
     */
    public double calculateRemainder() {
        return remain * shoes.calculateRemainderValue() * racket.calculateControl() * racket.calculateSpeed();
    }

    /**
     * Calculate service.
     *
     * @return the serve value of a tennis player
     */
    public double calculateService() {
        return serve * shoes.calculateServeValue() * racket.calculatePower() * racket.calculateSpeed();
    }

    /**
     * Tennis players change their racket. To do this, they will get the first
     * available racket and exchange their racket for that racket (if one is not
     * available, they will keep the same racket)
     *
     * @return true, if successful
     */
    protected boolean changeRacket() {
        Set<Racket> championshipRackets = Championship.getInstance().getChampionshipRackets();
        Iterator<Racket> ra = championshipRackets.iterator();
        boolean enc = false;
        while (ra.hasNext() && !enc) {
            Racket racket = ra.next();
            this.setRacket(racket);
            enc = true;
            championshipRackets.remove(racket);
        }
        return enc;
    }

    /**
     * It will go through the list of sneakers that have exactly the same foot
     * number. When it find them,the tennisplayer will put them on and remove them
     * from the list, if he does not find them he will keep the ones he was wearing.
     *
     * @return true, if successful
     */
    public boolean chooseShoes() {
        List<Shoes> championshipShoes = Championship.getInstance().getChampionshipShoes();
        Iterator<Shoes> sh = championshipShoes.iterator();
        Shoes shoe;
        boolean hasChosen = false;
        while (sh.hasNext() && !hasChosen) {
            shoe = sh.next();
            if (this.getShoeNumber() == shoe.getNumber()) {
                setShoes(shoe);
                sh.remove();
                hasChosen = true;
            }
        }
        return hasChosen;
    }

    /**
     * Enroll a tennis player for the competition
     */
    public void enroll() {
        Championship.getInstance().enroll(this);
    }

    /**
     * Gets the accumulated points.
     *
     * @return the accumulated points
     */
    public double getAccumulatedPoints() {
        return accumulatedPoints;
    }

    /**
     * Gets the country.
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Gets the eliminated position.
     *
     * @return the eliminated position
     */
    public int getEliminatedPosition() {
        return eliminatedPosition;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the racket.
     *
     * @return the racket
     */
    public Racket getRacket() {
        return racket;
    }

    /**
     * Gets the ranking.
     *
     * @return the ranking
     */
    public int getRanking() {
        return ranking;
    }

    /**
     * Gets the serve.
     *
     * @return the serve
     */
    public double getServe() {
        return serve;
    }

    /**
     * Gets the shoe number.
     *
     * @return the shoe number
     */
    public double getShoeNumber() {
        return shoeNumber;
    }

    /**
     * Gets the shoes.
     *
     * @return the shoes
     */
    public Shoes getShoes() {
        return shoes;
    }

    /**
     * Calculate the tennis player's hit
     */
    public abstract void hit();

    /**
     * Calculate the tennis player's remainder and accumulate it in the accumulated
     * points.
     *
     * @param adversary the adversary
     * @return if the player has change the racket
     */
    public boolean play(TennisPlayer adversary) {
        service();
        adversary.remainder(this);
        hit();
        return changeRacket();
    }

    /**
     * Calculate the tennis player's remainder and accumulate it in the accumulated
     * points.
     *
     * @param adversary the adversary
     */
    private void remainder(TennisPlayer adversary) {
        double remaindervalue = this.calculateRemainder();

        if (remaindervalue > adversary.calculateService())
            addAccumulatedPoints(remaindervalue);
    }

    /**
     * Calculate the tennis player's serve and accumulate it in the accumulated
     * points.
     */
    private void service() {
        addAccumulatedPoints(calculateService());
    }

    /**
     * Sets the accumulated points.
     *
     * @param accumulatedPoints the new accumulated points
     */
    public void setAccumulatedPoints(double accumulatedPoints) {
        this.accumulatedPoints = accumulatedPoints;
    }

    /**
     * Sets the country.
     *
     * @param country the new country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Sets the eliminated position.
     *
     * @param eliminatedPosition the new eliminated position
     */
    public void setEliminatedPosition(int eliminatedPosition) {
        this.eliminatedPosition = eliminatedPosition;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the racket.
     *
     * @param racket the new racket
     */
    public void setRacket(Racket racket) {
        this.racket = racket;
    }

    /**
     * Sets the ranking.
     *
     * @param ranking the new ranking
     */
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    /**
     * Sets the serve.
     *
     * @param serve the new serve
     */
    public void setServe(double serve) {
        this.serve = serve;
    }

    /**
     * Sets the shoe number.
     *
     * @param shoeNumber the new shoe number
     */
    public void setShoeNumber(double shoeNumber) {
        this.shoeNumber = shoeNumber;
    }

    /**
     * Sets the shoes.
     *
     * @param shoes the new shoes
     */
    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "    ** Tenista [nombre=" + name + ", saque=" + serve + ", resto=" + remain + ", ranking=" + ranking
        + ", pais=" + country + ", número pie=" + shoeNumber + "]" + "\n" + "       " + shoes.toString() + "\n"
        + racket.toString();
    }

}
