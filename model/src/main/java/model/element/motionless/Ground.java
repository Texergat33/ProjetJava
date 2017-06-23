package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Ground extends MotionlessElement {
    private static final Sprite SPRITE = new Sprite(3, "ground.png");

    public Ground() {
        super(SPRITE, Permeability.PENETRABLEFOREVERYONE);
    }

    @Override
    public MotionlessElement createBackground() {
        // TODO Auto-generated method stub
        return null;
    }
}
