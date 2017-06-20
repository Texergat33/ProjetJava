package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class Miner extends Mobile {

	public Miner(Point position, Sprite sprite, IMap map, Permeability permeability) {
		super(sprite, permeability);
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
		this.setSprite(null);
	}

	@Override
	public void moveDown() {
		super.moveDown();
		this.setSprite(null);
	}

	@Override
	public void moveLeft() {
		super.moveLeft();
		this.setSprite(null);
	}

	@Override
	public void moveRight() {
		super.moveRight();
		this.setSprite(null);
	}

	@Override
	public void moveUp() {
		super.moveUp();
		this.setSprite(null);
	}
}
