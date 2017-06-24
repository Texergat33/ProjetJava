package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;
import model.element.motionless.MotionlessElement;

public class FastAndRandomMonster extends Monster {
	private static final Sprite SPRITE = new Sprite(10, "monster3");

	public FastAndRandomMonster(final int x, final int y, final Sprite sprite, final IMap map,
			final Permeability permeability) {
		super(x, y, SPRITE, map, permeability);
		this.doSomething = new BehaviorFast();
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
