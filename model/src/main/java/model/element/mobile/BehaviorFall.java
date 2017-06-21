package model.element.mobile;

public class BehaviorFall extends BehaviorDoSomething {

	@Override
	public void doSomething() {
		int x = this.mobile.getX();
		int y = this.mobile.getY();

		this.mobile.getMap().getOnTheMapXY(x, y - 1);

		if(getElement == background){
			moveDown();
			else donothing();
		}

	}
	// this.getMobile() pour voir si ya un truc en dessous si rien move down
}
