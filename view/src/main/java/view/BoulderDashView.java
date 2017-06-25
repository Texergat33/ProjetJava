package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import controller.IOrderPerformer;
import controller.UserOrder;
import model.IMap;
import model.element.IElement;
import model.element.mobile.IMobile;
import showboard.BoardFrame;

// TODO: Auto-generated Javadoc
/**
 * The Class BoulderDashView.
 */
public class BoulderDashView implements IBoulderDashView, Runnable, KeyListener {

    /** The Constant squareSize. */
    private static final int squareSize = 100;

    /** The boulder view. */
    private static int boulderView = 10;

    /**
     * Key code to user order.
     *
     * @param keyCode
     *            the key code
     * @return the user order
     */
    private static UserOrder keyCodeToUserOrder(final int keyCode) {
        UserOrder userOrder;
        switch (keyCode) {
        case KeyEvent.VK_RIGHT:
            userOrder = UserOrder.RIGHT;
            break;
        case KeyEvent.VK_LEFT:
            userOrder = UserOrder.LEFT;
        case KeyEvent.VK_UP:
            userOrder = UserOrder.UP;
            break;
        case KeyEvent.VK_DOWN:
            userOrder = UserOrder.DOWN;
        default:
            userOrder = UserOrder.NOP;
            break;
        }
        return userOrder;
    }

    /** The view. */
    public int view;

    /** The order performer. */
    private IOrderPerformer orderPerformer;

    /** The map. */
    private IMap map;

    /** The close view. */
    private Rectangle closeView;

    /** The objects. */
    private ArrayList<IElement> objects;

    /**
     * Instantiates a new boulder dash view.
     *
     * @param map
     *            the map
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public BoulderDashView(final IMap map) throws IOException {
        final ArrayList<IElement> mobiles = new ArrayList<IElement>();

        this.setMap(map);
        // this.getMiner().getPosition();
        // this.setCloseView(new Rectangle(this.getMiner().getX(),
        // this.getMiner().getY(),
        // BoulderDashView.boulderView,BoulderDashView.boulderView));
        this.setCloseView(new Rectangle(0, 0, BoulderDashView.boulderView, BoulderDashView.boulderView));
        SwingUtilities.invokeLater(this);

    }

    /*
     * (non-Javadoc)
     * 
     * @see view.IBoulderDashView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    /*
     * public void show(final int yStart, final int xStart) { for (int view = 0;
     * view < this.getMap().getHeight(); view++) { for (int x = 0; x
     * <this.getMap().getWidth(); x++) {
     *
     * } } }
     */

    /*
     * (non-Javadoc)
     * 
     * @see view.IBoulderDashView#followMiner()
     */
    @Override
    public void followMiner() {
        // this.closeView = new Rectangle(this.getMiner().getX(),
        // this.getMiner().getY());
    }

    /**
     * Gets the close view.
     *
     * @return the close view
     */
    public Rectangle getCloseView() {
        return this.closeView;
    }

    /**
     * Gets the map.
     *
     * @return the map
     */
    public IMap getMap() {
        return this.map;
    }

    /**
     * Gets the order performer.
     *
     * @return the order performer
     */
    public IOrderPerformer getOrderPerformer() {
        return this.orderPerformer;
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public int getView() {
        return this.view;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
     */
    @Override
    public void keyPressed(final KeyEvent e) {
        this.getOrderPerformer().orderPerform(BoulderDashView.keyCodeToUserOrder(e.getKeyCode()));
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
     */
    @Override
    public void keyReleased(final KeyEvent e) {
        // TODO Auto-generated method stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
     */
    @Override
    public void keyTyped(final KeyEvent e) {
        // TODO Auto-generated method stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run() Run is going to build the window.
     */
    @Override
    public void run() {
        final BoardFrame boardFrame = new BoardFrame("GAME");
        boardFrame.setDimension(new Dimension(this.getMap().getWidth(), this.getMap().getHeight()));
        boardFrame.setDisplayFrame(this.closeView);
        boardFrame.setSize(this.closeView.width * squareSize, this.closeView.height * squareSize);
        // boardFrame.setHeightLooped(true);
        boardFrame.addKeyListener(this);
        boardFrame.setFocusable(true);
        boardFrame.setFocusTraversalKeysEnabled(false);
        for (int x = 0; x < this.getMap().getWidth(); x++) {
            for (int y = 0; y < this.getMap().getHeight(); y++) {
                // System.out.print(this.map.getOnTheMapXY(x,
                // y).getSprite().getDatabaseIDImage());
                boardFrame.addSquare(this.map.getOnTheMapXY(x, y), x, y);
            }
            System.out.println("");
        }
        for (final IMobile element : this.getMap().getMobiles()) {
            boardFrame.addPawn(element);
        }
        this.getMap().getObservable().addObserver(boardFrame.getObserver());
        boardFrame.setVisible(true);
    }

    /**
     * Sets the close view.
     *
     * @param closeView
     *            the new close view
     */
    public void setCloseView(final Rectangle closeView) {
        this.closeView = closeView;
    }

    /**
     * Sets the map.
     *
     * @param map
     *            the new map
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public void setMap(final IMap map) throws IOException {
        this.map = map;
        /*
         * for (int x = 0; x < this.getMap().getWidth(); x++) { for (int y = 0;
         * y < this.getMap().getWidth(); y++) { this.getMap().getOnTheMapXY(x,
         * y).getSprite().loadImage(); } }
         */
    }

    /*
     * (non-Javadoc)
     * 
     * @see view.IBoulderDashView#setOrderPerformer(controller.IOrderPerformer)
     */
    @Override
    public void setOrderPerformer(final IOrderPerformer orderPerformer) {
        this.orderPerformer = orderPerformer;
    }

    /**
     * Sets the view.
     *
     * @param view
     *            the new view
     */
    public void setView(final int view) {
        this.view = view;
    }
}
