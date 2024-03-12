package com.learning.core.day7;

public class D07P03 
{
	char[] stackArray;
    int top;
    int n;
    
    public D07P03(int n) 
    {
    	this.n = n;
        stackArray = new char[n];
        top = -1;
    }
    
    public void push(char value) 
    {
    	if(isFull()) 
    	{
    		System.out.println("Stack is full. Cannot push element.");
        }
    	else
    	{
            stackArray[++top] = value;
        }
    }
    
    public char pop() 
    {
    	if (isEmpty()) 
    	{
    		System.out.println("Stack is empty. Cannot pop element.");
        }
    	else
    	{
    		return stackArray[top--];
        }
		return 0;
    }
    
    public boolean isEmpty() 
    {
    	return (top == -1);
    }

    public boolean isFull() 
    {
    	return (top == n - 1);
    }

    public static String reverseString(String input) 
    {
        int length = input.length();
        D07P03 stack = new D07P03(length);

        for (int i = 0; i < length; i++) 
        {
            stack.push(input.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) 
        {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) 
    {
        String input = "JavaQuiz";
        System.out.println("Original String: " + input);
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }
}
