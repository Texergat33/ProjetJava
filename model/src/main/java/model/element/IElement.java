package model.element;

import java.awt.Image;

import model.element.motionless.MotionlessElement;
import showboard.ISquare;

public interface IElement extends ISquare {
    public Sprite getSprite();

    public Permeability getPermeability();

    @Override
    public Image getImage();

    public MotionlessElement createBackground();
}
