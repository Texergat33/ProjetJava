package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class Miner extends Mobile {

	public Miner(Point position, Sprite sprite, IMap map, Permeability permeability) {
		super(position, sprite, map, permeability);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void die() {
		super.die();
		this.setSprite(null);
	}

	@Override
	public void doNothing() {
		super.doNothing();
		while (true) {
			this.setSprite(defaultMiner1);
			this.setSprite(defaultMiner2);
		}
	}

	@Override
	public void moveDown() {
		super.moveDown();
		while (true) {
			this.setSprite(minerDown1);
			this.setSprite(minerDown2);
		}
	}

	@Override
	public void moveLeft() {
		super.moveLeft();
		while (true) {
			this.setSprite(minerLeft1);
			this.setSprite(minerLeft2);
		}
	}

	@Override
	public void moveRight() {
		super.moveRight();
		while (true) {
			this.setSprite(minerRight1);
			this.setSprite(minerRight2);
		}
	}

	@Override
	public void moveUp() {
		super.moveUp();
		while (true) {
			this.setSprite(minerUp1);
			this.setSprite(minerUp2);
		}
	}
}
