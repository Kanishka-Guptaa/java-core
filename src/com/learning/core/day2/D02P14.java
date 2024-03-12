package com.learning.core.day02;

import java.util.Scanner;

public class D02P14 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int n2 = sc.nextInt();
		int res = 1;
		for(int i = 1; i <= n2; i++)
		{
			res = res * n1;
		}
		System.out.println(res);
	}

}
