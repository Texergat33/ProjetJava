package model.element.mobile;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class Diamond extends Boulder {

	public Diamond(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
		super(x, y, sprite, map, permeability);
		this.doSomething = new BehaviorFall();
	}

	@Override
	public void collect() {
		this.getMap().setDiamondCounter(this.getMap().getDiamondCounter() - 1);
		this.ruin();
	}

}
