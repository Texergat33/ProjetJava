package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.IMobile;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

public abstract class Mobile extends Element implements IMobile {

	private Point	position;
	private boolean	alive	= true;
	private IBoard	board;
	private IMap	map;

	public Mobile(Sprite sprite, Permeability permeability) {
		super(sprite, permeability);
		// TODO Auto-generated constructor stub
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
