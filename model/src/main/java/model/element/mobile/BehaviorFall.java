package model.element.mobile;

import model.element.Permeability;

// TODO: Auto-generated Javadoc
/**
 * The Class BehaviorFall.
 */
public class BehaviorFall extends BehaviorDoSomething {

	/* (non-Javadoc)
	 * @see model.element.mobile.BehaviorDoSomething#doSomething()
	 */
	@Override
	public void doSomething() {
		int x = this.mobile.getX();
		int y = this.mobile.getY();

		if (this.mobile.getMap().getOnTheMapXY(x, y + 1).getPermeability() == Permeability.PENETRABLEFOROTHERS) {
			this.mobile.moveDown();
			this.mobile.setFalling(true);

		} else if ((this.mobile.getMap().getOnTheMapXY(x, y + 1).getPermeability() == Permeability.KILLABLE)
				&& (this.mobile.isFalling() == true)) {
			this.mobile.getMap().getMobileXY(x, y + 1).die();
			this.mobile.moveDown();
		} else if ((this.mobile.getMap().getOnTheMapXY(x, y + 1).getPermeability() == Permeability.PUSHABLE)
				|| (this.mobile.getMap().getOnTheMapXY(x, y + 1).getPermeability() == Permeability.COLLECTABLE)) {
			if (this.glide(this.mobile.getX(), this.mobile.getY(), "right")) {
				this.mobile.moveRight();
			} else if (this.glide(this.mobile.getX(), this.mobile.getY(), "left")) {
				this.mobile.moveLeft();
			} else {
				this.mobile.doNothing();
				;
			}
		} else {
			this.mobile.doNothing();
		}

	}

	/**
	 * Glide.
	 *
	 * @param x the x
	 * @param y the y
	 * @param direction the direction
	 * @return true, if successful
	 */
	public boolean glide(int x, int y, final String direction) {
		int sideX = 0;
		switch (direction) {
		case "right":
			sideX = this.mobile.getX() + 1;
			break;
		case "left":
			sideX = this.mobile.getX() - 1;
			break;
		case "both":
			if (this.random(0, 1) == 0) {
				sideX = this.mobile.getX() - 1;
			} else {
				sideX = this.mobile.getX() + 1;
			}
			break;
		}

		if ((this.mobile.getMap().getOnTheMapXY(sideX, this.mobile.getY())
				.getPermeability() == Permeability.PENETRABLEFOROTHERS)
				&& (this.mobile.getMap().getOnTheMapXY(sideX, this.mobile.getY() + 1)
						.getPermeability() == Permeability.PENETRABLEFOROTHERS)) {
			return true;
		}
		return false;
	}

	/**
	 * Random.
	 *
	 * @param mini the mini
	 * @param maxi the maxi
	 * @return the int
	 */
	public int random(double mini, double maxi) {
		mini = Math.ceil(mini);
		maxi = Math.floor(maxi);
		return (int) ((int) (Math.floor(((Math.random() * maxi) - mini) + 1)) + mini);
	}
}
