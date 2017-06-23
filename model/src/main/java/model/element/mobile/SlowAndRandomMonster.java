package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class SlowAndRandomMonster extends Monster {
    private static final Sprite SPRITE = new Sprite(7, "monster4");

    public SlowAndRandomMonster(final Sprite sprite, final Permeability permeability) {
        super(this.position, SPRITE, this.map, permeability);
    }

}
