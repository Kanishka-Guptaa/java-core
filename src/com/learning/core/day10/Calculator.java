package com.learning.core.day10;

public class Calculator 
{
	public static int add(int a, int b)
	{
		return a + b;
	}
	
	public static int sub(int a, int b)
	{
		return a - b;
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}
	
	public int div(int a, int b) throws ArithmeticException 
	{
        if (b == 0) 
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
	
	public int findMax(int[] arr)
	{
		int max = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}

}
