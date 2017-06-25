package controller;

// TODO: Auto-generated Javadoc
/**
 * The Interface IBoulderDashController.
 */
public interface IBoulderDashController {

    /**
     * Play.
     *
     * @throws InterruptedException the interrupted exception
     */
    public void play() throws InterruptedException;

    /**
     * Gets the order performer.
     *
     * @return the order performer
     */
    public IOrderPerformer getOrderPerformer();

}
