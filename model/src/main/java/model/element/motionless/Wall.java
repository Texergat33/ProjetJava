package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Wall extends MotionlessElement {

	public Wall(final Sprite sprite, final Permeability permeability) {
		super(sprite, permeability);
	}

	@Override
	public MotionlessElement createBackground() {
		return null;
	}
}
