package model.element.mobile;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Map;
import model.element.Permeability;
import model.element.SpriteFactory;

public class BehaviorFallTest {

	@Test
	public void testDoSomething() {
		final Boulder boulder = new Boulder(2, 1, SpriteFactory.createBoulder(), new Map(1), Permeability.PUSHABLE);
		final int expectedY = boulder.getY();
		boulder.doSomething.doSomething();
		assertEquals(expectedY + 1, boulder.getY());
	}

}
