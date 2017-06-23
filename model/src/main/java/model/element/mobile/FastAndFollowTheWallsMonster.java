package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class FastAndFollowTheWallsMonster extends Monster {
    private static final Sprite SPRITE = new Sprite(11, "monster1");

    public FastAndFollowTheWallsMonster(final Sprite sprite, final Permeability permeability) {
        super(this.position, SPRITE, this.map, permeability);
    }
}
