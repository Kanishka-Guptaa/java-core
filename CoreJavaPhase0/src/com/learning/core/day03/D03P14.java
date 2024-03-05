package com.learning.core.day03;

import java.util.Arrays;
import java.util.Scanner;

public class D03P14 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of first array : ");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		System.out.println("Enter elements of first array : ");
		for(int i = 0; i < n1; i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter Size of second array : ");
		int n2 = sc.nextInt();	
		int arr2[] = new int[n2];		
		System.out.println("Enter elements of second array : ");
		for(int i = 0; i < n2; i++)
		{
			arr2[i] = sc.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println("Union is : ");
		printUnion(arr1, arr2, n1, n2);
		System.out.println("\nIntersection is : ");
		printIntersection(arr1, arr2, n1, n2);
	}
	
	public static void printUnion(int[] arr1, int[] arr2, int m, int n) 
	{  
        int i = 0, j = 0;      
        while (i < m && j < n) 
        {  
            if (arr1[i] < arr2[j]) 
            {   
                System.out.print(arr1[i++] + " ");  
            } 
            else if (arr1[i] > arr2[j]) 
            {   
                System.out.print(arr2[j++] + " ");  
            } 
            else 
            {  
                System.out.print(arr1[i++] + " ");  
                j++;  
            }  
        }   
        while (i < m) 
        {  
            System.out.print(arr1[i++] + " ");  
        }  
        while (j < n) 
        {  
            System.out.print(arr2[j++] + " ");  
        }  
    }
	
	public static void printIntersection(int[] arr1, int[] arr2, int m, int n) 
	{
		int i = 0, j = 0;
		while (i < m && j < n) 
		{  
	        if (arr1[i] == arr2[j]) 
	        {  
	            System.out.println(arr1[i++] + " "); 
	            i++;  
	            j++;  
	        } 
	        else if (arr1[i] < arr2[j]) 
	        {    
	            i++;  
	        } 
	        else 
	        {  
	            j++;  
	        }
		}
	}
}

