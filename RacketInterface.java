/**
 * The Interface Racket.
 */
public interface RacketInterface {

    /**
     * Calculate control.
     *
     * @return the double
     */
    double calculateControl();

    /**
     * Calculate power.
     *
     * @return the double
     */
    double calculatePower();

    /**
     * Calculate speed.
     *
     * @return the double
     */
    double calculateSpeed();

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    String toString();

}
