package model.element.mobile;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Monster.
 */
public abstract class Monster extends Mobile {

	/**
	 * Instantiates a new monster.
	 *
	 * @param x the x
	 * @param y the y
	 * @param sprite the sprite
	 * @param map the map
	 * @param permeability the permeability
	 */
	public Monster(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
		super(x, y, sprite, map, permeability);
	}

}
