package com.learning.core.day02;

import java.util.Scanner;

public class D02P05 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		if(n % 5 == 0)
		{
			System.out.println(n + " is divisible by 5.");
		}
		else
		{
			System.out.println(n + " is not divisible by 5.");
		}
	}

}
