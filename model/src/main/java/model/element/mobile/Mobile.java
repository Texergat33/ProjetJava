package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public abstract class Mobile implements IMobile {
	private Point	position;
	private boolean	alive	= true;
	private IBoard	board;

	public Mobile(Point position, Sprite sprite, IMap map, Permeability permeability) {

	}

	private void setMobileHasChanged() {

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
	public void doNothing() {

	}

	@Override
	public boolean isALive() {

	}

	@Override
	public boolean isKilled() {

	}

	@Override
	public Point getPosition() {
		return this.position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	protected IBoard getBoard() {

	}

	protected void die() {

	}

}
