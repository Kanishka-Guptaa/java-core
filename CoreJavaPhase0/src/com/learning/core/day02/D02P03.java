package com.learning.core.day02;

import java.util.Scanner;

public class D02P03 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		float n1 = sc.nextFloat();
		System.out.println("Enter second number : ");
		float n2 = sc.nextFloat();
		System.out.println("Enter mathematical operator : ");
		char ch = sc.next().charAt(0);
		float res;
		if(ch == '+')
		{
			res = n1 + n2;
			System.out.println("Output : " + res);
		}
		else if(ch == '-')
		{
			res = n1 - n2;
			System.out.println("Output : " + res);
		}
		else if(ch == '*')
		{
			res = n1 * n2;
			System.out.println("Output : " + res);
		}
		else if(ch == '/')
		{
			res = n1 / n2;
			System.out.println("Output : " + res);
		}
		else if(ch == '%')
		{
			res = n1 % n2;
			System.out.println("Output : " + res);
		}
		else
		{
			System.out.println("Invalid Mathematical Operator...");
		}
	}
}
