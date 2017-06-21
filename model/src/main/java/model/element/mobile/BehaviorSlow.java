package model.element.mobile;

import model.element.Permeability;

public class BehaviorSlow extends BehaviorDoSomething {
	int position;

	@Override
	public void doSomething() {
		int x = this.mobile.getX();
		int y = this.mobile.getY();

		if (this.mobile.getMap().getOnTheMapXY(x, y + 1).getPermeability() == Permeability.PENETRABLEFORMONSTER) {
			this.direction(x, y);
			this.mobile.moveDown();
		} else if (this.mobile.getMap().getOnTheMapXY(x, y - 1)
				.getPermeability() == Permeability.PENETRABLEFORMONSTER) {
			this.mobile.moveUp();
		} else if (this.mobile.getMap().getOnTheMapXY(x + 1, y)
				.getPermeability() == Permeability.PENETRABLEFORMONSTER) {
			this.mobile.moveRight();
		} else if (this.mobile.getMap().getOnTheMapXY(x - 1, y)
				.getPermeability() == Permeability.PENETRABLEFORMONSTER) {
			this.mobile.moveLeft();
		} else {
			this.mobile.doNothing();
		}

	}

	public void direction() {
		switch (this.random(1, 4)) {
		case 1:
			this.position = this.mobile.getX() - 1;
			break;
		case 2:
			this.position = this.mobile.getX() + 1;
			break;
		case 3:
			this.position = this.mobile.getY() + 1;
			break;
		case 4:
			this.position = this.mobile.getY() - 1;
			break;
		}
	}

	public int random(int max, int min) {
		int random = (int) ((Math.random() * max) + min);
		return random;
	}
}
