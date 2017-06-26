package model.element.mobile;

import java.awt.Point;

import model.IMap;
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

	public Ground(int x, int y, Sprite sprite, IMap map, Permeability permeability) {
		super(x, y, sprite, map, permeability);
		// TODO Auto-generated constructor stub
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
