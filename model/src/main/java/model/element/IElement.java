package model.element;

import java.awt.Image;

import showboard.ISquare;

public interface IElement extends ISquare {
    public Sprite getSprite();

    public Permeability getPermeability();

    @Override
    public Image getImage();
}
