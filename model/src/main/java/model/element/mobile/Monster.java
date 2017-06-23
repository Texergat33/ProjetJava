package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public abstract class Monster extends Mobile {

    public Monster(final Point position, final Sprite sprite, final IMap map, final Permeability permeability) {
        super(position, sprite, map, permeability);
        // TODO Auto-generated constructor stub
    }

}
