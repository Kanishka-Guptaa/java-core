package com.learning.core.day03;

import java.util.Scanner;

public class D03P03 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int A[] = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		int sum = 0;
		for(int i = 0; i < 15; i++)
		{
			sum = sum + A[i];
		}
		A[15] = sum;
		A[16] = sum /14;
		int min = A[0];
		for(int i = 0; i < 15; i++)
		{
			if(min > A[i])
			{
				min = A[i];
			}
		}
		A[17] = min;
		for(int x : A)
		{
			System.out.print(x + " ");	
		}
	}

}
