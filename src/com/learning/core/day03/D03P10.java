package com.learning.core.day03;

import java.util.Scanner;

public class D03P10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.next();
		int longestLength = findLongestPrefixSuffix(s);
		System.out.println("Length of the longest prefix-suffix: " + longestLength);
	}
	
	public static int findLongestPrefixSuffix(String s) {
        int n = s.length();
        for (int len = n - 1; len > 0; len--) {
            boolean isPrefixSuffix = true;
            for (int i = 0; i < len; i++) {
                if (s.charAt(i) != s.charAt(n - len + i)) {
                    isPrefixSuffix = false;
                    break;
                }
            }
            if (isPrefixSuffix) {
                return len;
            }
        }
        return 0;
    }


}
