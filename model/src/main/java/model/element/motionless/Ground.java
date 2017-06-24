package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Ground.
 */
public class Ground extends MotionlessElement {

    /**
     * Instantiates a new ground.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
    public Ground(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }

    /*
     * (non-Javadoc)
     * 
     * @see model.element.IElement#createBackground()
     */
    @Override
    public MotionlessElement createBackground() {
        return null;
    }
}
