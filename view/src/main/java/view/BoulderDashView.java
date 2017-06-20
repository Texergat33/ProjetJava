package view;

import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import controller.IOrderPerformer;
import controller.UserOrder;
import model.IMap;
import model.element.mobile.IMobile;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class BoulderDashView implements IBoulderDashView {
    public int              frameView;
    private IOrderPerformer orderPerformer;
    private IMobile         miner;
    private IMap            map;

    /**
     * Instantiates a new view facade.
     */
    public BoulderDashView(final IMap map, final IMobile miner) {
        super();
    }

    /*
     * (non-Javadoc)
     *
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public void run() {

    }

    public void show(final int yStart, final int xStart) {

    }

    public UserOrder keyCodeToUserOrder(final int keyCode) {
        return null;

    }

    public void keyTyped(final KeyEvent keyEvent) {

    }

    public void keyPressed(final KeyEvent keyEvent) {

    }

    public void keyReleassed(final KeyEvent keyEven) {

    }

    public IMap getMap() {
        return this.map;

    }

    public void setMap(final IMap map) {

    }

    public IMobile getMiner() {
        return this.miner;

    }

    public void setMiner(final IMobile miner) {

    }

    public IOrderPerformer getOrderPerformer() {
        return this.orderPerformer;

    }

    public void setOrderPerformer(final IOrderPerformer orderPerformer) {

    }
}