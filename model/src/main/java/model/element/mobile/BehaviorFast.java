package model.element.mobile;

import model.element.Permeability;

public class BehaviorFast extends BehaviorDoSomething {
	@Override
	public void doSomething() {
		int x = this.mobile.getX();
		int y = this.mobile.getY();
	for (int i = 0; i<2; i++)
		switch (this.random(1, 4)){
		case 1:
			if (this.mobile.getMap().getOnTheMapXY(x, y+1).getPermeability() == Permeability.PENETRABLEFOROTHERS){
				this.mobile.moveDown();
			}
			break;
		case 2:
			if (this.mobile.getMap().getOnTheMapXY(x-1, y).getPermeability() == Permeability.PENETRABLEFOROTHERS){
				this.mobile.moveLeft();
			}
			break;
				
		case 3:
			if (this.mobile.getMap().getOnTheMapXY(x, y -1).getPermeability() == Permeability.PENETRABLEFOROTHERS){
				this.mobile.moveUp();
			}
			break;
			
		case 4:
			if (this.mobile.getMap().getOnTheMapXY(x+1, y).getPermeability() == Permeability.PENETRABLEFOROTHERS){
				this.mobile.moveRight();
			}
			break;
		}
	}
	
		public int random(double mini, double maxi) {
			mini = Math.ceil(mini);
			maxi = Math.floor(maxi);
			return (int) ((int) (Math.floor(((Math.random() * maxi) - mini) + 1)) + mini);
	}
	
}
