package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import controller.IOrderPerformer;
import controller.UserOrder;
import fr.exia.showboard.BoardFrame;
import fr.exia.showboard.IPawn;
import model.IMap;
import model.element.mobile.IMobile;;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class BoulderDashView implements IBoulderDashView, Runnable, KeyListener, Observer {
    private static final int squareSize = 10;
    public int               view;
    private IOrderPerformer  orderPerformer;
    private IMobile          miner;
    private IMap             map;
    private Rectangle        closeView;

    /**
     * Instantiates a new view facade.
     */
    public BoulderDashView(final IMap map, final IMobile miner) {
        this.setMiner(miner);
        this.setMap(map);
        this.getMiner().getSprite().loadImage();
        this.setCloseView(new Rectangle(0, 0, 0, 0));
        SwingUtilities.invokeLater(this);
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

    @Override
    public void run() {
        final BoardFrame boardFrame = new BoardFrame("GAME");
        boardFrame.setDimension(new Dimension(this.getMap().getWidth(), this.getMap().getHeight()));
        boardFrame.setDisplayFrame(this.closeView);
        boardFrame.setSize(this.closeView.width * squareSize, this.closeView.height * squareSize);
        boardFrame.setHeightLooped(true);
        boardFrame.addKeyListener(this);
        boardFrame.setFocusable(true);
        boardFrame.setFocusTraversalKeysEnabled(false);
        for (int x = 0; x < this.getMap().getWidth(); x++) {
            for (int y = 0; y < this.getMap().getHeight(); y++) {
                boardFrame.addSquare(this.map.getOnTheMapXY(x, y), x, y);
            }
        }
        boardFrame.addPawn((IPawn) this.getMiner());
    }

    public void show(final int yStart, final int xStart) {
        for (int view = 0; view < this.getMap().getHeight(); view++) {
            for (int x = 0; x < this.getMap().getWidth(); x++) {
                System.out.println(this.getMiner().getSprite());
            }
        }

    }

    private static UserOrder keyCodeToUserOrder(final int keyCode) {
        UserOrder userOrder;
        switch (keyCode) {
        case KeyEvent.VK_RIGHT:
            userOrder = UserOrder.RIGHT;
            break;
        case KeyEvent.VK_LEFT:
            userOrder = UserOrder.LEFT;
            break;
        default:
            userOrder = UserOrder.NOP;
            break;
        }
        return userOrder;
    }

    public int getView() {
        return this.view;
    }

    public void setView(final int view) {
        this.view = view;
    }

    public IOrderPerformer getOrderPerformer() {
        return this.orderPerformer;
    }

    public void setOrderPerformer(final IOrderPerformer orderPerformer) {
        this.orderPerformer = orderPerformer;
    }

    public IMobile getMiner() {
        return this.miner;
    }

    public void setMiner(final IMobile miner) {
        this.miner = miner;
    }

    public IMap getMap() {
        return this.map;
    }

    public void setMap(final IMap map) {
        this.map = map;
        for (int x = 0; x < this.getMap().getWidth(); x++) {
            for (int y = 0; y < this.getMap().getWidth(); y++) {
                this.getMap().getOnTheMapXY(x, y).getSprite.loadImage();
            }
        }
    }

    public Rectangle getCloseView() {
        return this.closeView;
    }

    public void setCloseView(final Rectangle closeView) {
        this.closeView = closeView;
    }

    @Override
    public void keyPressed(final KeyEvent e) {
        this.getOrderPerformer().orderPerform(BoulderDashView.keyCodeToUserOrder(e.getKeyCode()));

    }

    @Override
    public void update(final Observable o, final Object arg) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(final KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(final KeyEvent e) {
        // TODO Auto-generated method stub

    }

}