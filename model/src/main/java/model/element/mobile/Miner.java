package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class Miner extends Mobile {

	private Sprite	sprite1;
	private Sprite	sprite2;
	private Sprite	spriteRight1;
	private Sprite	spriteRight2;
	private Sprite	spriteDown1;
	private Sprite	spriteDown2;
	private Sprite	spriteUp1;
	private Sprite	spriteUp2;
	private Sprite	spriteLeft1;
	private Sprite	spriteLeft2;

	public Miner(Point position, Sprite sprite, IMap map, Permeability permeability) {
		super(position, sprite, map, permeability);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void moveUp() {

	}

	@Override
	public void moveDown() {

	}

	@Override
	public void moveRight() {

	}

	@Override
	public void moveLeft() {

	}

	@Override
	protected void die() {

	}

	@Override
	public void doNothing() {

	}
}
