 /**
 * The Class WithGrip.
 */
public class WithGrip extends Shoes {

	/**
	 * Constructor for objects of class WithGrip.
	 *
	 * @param model  the model
	 * @param number the number
	 * @param value  the value
	 */
	public WithGrip(String model, int number, double value) {
		super(model, number, value);
	}

	/**
	 * Calculate remainder value.
	 *
	 * @return the double
	 */
	@Override
	public double calculateRemainderValue() {
		return super.calculateRemainderValue() * 1.7;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "ZapatillasConAgarre [modelo=" + model + ", número=" + number + ", valor=" + value + "]";

	}
}
