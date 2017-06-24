package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.element.Permeability;
import model.element.SpriteFactory;
import model.element.mobile.Miner;

public class MinerTest {

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
	public void testDie() {
		fail("Not yet implemented");
	}

	@Test
	public void testDoNothing() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveDown() {
		Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerRight1"), new Map(1), Permeability.KILLABLE);

		int x = miner.getX();

		miner.moveRight();

		assertEquals(x - 1, miner.getY());
	}

	@Test
	public void testMoveLeft() {
		Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerLeft1"), new Map(1), Permeability.KILLABLE);

		int x = miner.getX();

		miner.moveLeft();

		assertEquals(x - 1, miner.getY());
	}

	@Test
	public void testMoveRight() {
		Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerRight1"), new Map(1), Permeability.KILLABLE);

		int x = miner.getX();

		miner.moveRight();

		assertEquals(x + 1, miner.getY());
	}

	@Test
	public void testMoveUp() {
		Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerUp"), new Map(1), Permeability.KILLABLE);

		int y = miner.getY();

		miner.moveUp();

		assertEquals(y - 1, miner.getY());
	}

}
