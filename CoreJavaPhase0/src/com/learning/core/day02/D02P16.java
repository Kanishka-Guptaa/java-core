package com.learning.core.day02;

import java.util.Scanner;

public class D02P16 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 1, c;
		System.out.println("Enter no of terms : ");
		int n = sc.nextInt();
		System.out.print(a + " " + b + " ");
		for(int i = 2; i < n; i++)
		{
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}
}
