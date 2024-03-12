package com.learning.core.day7;

public class D07P01 
{
	public static void main(String args[])
	{
		Stack_Array s = new Stack_Array(4);
		s.push("hello");
		s.push("world");
		s.push("java");
		s.push("programming");
		
		System.out.print("After pushing 4 elements : ");
		s.display();
		
		s.pop();
		System.out.print("After pop : ");
		s.display();
	}

}
