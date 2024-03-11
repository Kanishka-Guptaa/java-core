package com.learning.core.day06;

import java.util.Map.Entry;
import java.util.TreeMap;

public class D06P07 
{
	public static void main(String args[])
	{
		TreeMap<Double,String> car = new TreeMap<Double,String>();
		
		Car c1 = new Car("Bugatti",80050.0);
		Car c2 = new Car("Swift",300500.0);
		Car c3 = new Car("Audi",600100.0);
		Car c4 = new Car("Benz",900000.0);
		
		car.put(c1.getPrice(),c1.getName());
		car.put(c2.getPrice(),c2.getName());
		car.put(c3.getPrice(),c3.getName());
		car.put(c4.getPrice(),c4.getName());
		
		Entry<Double, String> maxEntry = car.lastEntry();
        System.out.println(maxEntry.getValue() + " " + maxEntry.getKey());
        
        Entry<Double, String> minEntry = car.firstEntry();
        System.out.println(minEntry.getValue() + " " + minEntry.getKey());
		
	}
}
