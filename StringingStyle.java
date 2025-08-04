/**
 * The Enum StringingStyle.
 */
public enum StringingStyle {

    /** The abierto. */
    Abierto(2.0, 2.2),
    /** The cerrado. */
    Cerrado(1.8, 2.5);

    /** The control. */
    private final double control;

    /** The power. */
    private final double power;

    /**
     * Instantiates a new stringing style.
     *
     * @param power   the power
     * @param control the control
     */
    StringingStyle(double power, double control) {
        this.power = power;
        this.control = control;
    }

    /**
     * Gets the control.
     *
     * @return the control
     */
    public double getControl() {
        return control;
    }

    /**
     * Gets the power.
     *
     * @return the power
     */
    public double getPower() {
        return power;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "(Encordado:" + name() + ")(MultiplicadorDePotencia:" + power + ")(MultiplicadorDeControl:" + control
        + ")";
    }

}
