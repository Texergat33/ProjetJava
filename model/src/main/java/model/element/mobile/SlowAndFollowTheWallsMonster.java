package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class SlowAndFollowTheWallsMonster extends Monster {
	private static final Sprite SPRITE = new Sprite(6, "monster2");

	public SlowAndFollowTheWallsMonster(Sprite sprite, Permeability permeability) {
		super(this.position, SPRITE, this.map, permeability);
	}
}
