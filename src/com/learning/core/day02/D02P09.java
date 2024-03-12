package com.learning.core.day02;

import java.util.Scanner;

public class D02P09 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			System.out.println("Cube of " + i + " is : " + i*i*i);
		}
	}	
	

}
