package com.learning.core.day06;

import java.util.Objects;

public class Employee 
{
	private int ID;
	private String Name;
	private String Department;
	private String Designation;
	
	public Employee() 
	{
	}

	public Employee(int iD, String name, String department, String designation) 
	{
		ID = iD;
		Name = name;
		Department = department;
		Designation = designation;
	}

	public int getID() 
	{
		return ID;
	}

	public String getName() 
	{
		return Name;
	}

	public String getDepartment() 
	{
		return Department;
	}

	public String getDesignation() 
	{
		return Designation;
	}

	@Override
	public int hashCode() 
	{
		return ID;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Department, other.Department) && Objects.equals(Designation, other.Designation)
				&& ID == other.ID && Objects.equals(Name, other.Name);
	}

	@Override
	public String toString() 
	{
		return "ID : " + ID + ", Name : " + Name + ", Department : " + Department + ", Designation : " + Designation;
	}
	
	
	
	
	
	
	
	
	
	

}
