package model.element.mobile;

import java.awt.Point;

import model.IMap;
import showboard.IPawn;

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

    public void shift(int i);
}
