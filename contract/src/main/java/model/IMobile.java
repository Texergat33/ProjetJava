package model;

import java.awt.Point;

public interface IMobile {
	public void moveUp();

	public void moveDown();

	public void moveRight();

	public void moveLeft();

	public void doNothing();

	public boolean isALive();

	public boolean isKilled();

	public Point getPosition();

}
