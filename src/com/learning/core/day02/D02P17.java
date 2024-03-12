package com.learning.core.day02;

import java.util.Scanner;

public class D02P17 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		System.out.print("Prime numbers are : ");
		for (int x = 2; x <= n; x++) 
		{	
            int flag = 1;
            for (int y = 2; y <= x / 2; y++) 
            {
                if (x % y == 0) 
                {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.print(x + " ");
        }
	}

}
