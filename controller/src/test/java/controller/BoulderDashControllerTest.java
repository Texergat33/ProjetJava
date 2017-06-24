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

// TODO: Auto-generated Javadoc
/**
 * The Class BoulderDashControllerTest.
 */
public class BoulderDashControllerTest {

	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Tear down after class.
	 *
	 * @throws Exception the exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test boulder dash controller.
	 */
	@Test
	public void testBoulderDashController() {
		fail("Not yet implemented");
	}

	/**
	 * Test empty order pile.
	 */
	@Test
	public void testEmptyOrderPile() {
		fail("Not yet implemented");
	}

	/**
	 * Test get model.
	 */
	@Test
	public void testGetModel() {
		fail("Not yet implemented");
	}

	/**
	 * Test get order performer.
	 */
	@Test
	public void testGetOrderPerformer() {
		fail("Not yet implemented");
	}

	/**
	 * Test get order pile.
	 */
	@Test
	public void testGetOrderPile() {
		fail("Not yet implemented");
	}

	/**
	 * Test get view.
	 */
	@Test
	public void testGetView() {
		fail("Not yet implemented");
	}

	/**
	 * Test order perform.
	 */
	@Test
	public void testOrderPerform() {
		fail("Not yet implemented");
	}

	/**
	 * Test play.
	 */
	@Test
	public void testPlay() {
		BoulderDashController controller = new BoulderDashController(null, null);
		Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerRight1"), new Map(1),Permeability.KILLABLE);
		miner.die();
		assertEquals(controller.play(), controller.getView().displayMessage("Game over"));
	}

	/**
	 * Test set order pile.
	 */
	@Test
	public void testSetOrderPile() {
		fail("Not yet implemented");
	}

}
