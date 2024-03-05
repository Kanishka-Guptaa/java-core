package com.learning.core.day03;

import java.util.Scanner;

public class D03P07 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter String : ");
		s = sc.nextLine();
		System.out.println("Subsequences of \"" + s + "\":");
        findSubsequences(s, "");
	}
	
	public static void findSubsequences(String input, String current) 
	{
        if (input.length() == 0) 
        {
            if (!current.equals("")) 
            {
                System.out.println(current);
            }
            return;
        }

        findSubsequences(input.substring(1), current + input.charAt(0));

        findSubsequences(input.substring(1), current);
    }
}
