package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.IElement;
import showboard.IPawn;

public interface IMobile extends IElement, IPawn {

	public void collect();

	public void die();

	void doNothing();

	public IMap getMap();

	@Override
	public Point getPosition();

	@Override
	public int getX();

	@Override
	public int getY();

	public boolean isAlive();

	public boolean isFalling();

	public boolean isKilled();

	public void moveDown();

	public void moveLeft();

	public void moveRight();

	public void moveUp();

	public void setFalling(boolean b);

	public Point position(int i, int y);

	public void doSomething();

}
