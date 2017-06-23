package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class IronWall extends MotionlessElement {

    public IronWall(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }

    @Override
    public MotionlessElement createBackground() {
        // TODO Auto-generated method stub
        return null;
    }

}
