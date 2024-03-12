package com.learning.core.day06;

import java.util.Date;
import java.util.Objects;

import com.learning.core.day05.Person;

public class Book implements Comparable<Book>
{
	private int BookId;
	private String BookTitle;
	private float BookPrice;
	private Date PublicationDate;
	private String BookAuthor;
	
	public Book() 
	{
	}

	public Book(int bookId, String bookTitle, float bookPrice, Date publicationDate, String bookAuthor) 
	{
		BookId = bookId;
		BookTitle = bookTitle;
		BookPrice = bookPrice;
		PublicationDate = publicationDate;
		BookAuthor = bookAuthor;
	}

	public int getBookId() 
	{
		return BookId;
	}

	public String getBookTitle() 
	{
		return BookTitle;
	}

	public float getBookPrice() 
	{
		return BookPrice;
	}

	public Date getPublicationDate() 
	{
		return PublicationDate;
	}

	public String getBookAuthor() 
	{
		return BookAuthor;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(BookAuthor, BookId, BookPrice, BookTitle, PublicationDate);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Book other = (Book) obj;
		return Objects.equals(BookAuthor, other.BookAuthor) && BookId == other.BookId
				&& this.BookPrice == other.BookPrice
				&& Objects.equals(BookTitle, other.BookTitle) && Objects.equals(PublicationDate, other.PublicationDate);
	}

	@Override
	public String toString() 
	{
		return "Book Id : " + BookId + ", BookTitle : " + BookTitle + ", BookPrice : " + BookPrice + ", Publication Date :"
				+ PublicationDate.getDate() + "/" + PublicationDate.getMonth() +"/" + PublicationDate.getYear() 
				+ ", Book Author : " + BookAuthor;
	}
	
	@Override
    public int compareTo(Book other) {
		return this.BookAuthor.compareTo(other.BookAuthor);
    }	

}
