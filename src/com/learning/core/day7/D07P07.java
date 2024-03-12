package com.learning.core.day7;

public class D07P07 
{
	public static void main(String args[])
	{
		Stack s = new Stack(5);
		s.push(15);
		s.push(25);
		s.push(30);
		s.push(40);
		
		if(s.peek() % 2 == 0)
			System.out.println(true);
		else
			System.out.println(false);
	}

}
