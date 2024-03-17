package com.learning.core.day10;

import java.io.*;
import java.util.Scanner;

public class D10P02 
{
	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
            while (true) 
            {
                System.out.print("Enter Roll Number: ");
                int rollNumber = sc.nextInt();

                System.out.print("Enter Name: ");
                String name = sc.next();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                System.out.print("Enter Address: ");
                String address = sc.next();

                try 
                {
                    if (name.isEmpty() || address.isEmpty()) 
                    {
                        throw new BlankFieldException("Name and Address cannot be blank.");
                    }

                    Student student = new Student(rollNumber, name, age, address);

                    System.out.print("Do you want to write the data to a file? (Yes/No): ");
                    String choice = sc.next().toLowerCase();

                    if (choice.equals("yes")) 
                    {
                        try
                        {
                        	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("s_records.txt", true));
                        	oos.writeObject(student);
                            System.out.println("Data written to file successfully.");
                        } 
                        catch (IOException e) 
                        {
                            System.out.println("Error writing data to file: " + e.getMessage());
                        }
                    } 
                    else 
                    {
                        System.out.println("Program terminated.");
                        break;
                    }
                } 
                catch (NumberFormatException e) 
                {
                    System.out.println("Roll Number and Age must be numeric.");
                } 
                catch (BlankFieldException e) 
                {
                    System.out.println(e.getMessage());
                }
            }
    }
}
