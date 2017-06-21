package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Background extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite(2, "background.png");

	public Background() {
		super(SPRITE, Permeability.PENETRABLEFOREVERYONE);
	}
}
