package model.element.mobile;

public class BehaviorSlow extends BehaviorDoSomething {
	int position;

	@Override
	/*-public void other() {
		int x = this.mobile.getX();
		int y = this.mobile.getY();
	
		if (this.mobile.getMap().getOnTheMapXY(x, y + 1).getPermeability() == Permeability.PENETRABLEFORMONSTER) {
			this.direction();
			this.mobile.moveDown();
		} else if (this.mobile.getMap().getOnTheMapXY(x, y - 1)
				.getPermeability() == Permeability.PENETRABLEFORMONSTER) {
			this.direction();
			this.mobile.moveUp();
		} else if (this.mobile.getMap().getOnTheMapXY(x + 1, y)
				.getPermeability() == Permeability.PENETRABLEFORMONSTER) {
			this.direction();
			this.mobile.moveRight();
		} else if (this.mobile.getMap().getOnTheMapXY(x - 1, y)
				.getPermeability() == Permeability.PENETRABLEFORMONSTER) {
			this.direction();
			this.mobile.moveLeft();
		} else {
			this.mobile.doNothing();
		}
	
	}*/

	public void doSomething() {
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
