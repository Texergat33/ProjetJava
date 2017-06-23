package view;

import controller.IOrderPerformer;

public interface IBoulderDashView {

    public void displayMessage(String message);

    public void followMiner();

    public void setOrderPerformer(final IOrderPerformer orderPerformer);

}
