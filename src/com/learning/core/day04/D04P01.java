package com.learning.core.day04;

import java.util.Scanner;

public class D04P01 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		try 
		{
	        System.out.println("Enter account number: ");
	        int accNo = scanner.nextInt();
	        System.out.println("Enter customer name: ");
	        String custName = scanner.next();
	        System.out.println("Enter account type (savings or current): ");
	        String accType = scanner.next();
	        System.out.println("Enter initial balance: ");
	        float initialBalance = scanner.nextFloat();

	        BankAccount account = new BankAccount(accNo, custName, accType, initialBalance);

	        System.out.print("Enter amount to deposit: ");
	        float depositAmount = scanner.nextFloat();
	        account.deposit(depositAmount);

	        System.out.println("Current balance: " + account.getBalanceAmt());
	    } 
		catch (LowBalanceException e) 
		{
	        System.out.println("Low Balance Exception: " + e.getMessage());
	    } 
		catch (NegativeAmountException e) 
		{
	        System.out.println("Negative Amount Exception: " + e.getMessage());
	    } 
	}
}
