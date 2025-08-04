
/**
 * The Class MatchData.
 */
public class MatchData {

    /** The loser. */
    private TennisPlayer loser;

    /** The name. */
    private String name;

    /** The round. */
    private int round;

    /** The winner. */
    private TennisPlayer winner;

	
    /**
     * Instantiates a new match data.
     *
     * @param winner the winner
     * @param loser the loser
     * @param name the name
     * @param round the round
     */
    public MatchData(TennisPlayer winner, TennisPlayer loser, String name, int round) {
        super();
        this.winner = winner;
        this.loser = loser;
        this.name = name;
        this.round = round;
    }

    /**
     * Gets the loser.
     *
     * @return the loser
     */
    public TennisPlayer getLoser() {
        return loser;
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
     * Gets the round.
     *
     * @return the round
     */
    public int getRound() {
        return round;
    }

    /**
     * Gets the winner.
     *
     * @return the winner
     */
    public TennisPlayer getWinner() {
        return winner;
    }

    /**
     * Sets the loser.
     *
     * @param loser the new loser
     */
    public void setLoser(TennisPlayer loser) {
        this.loser = loser;
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
     * Sets the round.
     *
     * @param round the new round
     */
    public void setRound(int round) {
        this.round = round;
    }

    /**
     * Sets the winner.
     *
     * @param winner the new winner
     */
    public void setWinner(TennisPlayer winner) {
        this.winner = winner;
    }

	
}
