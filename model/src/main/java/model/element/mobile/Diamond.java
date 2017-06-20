package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class Diamond extends Boulder {
	private static final Sprite SPRITE = new Sprite("boulder.png");

	public Diamond(Point position, Sprite sprite, IMap map, Permeability permeability) {
		super(position, SPRITE, map, permeability);
		// TODO Auto-generated constructor stub
	}

}
