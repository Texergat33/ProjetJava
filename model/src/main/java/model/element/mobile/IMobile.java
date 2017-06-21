package model.element.mobile;

import java.awt.Point;

import model.element.Sprite;

public interface IMobile {
    public void moveUp();

    public void moveDown();

    public void moveRight();

    public void moveLeft();

    public void doNothing();

    public boolean isALive();

    public boolean isKilled();

    public Point getPosition();

    public Sprite getSprite();

    public int getX();

    public int getY();

}
