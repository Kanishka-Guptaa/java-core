package com.learning.core.day8;

public class D08P02 
{
	public static void main(String args[])
	{
		LinkedListQueue q = new LinkedListQueue();
		q.enqueue(89);
		q.enqueue(99);
		q.enqueue(109);
		q.enqueue(209);
		q.enqueue(309);
		
		System.out.print("Elements in queue : " );
		q.display();
		
		q.dequeue();
		q.dequeue();
		System.out.print("After removing two element : " );
		q.display();
	}
}
