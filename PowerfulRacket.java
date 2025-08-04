/**
 * The Class PowerfulRacket.
 */
public class PowerfulRacket extends Racket {

	/**
	 * Instantiates a new powerful racket.
	 *
	 * @param model the model
	 * @param weight the weight
	 * @param lenght the lenght
	 * @param headSize the head size
	 * @param stringingStyle the stringing style
	 */
	public PowerfulRacket(String model, double weight, double lenght, double headSize, StringingStyle stringingStyle) {
		super(model, weight, lenght, headSize, stringingStyle);
	}

	/**
	 * Calculate power.
	 *
	 * @return the double
	 */
	@Override
	public double calculatePower() {
		return super.calculatePower() * stringingStyle.getPower();
	}

	/**
	 * Calculate speed.
	 *
	 * @return the double
	 */
	@Override
	public double calculateSpeed() {
		return super.calculateSpeed() * 1.5;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return String.format("       %s(Encordado:%s)(MultiplicadorDePotencia:%s)(MultiplicadorDeControl:%s)"
				+ "\n	[modelo=%s" + "\n	longitud: %s,potencia asociada: %s"
				+ "\n	tamaño: %s,control asociado: %s" + "\n	peso: %s,velocidad Asociada: %s]",
				this.getClass().getSimpleName(), stringingStyle.name(), stringingStyle.getPower(),
				stringingStyle.getControl(), model, length, calculatePower(), headSize, calculateControl(), weight,
				calculateSpeed());
	}

}
