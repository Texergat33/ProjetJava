package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Map;
import model.element.Permeability;
import model.element.SpriteFactory;
import model.element.mobile.Miner;

public class BoulderDashControllerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBoulderDashController() {
		fail("Not yet implemented");
	}

	@Test
	public void testEmptyOrderPile() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetModel() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOrderPerformer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOrderPile() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetView() {
		fail("Not yet implemented");
	}

	@Test
	public void testOrderPerform() {
		fail("Not yet implemented");
	}

	@Test
	public void testPlay() {
		BoulderDashController controller = new BoulderDashController(null, null);
		Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerRight1"), new Map(1),Permeability.KILLABLE);
		miner.die();
		assertEquals(controller.play(), controller.getView().displayMessage("Game over"));
	}

	@Test
	public void testSetOrderPile() {
		fail("Not yet implemented");
	}

}
