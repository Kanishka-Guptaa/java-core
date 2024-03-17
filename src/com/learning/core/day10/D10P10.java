package com.learning.core.day10;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class D10P10 
{
	@Test(timeout = 2000)
    public void testName1() 
	{
        assertTrue(UserProfile.validateUsername("Reyansh"));
    }

    @Test(timeout = 2000)
    public void testName2() 
    {
        assertFalse(UserProfile.validateUsername("Reyansh123"));
    }

    @Test(timeout = 2000)
    public void testPassword1() 
    {
        assertTrue(UserProfile.validatePassword("Abcd1234"));
    }

    @Test(timeout = 2000)
    public void testPassword2() 
    {
        assertFalse(UserProfile.validatePassword("12345678")); 
    }

}
