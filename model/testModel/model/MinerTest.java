package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.element.Permeability;
import model.element.SpriteFactory;
import model.element.mobile.Miner;

// TODO: Auto-generated Javadoc
/**
 * The Class MinerTest.
 */
public class MinerTest {

    /**
     * Sets the up before class.
     *
     * @throws Exception
     *             the exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * Tear down after class.
     *
     * @throws Exception
     *             the exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * Sets the up.
     *
     * @throws Exception
     *             the exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * Tear down.
     *
     * @throws Exception
     *             the exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test die.
     */
    @Test
    public void testDie() {
        final Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerRight1"), new Map(1),
                Permeability.KILLABLE);
        miner.die();
        assertFalse(miner.alive);
    }

    /**
     * Test do nothing.
     */
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

    /**
     * Test move down.
     */
    @Test
    public void testMoveDown() {
        final Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerRight1"), new Map(1),
                Permeability.KILLABLE);

        final int y = 2;

        miner.moveDown();

        assertEquals(y + 1, miner.getY());
    }

    /**
     * Test move left.
     */
    @Test
    public void testMoveLeft() {
        final Miner miner = new Miner(6, 2, SpriteFactory.createMiner("MinerLeft1"), new Map(1), Permeability.KILLABLE);

        final int x = 2;

        miner.moveLeft();

        final int expected = x - 1;

        assertEquals(expected, miner.getX());
    }

    /**
     * Test move right.
     */
    @Test
    public void testMoveRight() {
        final Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerRight1"), new Map(1),
                Permeability.KILLABLE);

        final int x = miner.getX();

        miner.moveRight();

        final int expected = x + 1;

        assertEquals(expected, miner.getX());
    }

    /**
     * Test move up.
     */
    @Test
    public void testMoveUp() {
        final Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerUp"), new Map(1), Permeability.KILLABLE);

        final int y = miner.getY();

        miner.moveUp();

        assertEquals(y - 1, miner.getY());
    }

    /**
     * Test get X.
     */
    @Test
    public void testGetX() {
        // we did this test to verify if the method getX() wasn't returning null
        // because the moveUp, moveDown, moveLeft, moveRight tests failed
        final Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerUp"), new Map(1), Permeability.KILLABLE);
        assertNotNull(miner.getX());
    }

    /**
     * Test get Y.
     */
    @Test
    public void testGetY() {
        final Miner miner = new Miner(2, 2, SpriteFactory.createMiner("MinerUp"), new Map(1), Permeability.KILLABLE);
        assertNotNull(miner.getY());
    }

}
