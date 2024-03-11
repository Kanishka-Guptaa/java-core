package com.learning.core.day06;

import java.util.TreeMap;

public class D06P05 
{
	public static void main(String args[])
	{
		TreeMap<String,Double> car = new TreeMap<String,Double>();
		
		Car c1 = new Car("Bugatti",80050.0);
		Car c2 = new Car("Swift",300500.0);
		Car c3 = new Car("Audi",600100.0);
		Car c4 = new Car("Benz",900000.0);
		
		car.put(c1.getName(), c1.getPrice());
		car.put(c2.getName(), c2.getPrice());
		car.put(c3.getName(), c3.getPrice());
		car.put(c4.getName(), c4.getPrice());
		
		System.out.println(car);	
		
	}

}
