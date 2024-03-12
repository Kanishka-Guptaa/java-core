package com.learning.core.day02;

import java.util.Scanner;

public class D02P08 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter L : ");
		int n1 = sc.nextInt();
		System.out.println("Enter R : ");
		int n2 = sc.nextInt();
		int sum = 0;
		for(int i = n1; i <= n2; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}	

}
