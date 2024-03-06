package com.learning.core.day04;

public class BankAccount 
{
	private int accNo;
	private String custName;
	private String accType;
	private float balance;
	
	public BankAccount()
	{
		
	}
	
	public BankAccount(int accNo, String custName, String accType, float balance) throws  NegativeAmountException, LowBalanceException
	{
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		
		if(balance <= 0)
		{
			throw new NegativeAmountException("Initial balance cannot be negative.");			
		}
		if(accType == "Savings" && balance < 1000)
		{
			throw new LowBalanceException("Minimum balance for savings account is 1000.");
		}
		else if(accType == "Current" && balance < 5000)
		{
			throw new LowBalanceException("Minimum balance for current account is 5000.");
		}
		else
		{
			this.balance = balance;
		}
	}	
	
	public void deposit(float amt) throws NegativeAmountException
	{
		if(amt >= 0)
		{
			balance = balance + amt;
		}
		else
		{
			throw new NegativeAmountException("Negative Amount");
		}
		
	}
	
	public float getBalanceAmt() throws LowBalanceException
	{
		if(accType == "Savings" && balance < 1000)
		{
			throw new LowBalanceException("Minimum balance for savings account is 1000.");
		}
		else if(accType == "Current" && balance < 5000)
		{
			throw new LowBalanceException("Minimum balance for current account is 5000.");
		}
		else
		{
			return balance;
		}
		
	}

	
}
