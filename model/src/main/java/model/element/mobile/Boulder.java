package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;
import model.element.motionless.MotionlessElement;

// TODO: Auto-generated Javadoc
/**
 * The Class Boulder.
 */
public class Boulder extends Mobile {

	/**
	 * Instantiates a new boulder.
	 *
	 * @param x the x
	 * @param y the y
	 * @param sprite the sprite
	 * @param map the map
	 * @param permeability the permeability
	 */
	public Boulder(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
		super(x, y, sprite, map, permeability);
		this.doSomething = new BehaviorFall();
	}

	/* (non-Javadoc)
	 * @see model.element.mobile.Mobile#collect()
	 */
	@Override
	public void collect() {

	}

	/* (non-Javadoc)
	 * @see model.element.mobile.Mobile#getPosition()
	 */
	@Override
	public Point getPosition() {
		return null;
	}

	/* (non-Javadoc)
	 * @see model.element.mobile.IMobile#position(int, int)
	 */
	@Override
	public Point position(final int i, final int y) {
		return null;
	}

	/* (non-Javadoc)
	 * @see model.element.IElement#createBackground()
	 */
	@Override
	public MotionlessElement createBackground() {
		return null;
	}

}
