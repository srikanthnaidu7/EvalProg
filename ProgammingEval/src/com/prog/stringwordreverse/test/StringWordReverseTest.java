package com.prog.stringwordreverse.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.prog.stringwordreverse.StringWordReverse;

public class StringWordReverseTest {

	StringWordReverse strWordReverse = null;
	
	
	
	@Before
	public void before(){
		strWordReverse = new StringWordReverse();
	}
	@Test
	public void testStringWordReverse() {
		String str = strWordReverse.stringWordReverse("World Hello");
		assertEquals("Hello World", str);
	}
	
	@Test
	public void testStringWordReverseCase2() {
		String str = strWordReverse.stringWordReverse("the sky is dark");
		assertEquals("dark is sky the", str);
	}
	
	@After
	public void after(){
		strWordReverse = null;
	}
}
