package model.element.motionless;

public abstract class MotionlessElementFactory {

	private static Background		background		= new Background(null, null);
	private static Ground			ground			= new Ground(null, null);
	private static Wall				wall			= new Wall(null, null);
	private static DiamondCounter	diamondCounter	= new DiamondCounter(null, null);
	private static DeathStar		deathStar		= new DeathStar(null, null);

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
}
