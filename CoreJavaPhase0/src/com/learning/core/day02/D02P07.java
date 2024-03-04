package com.learning.core.day02;

import java.util.Scanner;

public class D02P07 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter percentage : ");
		float n = sc.nextFloat();
		if(n >= 60)
		{
			System.out.println("Grade : A");
		}
		else if(n >= 45 && n < 60)
		{
			System.out.println("Grade : B");
		}
		else if(n >= 35 && n < 45)
		{
			System.out.println("Grade : C");
		}
		else if(n < 35)
		{
			System.out.println("Fail");
		}
		
	}

}
