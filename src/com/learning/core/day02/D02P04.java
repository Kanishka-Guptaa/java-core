package com.learning.core.day02;

import java.util.Scanner;

public class D02P04 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int n2 = sc.nextInt();
		System.out.println("Enter third number : ");
		int n3 = sc.nextInt();
		int res = n3 > (n1 > n2 ? n1 : n2 ) ? n3 : (n1 > n2 ? n1 : n2 );
		System.out.println("Maximum is : " + res);
	}	
}
