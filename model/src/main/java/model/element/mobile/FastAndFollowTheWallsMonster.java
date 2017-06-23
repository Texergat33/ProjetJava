package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;
import model.element.motionless.MotionlessElement;

public class FastAndFollowTheWallsMonster extends Monster {

	private static final Sprite SPRITE = new Sprite(11, "monster1");

	public FastAndFollowTheWallsMonster(Point position, Sprite sprite, IMap map, Permeability permeability) {
		super(position, SPRITE, map, permeability);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void collect() {
		// TODO Auto-generated method stub

	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMobile position(int i, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void shift(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public MotionlessElement createBackground() {
		// TODO Auto-generated method stub
		return null;
	}

}
