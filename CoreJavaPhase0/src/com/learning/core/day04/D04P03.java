package com.learning.core.day04;

import java.util.Scanner;

public class D04P03 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		try 
		{
	        System.out.println("Enter Applicant Name : ");
	        String applicantName = scanner.nextLine();
	        System.out.println("Enter Post Name (Probationary Officer, Assistants, Special Cadre Officers");
	        String postName = scanner.nextLine();	              
	        System.out.println("Enter Age ");
	        int applicantAge = scanner.nextInt();
	        Applicant a = new Applicant(applicantName, postName, applicantAge);
	        Validator v = new Validator();
	        v.validate(a);
		}
		catch(CatheyBankException e) 
		{
            System.out.println("Exception: " + e.getMessage());			
		}
	}

}
