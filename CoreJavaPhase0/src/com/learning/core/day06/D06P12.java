package com.learning.core.day06;

import java.util.Hashtable;

public class D06P12 
{
	public static void main(String args[])
	{
		Hashtable<Integer, Employee> employee = new Hashtable<>();
		
		Employee e1 = new Employee(1001, "John Doe", "Engineering", "Software Engineer");
        Employee e2 =  new Employee(1002, "Jane Smith", "Marketing", "Marketing Manager");
        Employee e3 = new Employee(1003, "Alice Johnson", "HR", "HR Manager");
        Employee e4 = new Employee(1004, "Bob Williams", "Finance", "Financial Analyst");
        
        employee.put(e1.getID(), e1);
        employee.put(e2.getID(), e2);
        employee.put(e3.getID(), e3);
        employee.put(e4.getID(), e4);       
        
        Employee e5 = new Employee(1005, "Charles Darwin", "Testing", "Quality Analyst");
        
        if(!employee.containsKey(e5.getID()))
        {
        	employee.put(e5.getID(), e5);
        	System.out.println(e5);
        }
        else
        {
        	System.out.println("Employee already exist.");
        }
        
		
	}

}
