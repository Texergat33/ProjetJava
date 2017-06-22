package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Wall extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite(4, "wall.png");

	public Wall() {
		super(SPRITE, Permeability.BLOCKINGFOREVERYONE);
	}
}
