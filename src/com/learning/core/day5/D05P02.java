package com.learning.core.day05;

import java.util.ArrayList;
import java.util.Scanner;

public class D05P02 
{
	public static void main(String args[])
	{
		ArrayList<String> studentNames = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students : ");
		int n = sc.nextInt();
		String name;
		System.out.println("Enter names : ");
		for(int i = 0; i < n; i++)
		{
			name = sc.next();
			studentNames.add(name);
		}
        System.out.print("Enter a name to search for: ");
		String nameToSearch = sc.next();
        if (studentNames.contains(nameToSearch)) 
        {
        	System.out.println("The name '" + nameToSearch + "' exists in the list.");
		} 
        else 
        {
        	System.out.println("The name '" + nameToSearch + "' does not exist in the list.");
		}

	}
}
