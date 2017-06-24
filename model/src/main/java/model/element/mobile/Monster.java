package model.element.mobile;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public abstract class Monster extends Mobile {

	public Monster(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
		super(x, y, sprite, map, permeability);
	}

}
