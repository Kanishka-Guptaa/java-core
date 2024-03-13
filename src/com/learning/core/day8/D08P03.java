package com.learning.core.day8;

public class D08P03 
{
	public static void main(String args[])
	{
		Queue q = new Queue(4);
		q.enqueue(14);
		q.enqueue(13);
		q.enqueue(22);
		q.enqueue(-8);
		
		System.out.print("Elements in circular queue : " );
		q.display();
		
		q.dequeue();
		System.out.print("After removing first element : " );
		q.display();
	}
}
