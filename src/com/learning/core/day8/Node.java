package com.learning.core.day8;

public class Node 
{
	int value;
	Node next;
	String s;
	
	public Node(int value)
	{
		this.value = value;
		this.next = null;
	}
	
	public Node(String value)
	{
		this.s = value;
		this.next = null;
	}

}
