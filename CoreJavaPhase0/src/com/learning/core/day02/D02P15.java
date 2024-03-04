package com.learning.core.day02;

import java.util.Scanner;

public class D02P15 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		int positive_count = 0, negative_count = 0, zero_count = 0;
		do
		{
			System.out.println("Enter number : ");
			int n = sc.nextInt();
			if(n > 0)
			{
				positive_count++;
			}
			else if(n < 0)
			{
				negative_count++;
			}
			else
			{
				zero_count++;
			}
			System.out.println("If you want to enter more number, press Y");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
		System.out.println("Positive numbers entered : " +positive_count);
		System.out.println("Negative numbers entered : " +negative_count);
		System.out.println("Zeros entered : " +zero_count);
	}
}
