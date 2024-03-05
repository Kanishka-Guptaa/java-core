package com.learning.core.day03;

import java.util.Scanner;

public class D03P01 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s, r = "";
		System.out.println("Enter String : ");
		s = sc.nextLine();
		char ch;
		System.out.println("Length of " + s + " is : " + s.length());
		System.out.println("String in uppercase : " +s.toUpperCase());
		for(int i = s.length() - 1 ; i >= 0; i--)
		{
			ch = s.charAt(i);
			r = r + ch; 
		}
		if(s.equals(r))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}
}
