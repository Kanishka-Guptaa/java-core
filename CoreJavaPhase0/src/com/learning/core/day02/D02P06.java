package com.learning.core.day02;

import java.util.Scanner;

public class D02P06 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		if(n == 1)
		{
			System.out.println("Corresponding WeekDay is Monday");
		}
		else if(n == 2)
		{
			System.out.println("Corresponding WeekDay is Tuesday");
		}
		else if(n == 3)
		{
			System.out.println("Corresponding WeekDay is Wednesday");
		}
		else if(n == 4)
		{
			System.out.println("Corresponding WeekDay is Thursday");
		}
		else if(n == 5)
		{
			System.out.println("Corresponding WeekDay is Friday");
		}
		else if(n == 6)
		{
			System.out.println("Corresponding WeekDay is Saturday");
		}
		else if(n == 7)
		{
			System.out.println("Corresponding WeekDay is Sunday");
		}
		else
		{
			System.out.println("Invalid Input!!!");
		}
	}

}
