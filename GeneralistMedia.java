/**
 * The Class GeneralistMedia.
 */
public class GeneralistMedia implements MassMedia {
	/** Static instance of the singleton. */
	private Logger logger = Logger.getInstance();

	/** The name. */
	private String name;

	/**
	 * Instantiates a new generalist media.
	 *
	 * @param name the name
	 */
	public GeneralistMedia(String name) {
		super();
		this.name = name;
	}

	/**
	 * Gets the difference in points between the tennis players.
	 *
	 * @param matchdata the matchdata
	 * @return the difference points
	 */
	private double getDifferencePoints(MatchData matchdata) {
		return matchdata.getWinner().getAccumulatedPoints() - matchdata.getLoser().getAccumulatedPoints();
	}

	/**
	 * Send data.
	 *
	 * @param matchdata the matchdata
	 */
	@Override
	public void sendData(MatchData matchdata) {
		if (matchdata.getWinner().getRanking() <= 2 || matchdata.getLoser().getRanking() <= 2)
			logger.write("@@@@@@ El medio generalista " + name + " destaca en Deportes que en el " + matchdata.getName()
					+ " en la ronda " + matchdata.getRound() + " se ha impuesto " + matchdata.getWinner().getName()
					+ " a " + matchdata.getLoser().getName() + " por una diferencia de "
					+ getDifferencePoints(matchdata) + " puntos.");
	}

}
