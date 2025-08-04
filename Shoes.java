
/**
 * The Class Shoes.
 */
public abstract class Shoes implements ShoesInterface {

    /** The model. */
    protected String model;

    /** The number. */
    protected double number;

    /** The value. */
    protected double value;

    /**
     * Instantiates a new shoes.
     *
     * @param model  the model
     * @param number the number
     * @param value  the value
     */
    public Shoes(String model, double number, double value) {
        this.model = model;
        this.number = number;
        this.value = value;
    }

    /**
     * Returns the value of the rest of said shoes when this action is invoked from
     * the tennis player's remainder method
     * 
     * @return the remainder value
     */
    public double calculateRemainderValue() {
        return this.value * 1.3;

    }

    /**
     * Returns the serve value of said shoes when this action is invoked from the
     * player's serve method.
     * 
     * @return the serve value
     */
    public double calculateServeValue() {
        return this.value * 1.2;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * Gets the number.
     *
     * @return the number
     */
    public double getNumber() {
        return number;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the model.
     *
     * @param model the new model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Sets the number.
     *
     * @param number the new number
     */
    public void setNumber(double number) {
        this.number = number;
    }

    /**
     * Sets the value.
     *
     * @param value the new value
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "Zapatillas [modelo=" + model + ", número=" + number + ", valor=" + value + "]";

    }

}
