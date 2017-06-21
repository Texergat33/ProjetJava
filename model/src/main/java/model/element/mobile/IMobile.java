package model.element.mobile;

import java.awt.Point;

import model.IMap;

public interface IMobile {
	public void moveUp();

	public void moveDown();

	public void moveRight();

	public void moveLeft();

	public void doNothing();

	public boolean isALive();

	public boolean isKilled();

	public Point getPosition();

	int getX();

	int getY();

	IMap getMap();

}
