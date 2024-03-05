package com.learning.core.day03;

import java.util.Scanner;

public class D03P06 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter String : ");
		s = sc.nextLine();
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		s.toLowerCase();
		int m = 0;
		String res = "";
		char ca[] = s.toCharArray();
		for(int i = 0; i < ca.length; i++)
		{
			if(ca[i] == 'a' || ca[i] == 'e' || ca[i] == 'i' || ca[i] == 'o' || ca[i] == 'u')
			{
				m++;
				res = res + ca[i];
			}
		}
		//System.out.println(m);
		if(n > m)
		{
			System.out.println("Mismatch in Vowel Count");
		}
		else
		{
			System.out.println(res);
		}		
	}
	
}
