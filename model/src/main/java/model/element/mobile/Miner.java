package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;
import model.element.SpriteFactory;
import model.element.motionless.Background;
import model.element.motionless.MotionlessElement;

public class Miner extends Mobile {

	public Miner(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
		super(x, y, sprite, map, permeability);
		System.out.println("test");
	}

	@Override
	public void die() {
		super.die();
		this.setSprite(SpriteFactory.createMiner("deadMiner1"));
	}

	@Override
	public void doNothing() {
		super.doNothing();
		this.setSprite(SpriteFactory.createMiner("defaultMiner1"));
	}

	@Override
	public void moveDown() {
		this.setSprite(SpriteFactory.createMiner("minerDown1"));
		if (this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)
				.getPermeability() == Permeability.PENETRABLEFORMINER) {
			this.setY(this.getY() + 1);
		} else if (this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)
				.getPermeability() == Permeability.COLLECTABLE) {
			this.getMap().getMobileXY(this.getX(), this.getY() + 1).collect();
			this.setY(this.getY() + 1);
		} else {
			this.doNothing();
		}
		this.setHasChanged();
	}

	@Override
	public void moveLeft() {
		this.setSprite(SpriteFactory.createMiner("minerLeft1"));
		if (this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())
				.getPermeability() == Permeability.PENETRABLEFORMINER) {
			this.setX(this.getX() - 1);
		} else if ((this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())
				.getPermeability() == Permeability.PUSHABLE)
				&& (this.getMap().getOnTheMapXY(this.getX() - 2, this.getY())
						.getPermeability() == Permeability.PENETRABLEFOROTHERS)) {
			this.getMap().getMobileXY(this.getX() - 1, this.getY()).moveLeft();
			this.setX(this.getX() - 1);
		} else if (this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())
				.getPermeability() == Permeability.COLLECTABLE) {
			this.getMap().getMobileXY(this.getX() - 1, this.getY()).collect();
		} else {
			this.doNothing();
		}
		this.setHasChanged();
	}

	@Override
	public void moveRight() {
		this.setSprite(SpriteFactory.createMiner("minerRight1"));
		if (this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())
				.getPermeability() == Permeability.PENETRABLEFORMINER) {
			this.setX(this.getX() + 1);
		} else if ((this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())
				.getPermeability() == Permeability.PUSHABLE)
				&& (this.getMap().getOnTheMapXY(this.getX() + 2, this.getY())
						.getPermeability() == Permeability.PENETRABLEFOROTHERS)) {
			this.getMap().getMobileXY(this.getX() + 1, this.getY()).moveRight();
			this.setX(this.getX() + 1);
		} else if (this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())
				.getPermeability() == Permeability.COLLECTABLE) {
			this.getMap().getMobileXY(this.getX() + 1, this.getY()).collect();
		} else {
			this.doNothing();
		}
		this.setHasChanged();
	}

	@Override
	public void moveUp() {
		this.setSprite(SpriteFactory.createMiner("minerUp1"));
		if (this.getMap().getOnTheMapXY(this.getX(), this.getY() - 1)
				.getPermeability() == Permeability.PENETRABLEFORMINER) {
			this.setY(this.getY() - 1);
		} else if (this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)
				.getPermeability() == Permeability.COLLECTABLE) {
			this.getMap().getMobileXY(this.getX(), this.getY() + 1).collect();
		} else {
			this.doNothing();
		}
		this.setHasChanged();
	}

	@Override
	public Point position(final int i, final int y) {
		return this.position;
	}

	@Override
	public MotionlessElement createBackground() {
		return new Background(SpriteFactory.createBackground(), Permeability.PENETRABLEFOREVERYONE);
	}

}
