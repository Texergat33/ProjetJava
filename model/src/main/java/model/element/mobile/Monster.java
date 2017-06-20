package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public abstract class Monster extends Mobile {

	public Monster(Point position, Sprite sprite, IMap map, Permeability permeability) {
		super(position, sprite, map, permeability);
		// TODO Auto-generated constructor stub
	}

}
