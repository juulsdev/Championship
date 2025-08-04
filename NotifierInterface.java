
/**
 * **
 * The Interface Notifier.
 *
 */

public interface NotifierInterface
{
    /**
     * Notify mass medias.
     *
     * @param matchdata the matchdata
     */
    void notifyMassMedias(MatchData matchdata);

    /**
     * Subscribe a new object of type massmedia to the massmedia list.
     *
     * @param obj the obj
     */
    void suscribe(MassMedia obj);

    /**
     * Unsuscribe a new object of type massmedia to the massmedia list.
     *
     * @param obj the obj
     */
    void unsuscribe(MassMedia obj);

}
