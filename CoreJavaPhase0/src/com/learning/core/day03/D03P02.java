package com.learning.core.day03;

import java.util.*;

public class D03P02 {
	public static void main(String args[])
	{
			int arr[] = new int[5];
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 5 numbers in the range of 1 to 40");
			int pos = 0,n;
			while (pos < 5)
			{
				n = sc.nextInt();
				if(n >= 1 && n <= 40)
				{
					arr[pos++] = n;
				}
				else
				{
					System.out.println("Number is out of range. pls enter again in the range");
				}
			}
			System.out.println("Enter first number to be searched : ");
			int n1 = sc.nextInt();
			System.out.println("Enter second number to be searched : ");
			int n2 = sc.nextInt();
			boolean flag1 = false, flag2 = false;
			for(int i = 0; i < 5; i++)
			{
				if(n1 == arr[i])
					flag1 = true;
				if(n2 == arr[i])
					flag2 = true;
			}
			if(flag1 && flag2)
			{
				System.out.println("It's a BINGO!!!!");
			}
			else
			{
				System.out.println("Not found");
			}
	}
	

}
