package com.learning.core.day03;

import java.util.Scanner;

public class D03P08 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		System.out.println("No. of Deletions are : " + minDeletions(s));
    }

	public static int minDeletions(String s) 
	{
		if (isPalindrome(s))
            return 0;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return minDeletions(s.substring(1, s.length() - 1));
        return 1 + Math.min(minDeletions(s.substring(1)), minDeletions(s.substring(0, s.length() - 1)));
    }

    private static boolean isPalindrome(String s) 
    {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

