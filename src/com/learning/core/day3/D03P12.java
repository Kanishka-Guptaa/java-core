package com.learning.core.day03;

import java.util.Scanner;

public class D03P12 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String input = sc.next();
	    boolean canSplit = checkSplit(input);
	    if (canSplit) 
	    {
	    	System.out.println("Yes");
	    } 
	    else 
	    {
	            System.out.println("No");
	    }
	}
	
	public static boolean checkSplit(String input) 
	{
		String first,second,third,fourth;
		int length = input.length();
	    if (length < 4) 
	    {
	    	return false;
	    }
	    for (int i = 1; i < length - 2; i++) 
	    {
	    	for (int j = i + 1; j < length - 1; j++) 
	    	{
	    		for (int k = j + 1; k < length; k++) 
	    		{
	    			first = input.substring(0, i);
	                second = input.substring(i, j);
	                third = input.substring(j, k);
	                fourth = input.substring(k);
	                if (!first.equals(second) && !first.equals(third) && !first.equals(fourth) &&
	                            !second.equals(third) && !second.equals(fourth) && !third.equals(fourth)) 
	                {
	                	return true;
	                }
	            }
	        }
	      }
	      return false;
	 }
}



