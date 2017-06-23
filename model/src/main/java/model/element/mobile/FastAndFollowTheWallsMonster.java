package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;
import model.element.motionless.MotionlessElement;

public class FastAndFollowTheWallsMonster extends Monster {
    private static final Sprite SPRITE = new Sprite(11, "monster1");

    public FastAndFollowTheWallsMonster(final Point position, final Sprite sprite, final IMap map,
            final Permeability permeability) {
        super(position, SPRITE, map, permeability);
    }

    @Override
    public Point position(final int i, final int y) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void shift(final int i) {
        // TODO Auto-generated method stub

    }

    @Override
    public MotionlessElement createBackground() {
        // TODO Auto-generated method stub
        return null;
    }

}
