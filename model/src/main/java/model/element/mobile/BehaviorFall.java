package model.element.mobile;

import model.element.Permeability;

public class BehaviorFall extends BehaviorDoSomething {

	@Override
	public void doSomething() {
		int x = this.mobile.getX();
		int y = this.mobile.getY();

		if(this.mobile.getMap().getOnTheMapXY(x, y + 1).getPermeability() == Permeability.PENETRABLEFORBOULDER) {
			this.mobile.moveDown();
			this.mobile.setFalling(true);

		}else if((this.mobile.getMap().getOnTheMapXY(x, y + 1).getPermeability() == Permeability.KILLABLE) && (this.mobile.isFalling() == true) ){
			this.mobile.getMap().getOnTheMapXY(x, y + 1).die()
		}

	}
	// this.getMobile() pour voir si ya un truc en dessous si rien move down
}
