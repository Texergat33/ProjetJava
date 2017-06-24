package model.element.motionless;

import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class MotionlessElement.
 */
public abstract class MotionlessElement extends Element {

    /**
     * Instantiates a new motionless element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
    public MotionlessElement(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }
}
