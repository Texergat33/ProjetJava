package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;
import model.element.motionless.MotionlessElement;

public class SlowAndFollowTheWallsMonster extends Monster {
	private static final Sprite SPRITE = new Sprite(6, "monster2");

	public SlowAndFollowTheWallsMonster(final int x, final int y, final Sprite sprite, final IMap map,
			final Permeability permeability) {
		super(x, y, SPRITE, map, permeability);
	}

	@Override
	public void collect() {
	}

	@Override
	public Point getPosition() {
		return null;
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
