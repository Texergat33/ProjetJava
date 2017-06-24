package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.IElement;
import showboard.IPawn;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMobile.
 */
public interface IMobile extends IElement, IPawn {

	/**
	 * Collect.
	 */
	public void collect();

	/**
	 * Die.
	 */
	public void die();

	/**
	 * Do nothing.
	 */
	void doNothing();

	/**
	 * Gets the map.
	 *
	 * @return the map
	 */
	public IMap getMap();

	/* (non-Javadoc)
	 * @see showboard.IPawn#getPosition()
	 */
	@Override
	public Point getPosition();

	/* (non-Javadoc)
	 * @see showboard.IPawn#getX()
	 */
	@Override
	public int getX();

	/* (non-Javadoc)
	 * @see showboard.IPawn#getY()
	 */
	@Override
	public int getY();

	/**
	 * Checks if is alive.
	 *
	 * @return true, if is alive
	 */
	public boolean isAlive();

	/**
	 * Checks if is falling.
	 *
	 * @return true, if is falling
	 */
	public boolean isFalling();

	/**
	 * Checks if is killed.
	 *
	 * @return true, if is killed
	 */
	public boolean isKilled();

	/**
	 * Move down.
	 */
	public void moveDown();

	/**
	 * Move left.
	 */
	public void moveLeft();

	/**
	 * Move right.
	 */
	public void moveRight();

	/**
	 * Move up.
	 */
	public void moveUp();

	/**
	 * Sets the falling.
	 *
	 * @param b the new falling
	 */
	public void setFalling(boolean b);

	/**
	 * Position.
	 *
	 * @param i the i
	 * @param y the y
	 * @return the point
	 */
	public Point position(int i, int y);

	/**
	 * Do something.
	 */
	public void doSomething();

}
