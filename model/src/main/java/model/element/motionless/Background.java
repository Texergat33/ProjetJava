package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Background extends MotionlessElement {

	public Background(final Sprite sprite, final Permeability permeability) {
		super(sprite, permeability);
	}

	@Override
	public MotionlessElement createBackground() {
		return null;
	}
}
