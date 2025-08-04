/**
 * My custom exception class.
 */
public class RacketException extends Exception {

	public RacketException() {
		super("***** No se puede iniciar el Campeonato: " + Championship.getInstance().getName()
				+ " por falta de raquetas para los/as competidores");
	}

}
