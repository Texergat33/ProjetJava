package model.element.motionless;

public abstract class MotionlessElementFactory {

    private static Background background = new Background();
    private static Ground     ground     = new Ground();
    private static Wall       wall       = new Wall();

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
