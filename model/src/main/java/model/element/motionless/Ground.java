package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Ground extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite(3, "ground.png");

	public Ground() {
		super(SPRITE, Permeability.PENETRABLEFOREVERYONE);
	}
}
