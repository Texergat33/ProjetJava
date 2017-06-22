package model.element.mobile;

import model.element.Permeability;

public class BehaviorSlow extends BehaviorDoSomething {
	int position;

	@Override
	public void doSomething() {
		int x = this.mobile.getX();
		int y = this.mobile.getY();

		switch (this.random(1, 4)) {
		case 1:
			if (this.mobile.getMap().getOnTheMapXY(x, y + 1).getPermeability() == Permeability.PENETRABLEFORMONSTER) {
				this.mobile.moveDown();
			}
			break;
		case 2:
			if (this.mobile.getMap().getOnTheMapXY(x, y - 1).getPermeability() == Permeability.PENETRABLEFORMONSTER) {
				this.mobile.moveUp();
			}
			break;
		case 3:
			if (this.mobile.getMap().getOnTheMapXY(x + 1, y).getPermeability() == Permeability.PENETRABLEFORMONSTER) {
				this.mobile.moveRight();
			}
			break;
		case 4:
			if (this.mobile.getMap().getOnTheMapXY(x - 1, y).getPermeability() == Permeability.PENETRABLEFORMONSTER) {
				this.mobile.moveLeft();
			}
			break;
		default:
			this.mobile.doNothing();
		}
	}

	public int random(int max, int min) {
		int random = (int) ((Math.random() * max) + min);
		return random;
	}
}
