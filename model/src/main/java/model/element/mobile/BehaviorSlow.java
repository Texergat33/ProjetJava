package model.element.mobile;

import model.element.Permeability;

// TODO: Auto-generated Javadoc
/**
 * The Class BehaviorSlow.
 */
public class BehaviorSlow extends BehaviorDoSomething {
	
	/** The position. */
	int position;

	/* (non-Javadoc)
	 * @see model.element.mobile.BehaviorDoSomething#doSomething()
	 */
	@Override
	public void doSomething() {
		int x = this.mobile.getX();
		int y = this.mobile.getY();

		switch (this.random(1, 4)) {
		case 1:
			if (this.mobile.getMap().getOnTheMapXY(x, y + 1).getPermeability() == Permeability.PENETRABLEFOROTHERS) {
				this.mobile.moveDown();
			}
			break;
		case 2:
			if (this.mobile.getMap().getOnTheMapXY(x, y - 1).getPermeability() == Permeability.PENETRABLEFOROTHERS) {
				this.mobile.moveUp();
			}
			break;
		case 3:
			if (this.mobile.getMap().getOnTheMapXY(x + 1, y).getPermeability() == Permeability.PENETRABLEFOROTHERS) {
				this.mobile.moveRight();
			}
			break;
		case 4:
			if (this.mobile.getMap().getOnTheMapXY(x - 1, y).getPermeability() == Permeability.PENETRABLEFOROTHERS) {
				this.mobile.moveLeft();
			}
			break;
		default:
			this.mobile.doNothing();
		}
	}

	/**
	 * Random.
	 *
	 * @param max the max
	 * @param min the min
	 * @return the int
	 */
	public int random(int max, int min) {
		int random = (int) ((Math.random() * max) + min);
		return random;
	}
}
