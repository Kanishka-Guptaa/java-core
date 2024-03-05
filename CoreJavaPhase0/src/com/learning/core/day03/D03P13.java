package com.learning.core.day03;

import java.util.Scanner;

public class D03P13 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String r = s.replace(" ", "%20");
		System.out.println("Replaced String is : " +r);
	}
}
