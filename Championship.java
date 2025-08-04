
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * The Class Championship.
 */
public class Championship extends Notifier {

    /** Static instance of the singleton. */
    private Logger logger = Logger.getInstance();

    /** Static instance of singleton */
    private static Championship instance = null;

    /** The tennis player competitors. */
    private List<TennisPlayer> competitors;

    /** The tennis player eliminated. */
    private Set<TennisPlayer> eliminated;

    /** The name. */
    private String name;

    /** The championship rackets. */
    private Set<Racket> rackets;

    /** The championship shoes. */
    private List<Shoes> shoes;

    /**
     * Gets the single instance of Championship.
     *
     * @return single instance of Championship
     */
    public static Championship getInstance() {
        if (instance == null)
            instance = new Championship();
        return instance;
    }

    /**
     * Instantiates a new championship.
     */
    private Championship() {
        super();
        shoes = new ArrayList<Shoes>();
        rackets = new TreeSet<Racket>(new RacketComparatorByPower().reversed());
        competitors = new ArrayList<TennisPlayer>();
        eliminated = new TreeSet<TennisPlayer>(new TennisPlayerComparatorByEliminatedPosition());
    }

    /**
     * A racket will be selected from the list championshipRackets and will be
     * assigned to the first tennis player on the list of competitors.
     *
     * @throws RacketException if does not have enough rackets
     */
    public void assignRackets() throws RacketException {
        if (competitors.size() > rackets.size())
            throw new RacketException();

        Iterator<TennisPlayer> te = competitors.iterator();
        Iterator<Racket> ra = rackets.iterator();
        while (te.hasNext() && ra.hasNext()) {
            TennisPlayer tennisplayer = te.next();
            Racket racket = ra.next();
            tennisplayer.setRacket(racket);
            showAssignRackets(tennisplayer);
            ra.remove();
        }
    }

    /**
     * Execute the tennis player game method and show on the screen if the tennis
     * player invoking the method changes racket or not.
     *
     * @param t1 the tennisplayer 1
     * @param t2 the tennisplayer 2
     */
    private void playAndChange(TennisPlayer t1, TennisPlayer t2) {
        if (t1.play(t2))
            showMessageChangeRacket(t1);
        else
            showMessageNoChangeRacket(t1);
    }

    /**
     * Enroll a tennis player.
     *
     * @param tennisplayer the tennisplayer
     */
    public void enroll(TennisPlayer tennisplayer) {
        competitors.add(tennisplayer);
    }

    /**
     * Gets the championship rackets.
     *
     * @return the championship rackets
     */
    public Set<Racket> getChampionshipRackets() {
        return rackets;
    }

    /**
     * Gets the championship shoes.
     *
     * @return the championship shoes
     */
    public List<Shoes> getChampionshipShoes() {
        return shoes;
    }

