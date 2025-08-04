/**
 * The Class ControlledRacket.
 */
public class ControlledRacket extends Racket {

    /**
     * Instantiates a new controlled racket.
     *
     * @param model          the model
     * @param weight         the weight
     * @param lenght         the lenght
     * @param headSize       the head size
     * @param stringingStyle the stringing style
     */
    public ControlledRacket(String model, double weight, double lenght, double headSize,
    StringingStyle stringingStyle) {
        super(model, weight, lenght, headSize, stringingStyle);

    }

    /**
     * Calculate the control.
     *
     * @return the double
     */
    @Override
    public double calculateControl() {
        return super.calculateControl() * stringingStyle.getControl();
    }

    /**
     * Calculate the speed.
     *
     * @return the double
     */
    @Override
    public double calculateSpeed() {
        return super.calculateSpeed() * 1.2;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format(
            "       %s(Encordado:%s)(MultiplicadorDePotencia:%s)(MultiplicadorDeControl:%s)" + "\n	[modelo=%s"
            + "\n	longitud: %s,potencia asociada: %s" + "\n	tamaño: %s,control asociado: %s"
            + "\n	peso: %s,velocidad Asociada: %s]",
            this.getClass().getSimpleName(), stringingStyle.name(), stringingStyle.getPower(),
            stringingStyle.getControl(), model, length, calculatePower(), headSize, calculateControl(), weight,
            calculateSpeed());
    }

}
