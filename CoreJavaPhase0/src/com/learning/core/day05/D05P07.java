package com.learning.core.day05;

import java.util.TreeSet;

public class D05P07 
{
	public static void main(String[] args) 
	{
        TreeSet<Person> personSet = new TreeSet<>();

        personSet.add(new Person(101, "Alice", 30, 50000));
        personSet.add(new Person(102, "Bob", 28, 60000));
        personSet.add(new Person(103, "Charlie", 26, 55000));
        personSet.add(new Person(104, "David", 24, 52000));
        personSet.add(new Person(105, "Eva", 29, 58000));
        personSet.add(new Person(106, "Frank", 27, 54000));
        
        for (Person person : personSet) 
        {
        	System.out.println(person);     
        }
    }
}
