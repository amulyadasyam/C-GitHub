package com.Ass2.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Ass2.ArrayOperations;

public class ArrayOpeartionsTest {

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
	public void testArrcpy() {
		ArrayOperations ao = new ArrayOperations();
		int[] arr = {8,10,13,14};
		int[] resarr = {14,8,10,13};
		assertArrayEquals(resarr,ao.arrcpy(arr));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testFind_Median() {
		ArrayOperations ao = new ArrayOperations();
		int[] arr = {10,20,30};
		assertEquals(20.0, ao.find_median(arr),0.0);
	}

}