    /**
     * Gets the championship competitors.
     *
     * @return the championship competitors
     */
    public List<TennisPlayer> getChampionshipCompetitors() {
        return competitors;
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
     * Return the number of competitors.
     *
     * @return the number of competitors
     */
    public int getNumberOfCompetitors() {
        return competitors.size();
    }

    /**
     * Return the number of rackets.
     *
     * @return the number of rackets
     */
    public int getNumberOfRacket() {
        return rackets.size();
    }

    /**
     * Return the number of shoes.
     *
     * @return the number of shoes
     */
    public int getNumberOfShoes() {
        return shoes.size();
    }

    /**
     * Executes the match in which the serve and remainder values are calculated.
     *
     * @param t1 the tennisplayer 1
     * @param t2 the tennisplayer 2
     */
    private void match(TennisPlayer t1, TennisPlayer t2) {

        showMessage(t1, 1);
        if (t1.chooseShoes())
            showAssignShoesMessage(t1);

        showMessage(t2, 2);
        if (t2.chooseShoes())
            showAssignShoesMessage(t2);

        playAndChange(t1, t2);
        playAndChange(t2, t1);
    }

    /**
     * Simulate a complete round calculating and calculating the results of the
     * tennis players.
     *
     * @param round the round
     */
    private void playRound(int round) {
        int matches = competitors.size() / 2;
        for (int i = 0; i < matches; i++) {
            TennisPlayer t1 = competitors.get(i);
            TennisPlayer t2 = competitors.get(competitors.size() - 1);
            logger.write("  #### Juego ----------->>>: " + i);
            match(t1, t2);
            results(t1, t2, i, round);
            resetAcummulatedPoints(t1, t2);
            logger.write("");
        }

    }

    /**
     * Add a racket to the racket set.
     *
     * @param racket the racket
     */
    public void racketSet(Racket racket) {
        rackets.add(racket);
    }

    /**
     * Reposition the players depending on whether they are a winner or a loser to
     * their corresponding data structure.
     *
     * @param winner the winner
     * @param loser  the loser
     * @param match  the match
     * @param round  the round
     */
    private void relocatePlayers(TennisPlayer winner, TennisPlayer loser, int match, int round) {
        eliminated.add(loser);
        competitors.set(match, winner);
        competitors.remove(competitors.size() - 1);
        notifyMassMedias(new MatchData(winner, loser, name, round));
        logger.write("    ## Gana este juego: " + winner.getName() + " con: " + winner.getAccumulatedPoints()
            + " puntos acumulados.");
        logger.write("    ## Se elimina: " + loser.getName() + " con: " + loser.getAccumulatedPoints()
            + " puntos acumulados. Tenista eliminado núm: " + eliminated.size());
        loser.setEliminatedPosition(eliminated.size());

    }

    /**
     * Resets the data introduced in the championship.
     */
    public void reset() {
        shoes = new ArrayList<Shoes>();
        rackets = new TreeSet<Racket>(new RacketComparatorByPower().reversed());
        competitors = new ArrayList<TennisPlayer>();
        eliminated = new TreeSet<TennisPlayer>(new TennisPlayerComparatorByEliminatedPosition());
    }

    /**
     * Reset acummulated points to play a new match.
     *
     * @param t1 the tennisplayer 1
     * @param t2 the tennisplayer 2
     */
    private void resetAcummulatedPoints(TennisPlayer t1, TennisPlayer t2) {
        t1.setAccumulatedPoints(0.0);
        t2.setAccumulatedPoints(0.0);
    }

    /**
     * Calculate the result of each player after playing the match.
     *
     * @param t1    the tennisplayer 1
     * @param t2    the tennisplayer 2
     * @param i     the match
     * @param round the round
     */
    private void results(TennisPlayer t1, TennisPlayer t2, int i, int round) {
        TennisPlayerComparatorByAcumulatedPoints comparator = new TennisPlayerComparatorByAcumulatedPoints();
        int result = comparator.compare(t1, t2);
        if (result > 0)
            relocatePlayers(t1, t2, i, round);
        else if (result < 0)
            relocatePlayers(t2, t1, i, round);
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
     * Add a shoe to the shoe list.
     *
     * @param shoe the shoe
     */
    public void shoesList(Shoes shoe) {
        shoes.add(shoe);
    }

    /**
     * Shows the information of the rackets and the tennis player to which they have
     * been assigned.
     *
     * @param tennisPlayer the tennis player
     */
    private void showAssignRackets(TennisPlayer tennisPlayer) {
        Racket racket = tennisPlayer.getRacket();
        logger.write("   **" + racket.toString() + " asignada a -->> " + tennisPlayer.getName());
    }

    /**
     * Shows the shoes assigned to the tennis player.
     *
     * @param player the player
     */
    private void showAssignShoesMessage(TennisPlayer player) {
        logger.write("       Zapatillas asignadas:     " + player.getShoes().toString());
    }

    /**
     * Show the championship and manage it.
     */
    public void showChampionship() {
        logger.write("***** Inicio del campeonato: " + name + " *****");
        logger.write("");
        logger.write("***** Asignando raquetas a tenistas *****");

        try {
            assignRackets();
            logger.write("");
            logger.write("***** Listado de competidores: ");

            for (TennisPlayer tennisPlayer : competitors) {
                logger.write(tennisPlayer.toString());
                logger.write("");
            }
            logger.write("");

            logger.write("***** Listado de raquetas disponibles: ");
            for (Racket racket : rackets)
                logger.write(racket.toString());

            logger.write("");

            int i = 1;
            while (competitors.size() > 1) {
                logger.write("***** Ronda---->>>: " + i);
                playRound(i);
                logger.write("");
                i++;
            }

            logger.write("---->>>>  Gana la competición: " + competitors.get(0).toString());
            logger.write("  <<<<----");
            logger.write("");

            logger.write("***** Listado de eliminados: ");
            for (TennisPlayer tennisPlayer : eliminated){
                logger.write(tennisPlayer.toString());
                logger.write("");
            }
        } catch (RacketException e) {
            logger.write(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Shows the name and class of the tennis player who is going to play.
     *
     * @param player the player
     * @param index  the index
     */
    private void showMessage(TennisPlayer player, int index) {
        logger.write("    ## Tenista" + index + " (" + player.getClass().getSimpleName() + ")" + "---->>>: "
            + player.getName());
    }

    /**
     * Show message change racket.
     *
     * @param player the player
     */
    private void showMessageChangeRacket(TennisPlayer player) {
        logger.write("       " + player.getName() + " cambia su raqueta por: "
            + player.getRacket().getClass().getSimpleName() + " modelo=" + player.getRacket().getModel()
            + " velocidad=" + player.getRacket().calculateSpeed());
    }

    /**
     * Show message no change racket.
     *
     * @param player the player
     */
    private void showMessageNoChangeRacket(TennisPlayer player) {
        logger.write("       " + player.getName() + " no cambia de raqueta");
    }

}
