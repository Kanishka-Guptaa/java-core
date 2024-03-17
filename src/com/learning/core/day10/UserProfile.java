package com.learning.core.day10;

public class UserProfile 
{
	public static boolean validateUsername(String username) 
	{
        return username.matches("[a-zA-Z]+");
    }

    public static boolean validatePassword(String password) 
    {
        return password.matches("[a-zA-Z0-9]{8}");
    }

}
