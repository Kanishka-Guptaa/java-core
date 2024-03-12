package com.learning.core.day06;

import java.util.Hashtable;

public class D06P11 
{
	public static void main(String args[])
	{
		Hashtable<Integer, Employee> employee = new Hashtable<>();
		
		Employee e1 = new Employee(1001, "John Doe", "Engineering", "Software Engineer");
        Employee e2 =  new Employee(1002, "Jane Smith", "Marketing", "Marketing Manager");
        Employee e3 = new Employee(1003, "Alice Johnson", "HR", "HR Manager");
        Employee e4 = new Employee(1004, "Bob Williams", "Finance", "Financial Analyst");
        
        employee.put(1, e1);
        employee.put(2, e2);
        employee.put(3, e3);
        employee.put(4, e4);       
        
        System.out.println(employee.get(4));
		
	}

}
