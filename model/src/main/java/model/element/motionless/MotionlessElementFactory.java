package model.element.motionless;

public abstract class MotionlessElementFactory {
	private static Background background = new Background();
	private static Ground ground = new Ground();
	private static Wall wall = new Wall();
	private static DiamondCounter diamondCounter = new DiamondCounter();
	private static DeathStar deathStar = new DeathStar();

	public static MotionlessElement createBackground(){
		return null;

	}

	public static MotionlessElement createDeathStar(){
		return null;

	}

	public static MotionlessElement createDiamondCounter(){
		return null;

	}

	public static MotionlessElement createGround(){
		return null;

	}

	public static MotionlessElement createWall(){
		return null;

	}
}
