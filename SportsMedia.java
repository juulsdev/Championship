/**
 * The Class SportsMedia.
 */
public class SportsMedia implements MassMedia {
	/** Static instance of the singleton. */
	private Logger logger = Logger.getInstance();

	/** The name. */
	private String name;

	/**
	 * Instantiates a new sports media.
	 *
	 * @param name the name
	 */
	public SportsMedia(String name) {
		super();
		this.name = name;
	}

	/**
	 * Send data.
	 *
	 * @param matchdata the matchdata
	 */
	@Override
	public void sendData(MatchData matchdata) {
		logger.write("@@@@@@ El medio deportivo " + name + " destaca que en el campeonato " + matchdata.getName()
				+ " en la ronda " + matchdata.getRound() + " se ha impuesto " + matchdata.getWinner().getName()
				+ " que ocupa la posición " + matchdata.getWinner().getRanking() + " en el ranking" + " a "
				+ matchdata.getLoser().getName() + " que ocupa la posición " + matchdata.getLoser().getRanking()
				+ " con un marcador de " + matchdata.getWinner().getAccumulatedPoints() + "-"
				+ matchdata.getLoser().getAccumulatedPoints());

	}

}
