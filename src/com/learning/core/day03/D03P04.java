package com.learning.core.day03;

import java.util.Scanner;


public class D03P04 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements : ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int index = firstRepeatingElement(arr,n);
		if(index != -1)
			System.out.println("index is : " + index);
		else
			System.out.println("No repeating element");
		
	}

	static int firstRepeatingElement(int[] arr, int n) 
	{
		for (int i = 0; i < n; i++) 
	    {
	        for (int j = i + 1; j < n; j++) 
	        {
	            if (arr[i] == arr[j]) 
	            {
	                return j;
	            }
	        }
	    }
	    return -1;		
	}
	
	
	

}
