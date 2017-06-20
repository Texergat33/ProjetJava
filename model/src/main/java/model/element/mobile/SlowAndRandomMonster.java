package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class SlowAndRandomMonster extends Monster {
	private static final Sprite SPRITE = new Sprite("monster4");

	public SlowAndRandomMonster(Sprite sprite, Permeability permeability) {
		super(this.position, SPRITE, this.map, permeability);
		// TODO Auto-generated constructor stub
	}

}
