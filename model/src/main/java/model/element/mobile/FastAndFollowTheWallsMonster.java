package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class FastAndFollowTheWallsMonster extends Monster {
	private static final Sprite SPRITE = new Sprite("monster1");

	public FastAndFollowTheWallsMonster(Sprite sprite, Permeability permeability) {
		super(this.position, SPRITE, this.map, permeability);
		// TODO Auto-generated constructor stub
	}

}
