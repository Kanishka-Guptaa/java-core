package com.learning.core.day7;

public class D07P05 
{
	public static void main(String[] args) 
	{
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.reverse();

        stack.display();
    }


}
