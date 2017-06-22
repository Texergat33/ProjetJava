package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;
import model.element.SpriteFactory;

public class Miner extends Mobile {

	public Miner(Point position, Sprite sprite, IMap map, Permeability permeability) {
		super(position, sprite, map, permeability);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void die() {
		super.die();
		while (true) {
			this.setSprite(SpriteFactory.createMiner("deadMiner1"));
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.setSprite(SpriteFactory.createMiner("deadMiner2"));
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
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
		super.moveDown();
		while (true) {
			this.setSprite(SpriteFactory.createMiner("minerDown1"));
			this.setSprite(SpriteFactory.createMiner("minerDown2"));
		}
	}

	@Override
	public void moveLeft() {
		super.moveLeft();
		while (true) {
			this.setSprite(SpriteFactory.createMiner("minerLeft1"));
			this.setSprite(SpriteFactory.createMiner("minerLeft2"));
		}
	}

	@Override
	public void moveRight() {
		super.moveRight();
		while (true) {
			this.setSprite(SpriteFactory.createMiner("minerRight1"));
			this.setSprite(SpriteFactory.createMiner("minerRight2"));
		}
	}

	@Override
	public void moveUp() {
		super.moveUp();
		while (true) {
			this.setSprite(SpriteFactory.createMiner("minerUp1"));
		}
	}
}
