package model.element.mobile;

import java.awt.Point;

import fr.exia.showboard.IPawn;
import model.IMap;

public interface IMobile extends IPawn {

	public boolean isAlive();

	public boolean isKilled();

	@Override
	public Point getPosition();

	@Override
	public int getX();

	@Override
	public int getY();

	public IMap getMap();

	public boolean isFalling();

	public void moveDown();

	public void moveLeft();

	public void moveRight();

	public void moveUp();

	public void setFalling(boolean b);

	public void die();

	public void collect();

	public IMobile position(int i, int y);

	void doNothing();
}
