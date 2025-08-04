
import java.util.ArrayList;
import java.util.List;

/**
 * The Abstract Class Notifier.
 */
public abstract class Notifier implements NotifierInterface {

    /** The MassMedia list. */
    private List<MassMedia> massmedia;

    /**
     * Instantiates a new notifier.
     */
    protected Notifier() {
        massmedia = new ArrayList<MassMedia>();
    }

    /**
     * Notify mass medias.
     *
     * @param matchdata the matchdata
     */
    @Override
    public void notifyMassMedias(MatchData matchdata) {
        for (MassMedia mass : massmedia)
            mass.sendData(matchdata);
    }

    /**
     * Subscribe a new object of type massmedia to the massmedia list.
     *
     * @param obj the obj
     */
    @Override
    public void suscribe(MassMedia obj) {
        massmedia.add(obj);

    }

    /**
     * Unsuscribe a new object of type massmedia to the massmedia list.
     *
     * @param obj the obj
     */
    @Override
    public void unsuscribe(MassMedia obj) {
        massmedia.remove(obj);
    }

}
