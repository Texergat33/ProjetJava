package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;
import showboard.IBoard;

// TODO: Auto-generated Javadoc
/**
 * The Class Mobile.
 */
public abstract class Mobile extends Element implements IMobile {

	/** The alive. */
	public boolean alive = true;

	/** The falling. */
	private boolean falling = false;

	/** The board. */
	private IBoard board;

	/** The map. */
	private IMap map;

	/** The position. */
	protected Point position;

	/** The do something. */
	protected BehaviorDoSomething doSomething;

	/** The x. */
	private int x;

	/** The y. */
	private int y;

	/**
	 * Instantiates a new mobile.
	 *
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param sprite
	 *            the sprite
	 * @param map
	 *            the map
	 * @param permeability
	 *            the permeability
	 */
	public Mobile(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
		super(sprite, permeability);
		this.setMap(map);
		this.setPosition(new Point(x, y));

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#collect()
	 */
	@Override
	public void collect() {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#die()
	 */
	@Override
	public void die() {
		this.alive = false;
		this.setHasChanged();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#doNothing()
	 */
	@Override
	public void doNothing() {
		this.setHasChanged();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#doSomething()
	 */
	@Override
	public void doSomething() {
		this.doSomething.doSomething();
	}

	/**
	 * Gets the board.
	 *
	 * @return the board
	 */
	protected IBoard getBoard() {
		return this.board;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#getMap()
	 */
	@Override
	public IMap getMap() {
		return this.map;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#getPosition()
	 */
	@Override
	public Point getPosition() {
		return this.position;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#getX()
	 */
	@Override
	public int getX() {
		return this.position.x;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#getY()
	 */
	@Override
	public int getY() {
		return this.position.y;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#isAlive()
	 */
	@Override
	public boolean isAlive() {
		return this.alive;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#isFalling()
	 */
	@Override
	public boolean isFalling() {
		return this.falling;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#isKilled()
	 */
	@Override
	public boolean isKilled() {
		return this.alive;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#moveDown()
	 */
	@Override
	public void moveDown() {
		this.setY(this.getY() + 1);

		this.setHasChanged();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#moveLeft()
	 */
	@Override
	public void moveLeft() {
		this.setX(this.getX() - 1);
		this.setHasChanged();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#moveRight()
	 */
	@Override
	public void moveRight() {
		this.setX(this.getX() + 1);
		this.setHasChanged();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#moveUp()
	 */
	@Override
	public void moveUp() {

		this.setY(this.getY() + 1);

		this.setHasChanged();
	}

	/**
	 * Ruin.
	 */
	public void ruin() {
		this.getMap().getOnTheMapXY(this.position.x, this.position.y).createBackground();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#setFalling(boolean)
	 */
	@Override
	public void setFalling(final boolean falling) {
		this.falling = falling;
	}

	/**
	 * Sets the has changed.
	 */
	protected void setHasChanged() {
		this.getMap().setMobileHasChanged();
	}

	/**
	 * Sets the map.
	 *
	 * @param map
	 *            the new map
	 */
	private void setMap(final IMap map) {
		this.map = map;
	}

	/**
	 * Sets the position.
	 *
	 * @param position
	 *            the new position
	 */
	public void setPosition(final Point position) {
		this.position = position;
	}

	/**
	 * Sets the x.
	 *
	 * @param x
	 *            the new x
	 */
	protected void setX(final int x) {
		this.position.x = x;
	}

	/**
	 * Sets the y.
	 *
	 * @param y
	 *            the new y
	 */
	protected void setY(final int y) {
		this.position.y = y;

	}
}
