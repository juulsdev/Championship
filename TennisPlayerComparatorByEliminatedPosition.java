
import java.util.Comparator;

public class TennisPlayerComparatorByEliminatedPosition implements Comparator<TennisPlayer> {

    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        int result = Integer.compare(o1.getEliminatedPosition(), o2.getEliminatedPosition());

        if (result == 0) {
            result = o1.getName().compareTo(o2.getName());
        }

        return result;
    }

}
