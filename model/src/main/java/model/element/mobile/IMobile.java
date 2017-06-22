package model.element.mobile;

import java.awt.Point;

import model.IMap;

public interface IMobile {

    public boolean isAlive();

    public boolean isKilled();

    public Point getPosition();

    int getX();

    int getY();

    IMap getMap();

    boolean isFalling();

	public boolean isFalling();

	public boolean isKilled();

	public void moveDown();

	public void moveLeft();

	public void moveRight();

	public void moveUp();

    public void setFalling(boolean b);

    void die();

    public void collect();

    public IMobile position(int i, int y);

}
