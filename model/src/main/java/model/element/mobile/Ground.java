package model.element.mobile;

import java.awt.Point;

import model.element.Permeability;
import model.element.Sprite;
import model.element.motionless.MotionlessElement;

// TODO: Auto-generated Javadoc
/**
 * The Class Ground.
 */
public class Ground extends Mobile {

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

	@Override
	public Point position(final int i, final int y) {
		// TODO Auto-generated method stub
		return null;
	}
}
