package model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * <h1>The test for Map.</h1>
 * 
 * @author Alyssa BINARD
 * @version 1.0
 * @see After
 * @see AfterClass
 * @see Before
 * @see BeforeClass
 * @see Test
 */
public class MapTest {
	/** The map */
	private Map map;

	/**
	 * (non-javadoc) setUpBeforeClass
	 * 
	 * @throws Exception
	 * 			the Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * (non-javadoc) tearDownAfterClass
	 * 
	 * @throws Exception
	 * 			the Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * setUp
	 * 
	* @throws Exception
	 * 			the Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.map = new Map(1, "Key", "map");
	}

	/**
	 * (non-javadoc) tearDown
	 * 
	 * @throws Exception
	 * 			the Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test of GetID
	 */
	@Test
	public void testGetID() {
		final int expected = 1;
		assertEquals(expected, this.map.getId());
	}
	/*
	 * 
	 * @Test public void testSetMap() { String expected = "Map";
	 * assertEquals(expected, this.map.getMap()); expected = "map modified";
	 * this.map.setMap(expected); assertEquals(expected, this.map.getMap()); }
	 * 
	 * @Test public void testToString() { final String expected = "1 : Map test";
	 * assertEquals(expected, this.map.toString()); }
	 */

}