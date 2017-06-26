package model.element.mobile;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Diamond.
 */
public class Diamond extends Boulder {

	/**
	 * Instantiates a new diamond.
	 *
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param sprite
	 *            the sprite
	 * @param map
	 *            the map
	 * @param permeability
	 *            the permeability
	 */
	public Diamond(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
		super(x, y, sprite, map, permeability);
		this.doSomething = new BehaviorFall();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see model.element.mobile.Boulder#collect()
	 */
	@Override
	public void collect() {
		this.getMap().setDiamondCounter(this.getMap().getDiamondCounter() - 1);
		this.setX(-1);
		this.setY(-1);
		this.ruin();
	}

}
