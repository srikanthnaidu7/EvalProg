package com.prog.stringconversion.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.prog.stringconversion.ConvertStringToInt;

public class ConvertStringToIntTest {

	ConvertStringToInt convStrToInt = null;
	@Before
	public void setUp() throws Exception {
		convStrToInt = new ConvertStringToInt();
	}

	@After
	public void tearDown() throws Exception {
		
		convStrToInt = null;
	}

	@Test
	public void convertStringToIntCase1() {
		int result = convStrToInt.convertStringToInt("567");
		System.out.println("result:"+result);
		assertEquals(567, result);
	}
	
	@Test
	public void convertStringToIntCase2() {
		int result = convStrToInt.convertStringToInt("-567");
		System.out.println("result:"+result);
		assertEquals(-567, result);
	}
	
	@Test
	public void convertStringToIntCase3() {
		int result = convStrToInt.convertStringToInt("5 67");
		System.out.println("result:"+result);
		assertEquals(567, result);
	}
	
	
	
}
