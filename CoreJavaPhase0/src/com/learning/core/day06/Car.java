package com.learning.core.day06;

import java.util.Objects;

public class Car implements Comparable<Car> 
{
	private String name;
	private double price;
	
	public Car() 
	{
	}

	public Car(String name, double price) 
	{
		this.name = name;
		this.price = price;
	}

	public String getName() 
	{
		return name;
	}

	public double getPrice() 
	{
		return price;
	}

	@Override
	public String toString() 
	{
		return "Car Name = " + name + ", price=" + price;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		Car other = (Car) obj;
		return Double.compare(other.price, price) == 0 && Objects.equals(name, other.name);
	}
	
	 public int compareTo(Car other) {
			return Double.compare(other.price,this.price);	
	 }
	

}
