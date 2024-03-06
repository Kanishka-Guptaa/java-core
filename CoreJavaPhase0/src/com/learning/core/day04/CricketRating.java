package com.learning.core.day04;

public class CricketRating 
{
	private String playerName;
	private float critic1;
	private float critic2;
	private float critic3;
	private float avgRating;
	private String coins;
	
	public CricketRating()
	{
		
	}
	
	public CricketRating(String playerName, float critic1, float critic2) throws NotEligibleException
	{
		this.playerName = playerName;
		this.critic1 = critic1;
		this.critic2 = critic2;
		calculateAverageRating(critic1, critic2);
		this.coins = calculateCoin();		
	}
	
	public CricketRating(String playerName, float critic1, float critic2, float critic3) throws NotEligibleException
	{
		this.playerName = playerName;
		this.critic1 = critic1;
		this.critic2 = critic2;
		this.critic3 = critic3;
		calculateAverageRating(critic1, critic2, critic3);
		this.coins = calculateCoin();
	}
	
	void calculateAverageRating(float c1, float c2) throws NotEligibleException
	{
		avgRating = (c1 + c2)/2;	
		if (avgRating < 2) 
		{
            throw new NotEligibleException("Average rating is less than 2, player not eligible");
		}
	}
	
	void calculateAverageRating(float c1, float c2, float c3) throws NotEligibleException
	{
		avgRating = (c1 + c2 + c3)/2;
		if (avgRating < 2) 
		{
            throw new NotEligibleException("Average rating is less than 2, player not eligible");
		}
	}
	
	String calculateCoin() 
	{
		if(avgRating >= 7)
		{
			return "Gold";
		}
		else if(avgRating >= 5 && avgRating < 7)
		{
			return "Silver";
		}
		else if(avgRating >= 2 && avgRating < 5)
		{
			return "Copper";
		}
		else
		{
			return "Not Eligible";
		}
	}
	
	void display() 
	{
		System.out.println("Player Name : " +playerName);
		System.out.println("Average Rating : " +avgRating);
		System.out.println("Coin : " +coins);
	}
	

}
