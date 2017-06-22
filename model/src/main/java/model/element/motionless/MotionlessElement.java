package model.element.motionless;

import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

abstract class MotionlessElement extends Element {
	public MotionlessElement(Sprite sprite, Permeability permeability) {
		super(sprite, permeability);
	}
}
