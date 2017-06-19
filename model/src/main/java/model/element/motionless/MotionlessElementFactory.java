package model.element.motionless;

public abstract class MotionlessElementFactory {
	private static Background background = new Background();
	private static Ground ground = new Ground();
	private static Wall wall = new Wall();
	private static DiamondCounter diamondCounter = new DiamondCounter();
	private static DeathStar deathStar = new DeathStar();

	public static MotionlessElement createBackground(){

	}

	public static MotionlessElement createDeathStar(){

	}

	public static MotionlessElement createDiamondCounter(){

	}

	public static MotionlessElement createGround(){

	}

	public static MotionlessElement createWall(){

	}
}
