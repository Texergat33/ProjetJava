package model.element.mobile;

import model.element.Permeability;

// TODO: Auto-generated Javadoc
/**
 * The Class BehaviorFast.
 */
public class BehaviorFast extends BehaviorDoSomething {
	
	/* (non-Javadoc)
	 * @see model.element.mobile.BehaviorDoSomething#doSomething()
	 */
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
