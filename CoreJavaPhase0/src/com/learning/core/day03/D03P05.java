package com.learning.core.day03;

import java.util.Scanner;

public class D03P05 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of array : ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter value of k : ");
		int k = sc.nextInt();
		printCombination(arr, n, k);
	}

	static void printCombination(int arr[], int n, int r)
	{
		int data[]=new int[r];
		combinationUtil(arr, data, 0, n-1, 0, r);
	}

	static void combinationUtil(int arr[], int data[], int start,int end, int index, int r)
	{
		if (index == r)
		{
			for (int j=0; j<r; j++)
				System.out.print(data[j]+" ");
			System.out.println("");
			return;
		}
		for (int i=start; i<=end && end-i+1 >= r-index; i++)
		{
			data[index] = arr[i];
			combinationUtil(arr, data, i+1, end, index+1, r);
		}
	}
}
