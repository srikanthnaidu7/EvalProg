package com.prog.stringanagram.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.prog.stringanagram.StringAnagram;

public class StringAnagramTest {

	StringAnagram strAnagram = null;
	@Before
	public void before(){
		strAnagram = new StringAnagram();
	}
	@Test
	public void testcheckAnagramCase1() {
		boolean check = strAnagram.checkAnagram("test", "tste");
		assertTrue(check);
	}
	
	@Test
	public void testcheckAnagramCase2() {
		boolean check = strAnagram.checkAnagram("JAVA", "AVJA");
		assertTrue(check);
	}
	
	@Test
	public void testcheckAnagramCase3() {
		boolean check = strAnagram.checkAnagram("dealer", "LEADER");
		assertTrue(check);
	}
	
	@Test
	public void testcheckAnagramCase4() {
		boolean check = strAnagram.checkAnagram("dea ler", "L EADER");
		assertTrue(check);
	}
	
	//Check the length
	@Test
	public void testcheckAnagramCase5() {
		boolean check = strAnagram.checkAnagram("java", "LEADER");
		assertFalse(check);
	}
	
	@Test
	public void testcheckAnagramCase6() {
		boolean check = strAnagram.checkAnagram("ja va", "vaj");
		assertFalse(check);
	}
	
	@After
	public void after(){
		strAnagram = null;
	}
}
