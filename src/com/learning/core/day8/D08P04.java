package com.learning.core.day8;

class Node1 
{
	String data;
    Node next;

    public Node1(String data) 
    {
        this.data = data;
        this.next = null;
    }
}

class CustomQueue 
{
	Node front, rear;

    public CustomQueue() 
    {
        this.front = this.rear = null;
    }

    public void enqueue(String data) 
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

    public boolean isEmpty() 
    {
        return (this.front == null);
    }

}

public class D08P04
{
	public static void main(String[] args) 
	{
        CustomQueue q1 = new CustomQueue();
        CustomQueue q2 = new CustomQueue();
        
        q1.enqueue("Yellow");
        q1.enqueue("Green");
        q1.enqueue("Pink");
        q1.enqueue("Black");
        q1.enqueue("Blue");
        q1.enqueue("White");
        
        if(q1.isEmpty())
        {
        	System.out.println("Empty");
        }
        else
        {
        	System.out.println("Not Empty");
        }
        
        if(q2.isEmpty())
        {
        	System.out.println("Empty");
        }
        else
        {
        	System.out.println("Not Empty");
        }
        
    }
}
