package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public abstract class AbstractMonster extends Mobile {

	private Sprite	spriteMonster1;
	private Sprite	spriteMonster2;

	public AbstractMonster(Sprite sprite, Permeability permeability) {
		super(sprite, permeability);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void die() {

	}

	@Override
	public void moveDown() {

	}

	@Override
	public void moveLeft() {

	}

	@Override
	public void moveRight() {

	}

	@Override
	public void moveUp() {

	}
}
