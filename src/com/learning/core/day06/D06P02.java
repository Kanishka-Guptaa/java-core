package com.learning.core.day06;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class D06P02 
{
	public static void main(String args[])
	{
		Map<String, Long> PhoneBook = new HashMap<String,Long>();
		PhoneBook.put("Amal", 998787823L);
		PhoneBook.put("Manvitha", 9378439781L);
		PhoneBook.put("Joseph", 788222111L);
		PhoneBook.put("Smith", 829389331L);
		PhoneBook.put("Kathe", 7234560011L);
		
		System.out.println(PhoneBook.get("Joseph"));
	}
}
