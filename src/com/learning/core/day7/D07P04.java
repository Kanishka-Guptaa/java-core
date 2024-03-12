package com.learning.core.day7;

public class D07P04
{
	public static void main(String[] args) 
	{
		String expression = "10+2*6"; 
		int n = expression.length();
		Stack s = new Stack(n);
        int result = s.evaluateExpression(expression);
        System.out.println("Result: " + result);
    }
}




