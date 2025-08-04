
import java.util.Comparator;

public class TennisPlayerComparatorByAcumulatedPoints implements Comparator<TennisPlayer> {

    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        int result = Double.compare(o1.getAccumulatedPoints(), o2.getAccumulatedPoints());

        if (result == 0) {
            double sum1 = o1.calculateRemainder() + o1.calculateService();
            double sum2 = o2.calculateRemainder() + o2.calculateService();
            result = Double.compare(sum2, sum1);
        }

        return result;
    }

}
