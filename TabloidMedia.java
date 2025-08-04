/**
 * The Class TabloidMedia.
 */
public class TabloidMedia implements MassMedia {

    /** Static instance of the singleton. */
    private Logger logger = Logger.getInstance();
    /** The name. */
    private String name;

    /**
     * Instantiates a new tabloid media.
     *
     * @param name the name
     */
    public TabloidMedia(String name) {
        super();
        this.name = name;
    }

    /**
     * Gets the difference of positions in the ranking between the two tennis
     * players.
     *
     * @param matchdata the matchdata
     * @return the ranking
     */
    private int getRanking(MatchData matchdata) {
        return matchdata.getWinner().getRanking() - matchdata.getLoser().getRanking();
    }

    /**
     * Send data.
     *
     * @param matchdata the matchdata
     */
    @Override
    public void sendData(MatchData matchdata) {
        if (matchdata.getWinner().getRanking() > 3 && matchdata.getLoser().getRanking() <= 3)
            logger.write(
                "@@@@@@ El medio sensacionalista " + name + " destaca en Deportes que ha habido sorpresa en el "
                + matchdata.getName() + " en la ronda " + matchdata.getRound() + " porque se ha impuesto "
                + matchdata.getWinner().getName() + " a " + matchdata.getLoser().getName()
                + " cuando les separan " + getRanking(matchdata) + " puestos en el ranking.");
    }

}
