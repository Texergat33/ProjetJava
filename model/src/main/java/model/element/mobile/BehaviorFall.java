package model.element.mobile;

import model.element.Permeability;

public class BehaviorFall extends BehaviorDoSomething {

	@Override
	public void doSomething() {
		int x = this.mobile.getX();
		int y = this.mobile.getY();

		if (this.mobile.getMap().getOnTheMapXY(x, y + 1).getPermeability() == Permeability.PENETRABLEFORBOULDER) {
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
			}
		} else {
			this.mobile.doNothing();
		}

	}

	public boolean glide(int x, int y, final String direction) {
		int sideX = 0;
		switch (direction) {
		case "right":
			sideX = this.mobile.getX() + 1;
			break;
		case "left":
			sideX = this.mobile.getX() - 1;
			break;
		}
		if ((this.mobile.getMap().getOnTheMapXY(sideX, this.mobile.getY())
				.getPermeability() == Permeability.PENETRABLEFORBOULDER)
				&& (this.mobile.getMap().getOnTheMapXY(sideX, this.mobile.getY() + 1)
						.getPermeability() == Permeability.PENETRABLEFORBOULDER)) {
			return true;
		}
		return false;
	}
}
