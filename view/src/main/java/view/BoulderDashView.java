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

public class BoulderDashView implements IBoulderDashView, Runnable, KeyListener {

	private static final int squareSize = 100;
	private static int boulderView = 10;
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
	public int view;
	private IOrderPerformer orderPerformer;
	private IMap map;
	private Rectangle closeView;

	private ArrayList<IElement> objects;

	public BoulderDashView(final IMap map) throws IOException {
		final ArrayList<IElement> mobiles = new ArrayList<IElement>();

		this.setMap(map);
		// this.getMiner().getPosition();
		//this.setCloseView(new Rectangle(this.getMiner().getX(), this.getMiner().getY(), BoulderDashView.boulderView,BoulderDashView.boulderView));
		this.setCloseView(new Rectangle(0, 0, BoulderDashView.boulderView, BoulderDashView.boulderView));
		SwingUtilities.invokeLater(this);

	}

	@Override
	public final void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	/*
	 * public void show(final int yStart, final int xStart) {
	 * 	for (int view = 0; view < this.getMap().getHeight(); view++) {
	 * 		for (int x = 0; x <this.getMap().getWidth(); x++) {
	 *
	 * 		}
	 * 	}
	 *}
	 */

	@Override
	public void followMiner() {
		// this.closeView = new Rectangle(this.getMiner().getX(),
		// this.getMiner().getY());
	}

	public Rectangle getCloseView() {
		return this.closeView;
	}

	public IMap getMap() {
		return this.map;
	}

	public IOrderPerformer getOrderPerformer() {
		return this.orderPerformer;
	}

<<<<<<< HEAD
	public int getView() {
		return this.view;
	}
=======
    /*
     * (non-Javadoc)
     *
     * @see java.lang.Runnable#run()
     */
    /*
     * the method will display on the screen the different element who constite
     * the game
     */
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
                System.out.print(this.map.getOnTheMapXY(x, y).getSprite().getDatabaseIDImage());
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
>>>>>>> branch 'ProjetFINALSave' of https://github.com/Texergat33/ProjetJava

	@Override
	public void keyPressed(final KeyEvent e) {
		this.getOrderPerformer().orderPerform(BoulderDashView.keyCodeToUserOrder(e.getKeyCode()));
	}

	@Override
	public void keyReleased(final KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(final KeyEvent e) {
		// TODO Auto-generated method stub
	}

<<<<<<< HEAD
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
=======
    /* this method will make the view follow the player. */
    @Override
    public void followMiner() {
        this.closeView = new Rectangle(this.getMap().getMiner().getX(), this.getMap().getMiner().getY());
    }
>>>>>>> branch 'ProjetFINALSave' of https://github.com/Texergat33/ProjetJava

	public void setCloseView(final Rectangle closeView) {
		this.closeView = closeView;
	}

	public void setMap(final IMap map) throws IOException {
		this.map = map;
		/*
		 * for (int x = 0; x < this.getMap().getWidth(); x++) {
		 * 	for (int y = 0; y < this.getMap().getWidth(); y++) {
		 * 		this.getMap().getOnTheMapXY(x, y).getSprite().loadImage();
		 * 		}
		 * 	}
		 */
	}

	@Override
	public void setOrderPerformer(final IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}

<<<<<<< HEAD
	public void setView(final int view) {
		this.view = view;
	}
=======
    /**
     * Sets the order performer.
     *
     * @param orderPerformer
     *            the new order performer
     */
    @Override
    public void setOrderPerformer(final IOrderPerformer orderPerformer) {
        this.orderPerformer = orderPerformer;
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
     * Sets the map.
     *
     * @param map
     *            the new map
     * @throws IOException
     */
    public void setMap(final IMap map) throws IOException {
        this.map = map;
        for (int x = 0; x < this.getMap().getWidth(); x++) {
            for (int y = 0; y < this.getMap().getWidth(); y++) {
                this.getMap().getOnTheMapXY(x, y).getSprite().loadImage();
            }
        }

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
     * Sets the close view.
     *
     * @param closeView
     *            the new close view
     */
    public void setCloseView(final Rectangle closeView) {
        this.closeView = closeView;
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
     * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
     */
    @Override
    public void keyTyped(final KeyEvent e) {
        // TODO Auto-generated method stub

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

>>>>>>> branch 'ProjetFINALSave' of https://github.com/Texergat33/ProjetJava
}
