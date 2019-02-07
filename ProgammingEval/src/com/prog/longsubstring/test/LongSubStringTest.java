package com.prog.longsubstring.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.prog.longsubstring.LongSubString;

public class LongSubStringTest {

	LongSubString longSubString = new LongSubString();
	
	@Before
	public void setUp() throws Exception {
		
		longSubString = new LongSubString();
	}

	@After
	public void tearDown() throws Exception {
		longSubString = null;
	}

	@Test
	public void testlenSubStrCase1() {
		int len = longSubString.longSubString("abcabcbb");
		assertEquals(3, len);
	}
	
	@Test
	public void testlenSubStrCase2() {
		int len = longSubString.longSubString("bbbbb");
		assertEquals(1, len);
	}

	@Test
	public void testlenSubStrCase3() {
		int len = longSubString.longSubString("ababcc");
		System.out.println(len);
		assertEquals(3, len);
	}
	
}
