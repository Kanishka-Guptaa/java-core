package com.learning.core.day8;

public class CircularQueue 
{
	int front = -1;
	int rear = -1;
	int n;
	int arr[];
	
	public CircularQueue(int n)
	{
		this.n = n;
		arr = new int[n];
	}
	
	public boolean isFull()
	{
		return (((rear + 1) % n) == front);
	}
	
	public boolean isEmpty()
	{
		return (front == -1 && rear == -1);
	}
	
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is Empty.");
		}
		else if(isEmpty())
		{
			rear = front = 0;
			arr[rear] = data;
		}
		else
		{
			rear =  (rear + 1) % n ;
			arr[rear] = data;
		}
	}
	
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty.");
			return -1;
		}
		else if(front == rear)
		{
			int x = arr[front];
			front = -1;
			rear = -1;
			return x;
		}
		else
		{
			int x = arr[front];
			front = (front + 1) % n;
			return x;
		}
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty.");
			return -1;
		}
		else
		{
			return arr[front];
		}
	}
	
	public void display()
	{
		for(int i = this.front; i <= this.rear ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
