package model.element.motionless;

public abstract class MotionlessElementFactory {

	private static Background		background		= new Background();
	private static Ground			ground			= new Ground();
	private static Wall				wall			= new Wall();
	private static DiamondCounter	diamondCounter	= new DiamondCounter();
	private static DeathStar		deathStar		= new DeathStar();

	private static MotionlessElement[] motionlessElements = {
			background,
			ground,
			wall,
			diamondCounter,
			deathStar
	};

	public static MotionlessElement createBackground() {
		return background;
	}

	public static MotionlessElement createDeathStar() {
		return deathStar;
	}

	public static MotionlessElement createDiamondCounter() {
		return diamondCounter;
	}

	public static MotionlessElement createGround() {
		return ground;
	}

	public static MotionlessElement createWall() {
		return wall;
	}

	public static MotionlessElement getElementFromFileSymbol(int elementID) {
		for (MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSprite().getDatabaseIDImage() == elementID) {
				return motionlessElement;
			}
		}
		return ground;
	}
}
