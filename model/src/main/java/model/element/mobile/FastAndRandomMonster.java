package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class FastAndRandomMonster extends Monster {
	private static final Sprite SPRITE = new Sprite(10, "monster3");

	public FastAndRandomMonster(Sprite sprite, Permeability permeability) {
		super(this.position, SPRITE, this.map, permeability);
	}
}
