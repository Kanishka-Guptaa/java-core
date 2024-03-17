package com.learning.core.day10;

import java.io.*;

public class D10P05 
{
    public static void main(String[] args) 
    {
        try 
        {
        	writeToFile("io.txt");

            showFileSize("io.txt");

            readFromFile("io.txt");

            deleteFile("io.txt");
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void writeToFile(String fileName) throws IOException 
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string to write to file:");
        String inputString = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(inputString);

        writer.close();
    }

    public static void showFileSize(String fileName) 
    {
        File file = new File(fileName);
        long fileSize = file.length();
        System.out.println("Size of the file '" + fileName + "': " + fileSize + " bytes");
    }

    public static void readFromFile(String fileName) throws IOException 
    {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        System.out.println("Contents of the file:");
        while ((line = reader.readLine()) != null) 
        {
            System.out.println(line);
        }
        reader.close();
    }

    public static void deleteFile(String fileName) 
    {
        File file = new File(fileName);
        if (file.delete()) 
        {
            System.out.println("File '" + fileName + "' deleted successfully.");
        } 
        else 
        {
            System.out.println("Failed to delete file '" + fileName + "'.");
        }
    }
}
