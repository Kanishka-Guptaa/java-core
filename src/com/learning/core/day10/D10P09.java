package com.learning.core.day10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class D10P09 
{
	Calculator c = new Calculator();
	int arr1[] = {1,2,3,4,5,6};
	int arr2[] = {-1,-2,-3,-4,-5,-6};
	
	@Test
	public void testFindMax1()
	{
		assertEquals(6,c.findMax(arr1));
	}
	
	@Test
	public void testFindMax2()
	{
		assertEquals(-1,c.findMax(arr2));
	}
}
