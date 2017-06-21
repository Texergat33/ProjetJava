package model.element.mobile;

public class BehaviorFall extends BehaviorDoSomething {

	@Override
	public void doSomething() {
		this.getElement().getPosition();

	}
	// this.getMobile() pour voir si ya un truc en dessous si rien move down
}
