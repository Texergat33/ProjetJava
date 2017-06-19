package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class Monster extends Mobile {
	private Sprite spriteMonster1;
	private Sprite spriteMonster2;

	public Monster(Point position, Sprite sprite, IMap map, Permeability permeability) {
		super(position, sprite, map, permeability);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void die(){

	}

	@Override
	public void moveDown(){

	}

	@Override
	public void moveLeft(){

	}

	@Override
	public void moveRight(){

	}

	@Override
	public void moveUp(){

	}
}
