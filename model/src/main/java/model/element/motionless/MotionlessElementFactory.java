package model.element.motionless;

import model.element.Permeability;
import model.element.SpriteFactory;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating MotionlessElement objects.
 */
public abstract class MotionlessElementFactory {

	/** The background. */
	private static Background background = new Background(SpriteFactory.createBackground(),
			Permeability.PENETRABLEFOREVERYONE);

	/** The wall. */
	private static Wall wall = new Wall(SpriteFactory.createWall(), Permeability.BLOCKINGFOREVERYONE);

	/** The iron wall. */
	private static IronWall ironWall = new IronWall(SpriteFactory.createIronWall(), Permeability.BLOCKINGFOREVERYONE);

	/** The motionless elements. */
	private static MotionlessElement[] motionlessElements = { background, wall,

	};

	/**
	 * Creates a new MotionlessElement object.
	 *
	 * @return the motionless element
	 */
	public static MotionlessElement createBackground() {
		return background;
	}

	/**
	 * Creates a new MotionlessElement object.
	 *
	 * @return the motionless element
	 */
	public static MotionlessElement createIronWall() {
		return ironWall;
	}

	/**
	 * Creates a new MotionlessElement object.
	 *
	 * @return the motionless element
	 */
	public static MotionlessElement createWall() {
		return wall;
	}

	/**
	 * Gets the element from file symbol.
	 *
	 * @param elementID
	 *            the element ID
	 * @return the element from file symbol
	 */
	public static MotionlessElement getElementFromFileSymbol(final int elementID) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSprite().getDatabaseIDImage() == elementID) {
				return motionlessElement;
			}
		}
		return ironWall;
	}
}
