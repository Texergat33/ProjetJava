package view;

import controller.IOrderPerformer;

// TODO: Auto-generated Javadoc
/**
 * The Interface IBoulderDashView.
 */
public interface IBoulderDashView {

    /**
     * Display message.
     *
     * @param message the message
     */
    public void displayMessage(String message);

    /**
     * Follow miner.
     */
    public void followMiner();

    /**
     * Sets the order performer.
     *
     * @param orderPerformer the new order performer
     */
    public void setOrderPerformer(final IOrderPerformer orderPerformer);

}
