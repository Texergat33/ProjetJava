package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Ground extends MotionlessElement {

    public Ground(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }

    @Override
    public MotionlessElement createBackground() {
        // TODO Auto-generated method stub
        return null;
    }
}
