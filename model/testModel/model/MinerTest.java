package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
		final Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerRight1"), new Map(1),
				Permeability.KILLABLE);
		miner.die();
		assertFalse(miner.alive);
	}

	@Test
	public void testDoNothing() {
		final Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerRight1"), new Map(1),
				Permeability.KILLABLE);
		final int expectedX = 2;
		final int expectedY = 2;
		miner.doNothing();
		assertEquals(expectedX, miner.getX());
		assertEquals(expectedY, miner.getY());
	}

	@Test
	public void testMoveDown() {
		final Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerRight1"), new Map(1),
				Permeability.KILLABLE);

		final int y = 2;

		miner.moveDown();

		assertEquals(y + 1, miner.getY());
	}

	@Test
	public void testMoveLeft() {
		final Miner miner = new Miner(6, 2, SpriteFactory.createMiner("MinerLeft1"), new Map(1), Permeability.KILLABLE);

		final int x = 2;

		miner.moveLeft();

		final int expected = x - 1;

		assertEquals(expected, miner.getX());
	}

	@Test
	public void testMoveRight() {
		final Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerRight1"), new Map(1),
				Permeability.KILLABLE);

		final int x = miner.getX();

		miner.moveRight();

		final int expected = x + 1;

		assertEquals(expected, miner.getX());
	}

	@Test
	public void testMoveUp() {
		final Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerUp"), new Map(1), Permeability.KILLABLE);

		final int y = miner.getY();

		miner.moveUp();

		assertEquals(y - 1, miner.getY());
	}

}
