package model.element;

import java.awt.Image;

import model.element.motionless.MotionlessElement;
import showboard.ISquare;

// TODO: Auto-generated Javadoc
/**
 * The Interface IElement.
 */
public interface IElement extends ISquare {

    /**
     * Gets the sprite.
     *
     * @return the sprite
     */
    public Sprite getSprite();

    /**
     * Gets the permeability.
     *
     * @return the permeability
     */
    public Permeability getPermeability();

    /*
     * (non-Javadoc)
     * 
     * @see showboard.ISquare#getImage()
     */
    @Override
    public Image getImage();

    /**
     * Creates the background.
     *
     * @return the motionless element
     */
    public MotionlessElement createBackground();
}
