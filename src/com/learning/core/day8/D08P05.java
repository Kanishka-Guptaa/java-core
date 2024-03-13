package com.learning.core.day8;

public class D08P05 
{
	public static void main(String args[])
	{
		Queue q = new Queue(7);
		Queue[] arrQ = new Queue[2];
		Queue evenQueue = new Queue(7);
		Queue oddQueue = new Queue(7);
		arrQ[0] = oddQueue;
		arrQ[0] = evenQueue;
		q.enqueue(2);
		q.enqueue(7);
		q.enqueue(9);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(5);
		q.enqueue(10);
		
		int x;
		while(!q.isEmpty())
		{
			x = q.dequeue();
			if(x % 2 == 0)
			{
				evenQueue.enqueue(x);
			}
			else
			{
				oddQueue.enqueue(x);
			}
		}
		
		System.out.print("Odd Queue : ");
		oddQueue.display();
		System.out.print("Even Queue : ");
		evenQueue.display();
	}

}
