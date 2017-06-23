package model.element.motionless;

import model.element.Permeability;
import model.element.SpriteFactory;

public abstract class MotionlessElementFactory {

    private static Background background = new Background(SpriteFactory.createBackground(),
            Permeability.PENETRABLEFOREVERYONE);
    private static Ground     ground     = new Ground(SpriteFactory.createGround(), Permeability.PENETRABLEFORMINER);
    private static Wall       wall       = new Wall(SpriteFactory.createWall(), Permeability.BLOCKINGFOREVERYONE);

    private static MotionlessElement[] motionlessElements = { background, ground, wall,

    };

    public static MotionlessElement createBackground() {
        return background;
    }

    public static MotionlessElement createGround() {
        return ground;
    }

    public static MotionlessElement createWall() {
        return wall;
    }

    public static MotionlessElement getElementFromFileSymbol(final int elementID) {
        for (final MotionlessElement motionlessElement : motionlessElements) {
            if (motionlessElement.getSprite().getDatabaseIDImage() == elementID) {
                return motionlessElement;
            }
        }
        return ground;
    }
}
