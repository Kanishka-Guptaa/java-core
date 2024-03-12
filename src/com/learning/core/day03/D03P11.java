package com.learning.core.day03;

import java.util.Scanner;


// for pattern = foo only


public class D03P11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of String array : ");
		int n = sc.nextInt();
		String[] dictionary = new String[n];
		System.out.println("Enter words one by one : ");
		for(int i = 0; i < n; i++)
		{
			dictionary[i] = sc.next();
		}
		for (String word : dictionary) 
        {
            if (word.length() == 3 && word.charAt(1) == word.charAt(2)) 
            {
                System.out.println(word);
            }
        }
	}
}
	        

