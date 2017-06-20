package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class Boulder extends Mobile {
	private static final Sprite SPRITE = new Sprite("diamond.png");

	public Boulder(Point position, Sprite sprite, IMap map, Permeability permeability) {
		super(position, SPRITE, map, permeability);
		// TODO Auto-generated constructor stub
	}

}
