package model;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.element.mobile.Mobile;

public class MobileTest {
	private Mobile mobile;

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
	public void testGetX() {
		assertNotNull(this.mobile.getX());
	}

	@Test
	public void testGetY() {
		assertNotNull(this.mobile.getY());
	}

}
