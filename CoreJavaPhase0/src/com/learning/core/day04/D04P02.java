package com.learning.core.day04;

import java.util.Scanner;

public class D04P02 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		try 
		{
	        System.out.println("Enter Player Name : ");
	        String name = scanner.next();
	        System.out.println("Enter no of critic rating (2 or 3) ");
	        int n = scanner.nextInt();
	        float critic1, critic2, critic3;
	        switch(n)
	        {
	        	case 2:
	        		System.out.println("Enter Critic 1 rating: ");
	    	        critic1 = scanner.nextFloat();
	    	        System.out.println("Enter Critic 2 rating ");
	    	        critic2 = scanner.nextFloat();
	    	        CricketRating cr1 = new CricketRating(name, critic1, critic2);
	    	        cr1.display();
	    	        break;
	    	       
	        	case 3:
	        		System.out.println("Enter Critic 1 rating: ");
	    	        critic1 = scanner.nextFloat();
	    	        System.out.println("Enter Critic 2 rating ");
	    	        critic2 = scanner.nextFloat();
	    	        System.out.println("Enter Critic 3 rating: ");
	    	        critic3 = scanner.nextFloat();
	    	        CricketRating cr2 = new CricketRating(name, critic1, critic2,critic3);
	    	        cr2.display();
	    	        break;      		
	        }
		}
		catch(NotEligibleException e) 
		{
            System.out.println("Exception: " + e.getMessage());			
		}
	}
}
