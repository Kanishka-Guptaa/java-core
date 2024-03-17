package com.learning.core.day10;

import java.io.*;

public class D10P03 
{
    public static void main(String[] args) 
    {
        try
        {
        	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("s_records.txt"));
            System.out.println("Student Records:");

            while(true) 
            {
                try 
                {
                    Student student = (Student) ois.readObject();
                    System.out.println("Roll Number: " + student.getRollNumber());
                    System.out.println("Name: " + student.getName());
                    System.out.println("Age: " + student.getAge());
                    System.out.println("Address: " + student.getAddress());
                    System.out.println();
                } 
                catch (EOFException e) 
                {
                    break; // End of file reached
                }
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found.");
        } 
        catch (IOException | ClassNotFoundException e) 
        {
            System.out.println("Error reading data from file: " + e.getMessage());
        }
    }
}

