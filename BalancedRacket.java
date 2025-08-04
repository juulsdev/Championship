/**
 * The Class BalancedRacket.
 */
public class BalancedRacket extends Racket {

    /** The control multiplier. */
    private double controlMultiplier;

    /** The power multiplier. */
    private double powerMultiplier;

    /**
     * Instantiates a new balanced racket.
     *
     * @param model the model
     * @param weight the weight
     * @param lenght the lenght
     * @param headSize the head size
     * @param stringingStyle the stringing style
     * @param powerMultiplier the power multiplier
     * @param controlMultiplier the control multiplier
     */
    public BalancedRacket(String model, double weight, double lenght, double headSize, StringingStyle stringingStyle,
    double powerMultiplier, double controlMultiplier) {
        super(model, weight, lenght, headSize, stringingStyle);
        this.powerMultiplier = powerMultiplier;
        this.controlMultiplier = controlMultiplier;
    }

    /**
     * Calculate the control.
     *
     * @return the double
     */
    @Override
    public double calculateControl() {
        return super.calculateControl() * controlMultiplier;
    }

    /**
     * Calculate the power.
     *
     * @return the double
     */
    @Override
    public double calculatePower() {
        return super.calculatePower() * powerMultiplier;
    }

    /**
     * Sets the stringing style.
     *
     * @param stringingStyle the new stringing style
     */
    @Override
    public void setStringingStyle(StringingStyle stringingStyle) {
        this.stringingStyle = stringingStyle;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("       %s(MultiplicadorDePotencia:%s)(MultiplicadorDeControl:%s)"
            + "\n	[modelo=%s" + "\n	longitud: %s,potencia asociada: %s"
            + "\n	tamaño: %s,control asociado: %s" + "\n	peso: %s,velocidad Asociada: %s]",
            this.getClass().getSimpleName(), powerMultiplier, controlMultiplier, model, length, calculatePower(),
            headSize, calculateControl(), weight, calculateSpeed());
    }

}
