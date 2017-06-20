package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class Boulder extends Mobile {

	public Boulder(Point position, Sprite sprite, IMap map, Permeability permeability) {
		super(sprite, permeability);
		// TODO Auto-generated constructor stub
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

}
