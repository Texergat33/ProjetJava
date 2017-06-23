package model.element.mobile;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;
import model.element.SpriteFactory;

public class Miner extends Mobile {

	public Miner(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
		super(x, y, sprite, map, permeability);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void die() {
		super.die();
		while (true) {
			this.setSprite(SpriteFactory.createMiner("deadMiner1"));
			try {
				Thread.sleep(350);
			} catch (final InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.setSprite(SpriteFactory.createMiner("deadMiner2"));
			try {
				Thread.sleep(350);
			} catch (final InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void doNothing() {
		super.doNothing();
		while (true) {
			this.setSprite(SpriteFactory.createMiner("defaultMiner1"));
			this.setSprite(SpriteFactory.createMiner("defaultMiner1"));
		}
	}

	@Override
	public void moveDown() {
		this.setSprite(SpriteFactory.createMiner("minerDown1"));
		if (this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)
				.getPermeability() == Permeability.PENETRABLEFORMINER) {
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
		} else {
			this.doNothing();
		}
		this.setHasChanged();
	}

}
