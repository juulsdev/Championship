
import java.util.Comparator;

public class RacketComparatorByPower implements Comparator<Racket> {

    @Override
    public int compare(Racket o1, Racket o2) {
        int result = Double.compare(o1.calculatePower(), o2.calculatePower());
        if (result == 0) {
            result = o1.getModel().compareTo(o2.getModel());
        }
        return result;
    }

}
