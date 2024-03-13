package com.learning.core.day8;

public class LinkedListQueue 
{
	Node front;
	Node rear;
	public void enqueue(int data)
	{
		if(front == null)
		{
			rear = new Node(data);
			front = rear;
		}
		else
		{
			Node n = new Node(data);
			rear.next = n;
			rear = n;
		}
	}
	
	public int dequeue()
	{
		if(front == null)
		{
			System.out.println("Queue is Empty.");
			return -1;
		}
		else
		{
			int x = front.value;
			front = front.next;
			return x;
		}
	}
	
	public int peek()
	{
		if(front == null)
		{
			System.out.println("Queue is Empty.");
			return -1;
		}
		else
		{
			int x = front.value;
			return x;
		}
	}
	
	public void display() 
	{
        Node current = this.front;
        if (front == null) 
        {
            System.out.println("Queue is empty");
        }
        while (current != null) 
        {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
	
	public boolean isEmpty()
	{
		if(front == null)
			return true;
		else
			return false;
	}

}
