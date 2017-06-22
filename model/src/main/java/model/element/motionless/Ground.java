package model.element.motionless;

import model.element.Permeability;

public class Ground extends MotionlessElement {

	public Ground() {
		super(SPRITE, Permeability.PENETRABLEFOREVERYONE);
	}
}
