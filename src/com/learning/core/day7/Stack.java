package com.learning.core.day7;

public class Stack 
{
	int n;
	int arr[];
	int top;
	
	Stack(int n)
	{
		this.n = n;
		this.arr = new int[n];
		this.top = -1;
	}
	
	boolean isEmpty()
	{
		return (top == -1);
	}
	
	boolean isFull()
	{
		return (n-1 == top);
	}
	
	public void push(int data)
	{
		if(isFull())
		{
			System.out.println("Stack is Full");
		}
		else
		{
			top++;
			arr[top] = data;
		}
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		else
		{
			int value = arr[top];
			top--;
			return value;
		}		
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		else
		{
			int value = arr[top];
			return value;
		}
	}
	
	 public void getMin() 
	 {
		int min = arr[0];
		if(isEmpty()) 
		{
			 System.out.println("Stack is empty.");
        }
		else
		{
			for(int i = 1; i < arr.length; i++)
			{
				if(min > arr[i])
				{
					min = arr[i];
				}
			}
			System.out.println("Minimum is : " + min);
		 }
     }
	 
	 public void reverse() 
	 {
		 if(!isEmpty()) 
		 {
			 int temp = pop();
	         reverse();
	         insertAtBottom(temp);
	     }
	 }

	 void insertAtBottom(int value) 
	 {
		 if(isEmpty()) 
		 {
			 push(value);
	     } 
		 else 
		 {
			 int temp = pop();
	         insertAtBottom(value);
	         push(temp);
	     }
	 }

	 public void display() 
	 {
		 if(isEmpty()) 
		 {
			 System.out.println("Stack is empty.");
	         return;
	     }
	     for(int i = 0; i <= top; i++) 
	     {
	    	 System.out.print(arr[i] + " ");
	     }
	     System.out.println();
	 }
}
