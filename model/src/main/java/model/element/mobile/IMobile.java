package model.element.mobile;

import java.awt.Point;

import model.IMap;

public interface IMobile {
	public void die();

	public void doNothing();

	public IMap getMap();

	public Point getPosition();

	public int getX();

	public int getY();

	public boolean isAlive();

	public boolean isFalling();

	public boolean isKilled();

	public void moveDown();

	public void moveLeft();

	public void moveRight();

	public void moveUp();

	public void setFalling(boolean b);

}
