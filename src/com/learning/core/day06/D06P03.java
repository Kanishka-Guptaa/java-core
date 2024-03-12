package com.learning.core.day06;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.learning.core.day05.Person;

import java.util.TreeSet;

public class D06P03 
{
	public static void main(String args[])
	{
		TreeSet<Book> book = new TreeSet<>();
		
		Book b1 = new Book(1001,"Python Learning" ,715.0F,new Date(2020,02,02),"Martic C. Brown");
		Book b2 = new Book(1002,"Modern Mainframe" ,295.0F,new Date(1997,05,19),"Sharad");
		Book b3 = new Book(1003,"JAVA Programming" ,523.0F,new Date(1984,11,23),"Gilad Bracha");
		Book b4 = new Book(1004,"Read C++" ,295.0F,new Date(1984,11,19),"Henry Harvin");
		Book b5 = new Book(1005,".Net Platform" ,3457.0F,new Date(1984,06,03),"Mark J. Price");
		
		book.add(b1);
		book.add(b2);
		book.add(b3);
		book.add(b4);
		book.add(b5);
		
		for (Book b : book) 
        {
        	System.out.println(b);     
        }
		
	}
}
