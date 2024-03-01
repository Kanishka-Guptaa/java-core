package com.learning.core.day01;

public class D01P01 {
	public static void createBooks()
	{
		Book b1 = new Book();
		b1.setBookTitle("Java Programming");
		b1.setBookPrice(350.00);
		showBooks(b1);
	}
	
	public static void showBooks(Book b1)
	{
		System.out.println("Book Title : " + b1.getBookTitle() + " and Price : " + b1.getBookPrice());
	}
	
	public static void main(String args[])
	{
		createBooks();
	}

}
