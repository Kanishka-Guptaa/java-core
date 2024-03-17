package com.learning.core.day10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class D10P08 
{
	Calculator c = new Calculator();
		
	@Test
	public void testMul()
	{
		assertEquals(30,c.mul(2, 15));
	}
	
	@Test
	public void testDiv()
	{
		assertEquals(4,c.div(20, 5));
	}
	
	@Test
	public void testDiv1()
	{
		assertEquals(4,c.div(20, 0));
	}
}
