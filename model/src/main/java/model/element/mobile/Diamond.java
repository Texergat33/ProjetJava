package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class Diamond extends Boulder {

    private static final Sprite SPRITE = new Sprite(9, "diamond.png");

    public Diamond(final Point position, final Sprite sprite, final IMap map, final Permeability permeability) {
        super(position, SPRITE, map, permeability);
    }

    @Override
    public void collect() {
        this.getMap().setDiamondCounter(this.getMap().getDiamondCounter() - 1);
        this.ruin();
    }

}
