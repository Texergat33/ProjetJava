package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;
import model.element.motionless.MotionlessElement;

public class FastAndFollowTheWallsMonster extends Monster {

	public FastAndFollowTheWallsMonster(final int x, final int y, final Sprite sprite, final IMap map,
			final Permeability permeability) {
		super(x, y, sprite, map, permeability);
	}

	@Override
	public Point position(final int i, final int y) {
		return null;
	}

	@Override
	public MotionlessElement createBackground() {
		return null;
	}
}
