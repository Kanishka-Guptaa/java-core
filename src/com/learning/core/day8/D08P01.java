package com.learning.core.day8;

public class D08P01 
{
	public static void main(String args[])
	{
		Queue q = new Queue(4);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		System.out.print("Elements in queue : " );
		q.display();
		
		q.dequeue();
		System.out.print("After removing first element : " );
		q.display();
	}
}
