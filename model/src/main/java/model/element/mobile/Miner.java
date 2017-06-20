package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class Miner extends Mobile {
	private static final Sprite defaultMiner1 = new Sprite("defaultMiner1.png");
	private static final Sprite defaultMiner2 = new Sprite("defaultMiner2.png");
	private static final Sprite minerUp1 = new Sprite("minerUp.png");
	// private static final Sprite minerUp2 = new Sprite(minerUp2.png);
	private static final Sprite minerDown1 = new Sprite("minerDown1.png");
	private static final Sprite minerDown2 = new Sprite("minerDown2.png");
	private static final Sprite minerLeft1 = new Sprite("minerLeft1.png");
	private static final Sprite minerLeft2 = new Sprite("minerLeft2.png");
	private static final Sprite minerRight1 = new Sprite("minerRight1.png");
	private static final Sprite minerRight2 = new Sprite("minerRight2.png");
	private static final Sprite deadMiner1 = new Sprite("deadMiner1");
	private static final Sprite deadMiner2 = new Sprite("deadMiner2");

	public Miner(Point position, Sprite sprite, IMap map, Permeability permeability) {
		super(position, sprite, map, permeability);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void die() {
		super.die();
		while (true) {
			this.setSprite("deadMiner1");
			this.setSprite("deadMiner2");
		}
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
