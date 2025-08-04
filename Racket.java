
import java.util.HashMap;
import java.util.Map;

/**
 * The Class GenericRacket.
 */
public abstract class Racket implements RacketInterface {

    /** The hmhead size. */
    private static Map<Double, Integer> hmheadSize;

    /** The hmlength. */
    protected static Map<Double, Integer> hmlength;

    /** The hmweight. */
    protected static Map<Double, Integer> hmweight;

    /** The head size. */
    protected double headSize;

    /** The length. */
    protected double length;

    /** The model. */
    protected String model;

    /** The stringing style. */
    protected StringingStyle stringingStyle;

    /** The weight. */
    protected double weight;

    /**
     * Instantiates a new generic racket.
     *
     * @param model          the model
     * @param weight         the weight
     * @param length         the length
     * @param headSize       the head size
     * @param stringingStyle the stringing style
     */
    public Racket(String model, double weight, double length, double headSize, StringingStyle stringingStyle) {
        this.model = model;
        this.weight = weight;
        this.length = length;
        this.headSize = headSize;
        this.stringingStyle = stringingStyle;
    }

    /**
     * Initialize maps.
     */
    public static void initializeMaps() {

        hmweight = new HashMap<Double, Integer>();

        hmlength = new HashMap<Double, Integer>();

        hmheadSize = new HashMap<Double, Integer>();

        hmweight.put(220.0, 10);
        hmweight.put(260.0, 8);
        hmweight.put(300.0, 6);
        hmweight.put(320.0, 4);
        hmweight.put(340.0, 2);

        hmlength.put(680.0, 2);
        hmlength.put(690.0, 4);
        hmlength.put(700.0, 6);
        hmlength.put(720.0, 8);
        hmlength.put(740.0, 10);

        hmheadSize.put(600.0, 10);
        hmheadSize.put(630.0, 8);
        hmheadSize.put(650.0, 6);
        hmheadSize.put(680.0, 4);
        hmheadSize.put(720.0, 2);
    }

    /**
     * Calculate control.
     *
     * @return the double
     */
    @Override
    public double calculateControl() {
        return hmheadSize.get(this.headSize);
    }

    /**
     * Calculate power.
     *
     * @return the double
     */
    @Override
    public double calculatePower() {
        return hmlength.get(this.length);
    }

    /**
     * Calculate speed.
     *
     * @return the double
     */
    @Override
    public double calculateSpeed() {
        return hmweight.get(this.weight);
    }

    /**
     * Gets the head size.
     *
     * @return the head size
     */
    public double getHeadSize() {
        return headSize;
    }

    /**
     * Gets the length.
     *
     * @return the length
     */
    public double getLength() {
        return length;
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
     * Gets the stringing style.
     *
     * @return the stringing style
     */
    public StringingStyle getStringingStyle() {
        return stringingStyle;
    }

    /**
     * Gets the weight.
     *
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the head size.
     *
     * @param headSize the new head size
     */
    public void setHeadSize(double headSize) {
        this.headSize = headSize;
    }

    /**
     * Sets the length.
     *
     * @param length the new length
     */
    public void setLength(double length) {
        this.length = length;
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
     * Sets the stringing style.
     *
     * @param stringingStyle the new stringing style
     */
    public void setStringingStyle(StringingStyle stringingStyle) {
        this.stringingStyle = stringingStyle;
    }

    /**
     * Sets the weight.
     *
     * @param weight the new weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "GenericRacket [model=" + model + ", stringingStyle=" + stringingStyle + "]";
    }

}
