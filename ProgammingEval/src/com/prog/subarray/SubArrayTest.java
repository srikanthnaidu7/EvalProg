package com.prog.subarray;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SubArrayTest {
	SubArray subArray = null;
	@Before
	public void setUp() throws Exception {
		subArray = new SubArray();
	}

	@After
	public void tearDown() throws Exception {
		subArray = null;
	}

	@Test
	public void testSubArraycase1() {
		int arr[] = {12, 5, 31, 9, 21, 8};
		subArray.checksubArray(arr, 61);
	}
	
	@Test
	public void testSubArraycase2() {
		int arr[] = {1,2,3,4};
		subArray.checksubArray(arr, 5);
	}

}
