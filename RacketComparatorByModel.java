import java.util.Comparator;

public class RacketComparatorByModel implements Comparator<Racket> {

	@Override
	public int compare(Racket o1, Racket o2) {
		return o1.getModel().compareTo(o2.getModel());

	}

}
