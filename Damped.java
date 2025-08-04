/**
 * The Class Damped.
 */
public class Damped extends Shoes {

	/**
	 * Constructor for objects of class Damped.
	 *
	 * @param model  the model
	 * @param number the number
	 * @param value  the value
	 */
	public Damped(String model, int number, double value) {
		super(model, number, value);
	}

	/**
	 * Calculate serve value.
	 *
	 * @return the double
	 */
	@Override
	public double calculateServeValue() {
		return super.calculateServeValue() * 1.8;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "ZapatillasAmortiguadas [modelo=" + model + ", número=" + number + ", valor=" + value + "]";

	}

}
