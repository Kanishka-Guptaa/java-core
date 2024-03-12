package com.learning.core.day06;

import java.util.Hashtable;

public class D06P10 
{
	public static void main(String args[])
	{
		Hashtable<Integer, Employee> employee = new Hashtable<>();
		
		Employee e1 = new Employee(1, "John Doe", "Engineering", "Software Engineer");
        Employee e2 =  new Employee(2, "Jane Smith", "Marketing", "Marketing Manager");
        Employee e3 = new Employee(3, "Alice Johnson", "HR", "HR Manager");
        Employee e4 = new Employee(4, "Bob Williams", "Finance", "Financial Analyst");
        
        employee.put(1, e1);
        employee.put(2, e2);
        employee.put(3, e3);
        employee.put(4, e4);       

        boolean isEmpty = employee.isEmpty();
        System.out.println("Is Hashtable empty? " + isEmpty);
		
	}

}
