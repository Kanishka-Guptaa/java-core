package com.learning.core.day02;

import java.util.Scanner;

public class D02P01 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter Number : ");
		n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Corresponding month is January");
				break;
			case 2:
				System.out.println("Corresponding month is February");
				break;
			case 3:
				System.out.println("Corresponding month is March");
				break;
			case 4:
				System.out.println("Corresponding month is April");
				break;
			case 5:
				System.out.println("Corresponding month is May");
				break;
			case 6:
				System.out.println("Corresponding month is June");
				break;
			case 7:
				System.out.println("Corresponding month is July");
				break;
			case 8:
				System.out.println("Corresponding month is August");
				break;
			case 9:
				System.out.println("Corresponding month is September");
				break;
			case 10:
				System.out.println("Corresponding month is October");
				break;
			case 11:
				System.out.println("Corresponding month is November");
				break;
			case 12:
				System.out.println("Corresponding month is December");
				break;
			default:
				System.out.println("Invalid Input!!!");
				break;					
		}
	}
}
