package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;
import model.element.SpriteFactory;
import model.element.motionless.Background;
import model.element.motionless.MotionlessElement;

// TODO: Auto-generated Javadoc
/**
 * The Class Miner.
 */
public class Miner extends Mobile {

	/**
	 * Instantiates a new miner.
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
	public Miner(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
		super(x, y, sprite, map, permeability);
		System.out.println("test");
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.Mobile#die()
	 */
	@Override
	public void die() {
		super.die();
		this.setSprite(SpriteFactory.createMiner("deadMiner1"));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.Mobile#doNothing()
	 */
	@Override
	public void doNothing() {
		super.doNothing();
		this.setSprite(SpriteFactory.createMiner("defaultMiner1"));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.Mobile#moveDown()
	 */
	@Override
	public void moveDown() {
		this.setSprite(SpriteFactory.createMiner("minerDown1"));
		if ((this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)
				.getPermeability() == Permeability.PENETRABLEFORMINER)
				|| (this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)
						.getPermeability() == Permeability.PENETRABLEFOREVERYONE)) {
			super.moveDown();
		} else if (this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)
				.getPermeability() == Permeability.COLLECTABLE) {
			this.getMap().getMobileXY(this.getX(), this.getY() + 1).collect();
			super.moveDown();
		} else {
			this.doNothing();
		}
		this.setHasChanged();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.Mobile#moveLeft()
	 */
	@Override
	public void moveLeft() {
		this.setSprite(SpriteFactory.createMiner("minerLeft1"));
		if ((this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())
				.getPermeability() == Permeability.PENETRABLEFORMINER)
				|| (this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())
						.getPermeability() == Permeability.PENETRABLEFOREVERYONE)) {
			super.moveLeft();
		} else if ((this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())
				.getPermeability() == Permeability.PUSHABLE)
				&& (this.getMap().getOnTheMapXY(this.getX() - 2, this.getY())
						.getPermeability() == Permeability.PENETRABLEFOROTHERS)) {
			this.getMap().getMobileXY(this.getX() - 1, this.getY()).moveLeft();
			this.getMap().getMobileXY(this.getX() - 1, this.getY()).doSomething();
			this.setX(this.getX() - 1);
		} else if (this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())
				.getPermeability() == Permeability.COLLECTABLE) {
			this.getMap().getMobileXY(this.getX() - 1, this.getY()).collect();
			super.moveLeft();
		} else {
			this.doNothing();
		}
		this.setHasChanged();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.Mobile#moveRight()
	 */
	@Override
	public void moveRight() {
		this.setSprite(SpriteFactory.createMiner("minerRight1"));
		if ((this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())
				.getPermeability() == Permeability.PENETRABLEFORMINER)
				|| (this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())
						.getPermeability() == Permeability.PENETRABLEFOREVERYONE)) {
			super.moveRight();
		} else if ((this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())
				.getPermeability() == Permeability.PUSHABLE)
				&& (this.getMap().getOnTheMapXY(this.getX() + 2, this.getY())
						.getPermeability() == Permeability.PENETRABLEFOROTHERS)) {
			this.getMap().getMobileXY(this.getX() + 1, this.getY()).moveRight();
			this.getMap().getMobileXY(this.getX() + 1, this.getY()).doSomething();
			super.moveRight();
			this.setX(this.getX() + 1);
		} else if (this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())
				.getPermeability() == Permeability.COLLECTABLE) {
			this.getMap().getMobileXY(this.getX() + 1, this.getY()).collect();
			super.moveRight();
		} else {
			this.doNothing();
		}
		this.setHasChanged();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.Mobile#moveUp()
	 */
	@Override
	public void moveUp() {

		this.setSprite(SpriteFactory.createMiner("minerUp1"));
		if ((this.getMap().getOnTheMapXY(this.getX(), this.getY() - 1)
				.getPermeability() == Permeability.PENETRABLEFORMINER)
				|| (this.getMap().getOnTheMapXY(this.getX(), this.getY() - 1)
						.getPermeability() == Permeability.PENETRABLEFOREVERYONE)) {
			super.moveUp();
		} else if (this.getMap().getOnTheMapXY(this.getX(), this.getY() - 1)
				.getPermeability() == Permeability.COLLECTABLE) {
			this.getMap().getMobileXY(this.getX(), this.getY() - 1).collect();
			super.moveUp();
		} else {
			this.doNothing();
		}
		this.setHasChanged();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.mobile.IMobile#position(int, int)
	 */
	@Override
	public Point position(final int i, final int y) {
		return this.position;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.element.IElement#createBackground()
	 */
	@Override
	public MotionlessElement createBackground() {
		return new Background(SpriteFactory.createBackground(), Permeability.PENETRABLEFOREVERYONE);
	}
}
