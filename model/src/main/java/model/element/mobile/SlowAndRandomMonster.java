package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;
import model.element.motionless.MotionlessElement;

// TODO: Auto-generated Javadoc
/**
 * The Class SlowAndRandomMonster.
 */
public class SlowAndRandomMonster extends Monster {
	
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite(7, "monster4");

	/**
	 * Instantiates a new slow and random monster.
	 *
	 * @param x the x
	 * @param y the y
	 * @param sprite the sprite
	 * @param map the map
	 * @param permeability the permeability
	 */
	public SlowAndRandomMonster(final int x, final int y, final Sprite sprite, final IMap map,
			final Permeability permeability) {
		super(x, y, SPRITE, map, permeability);
		this.doSomething = new BehaviorSlow();
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
