package com.learning.core.day10;

import java.io.*;
import java.nio.file.*;

public class D10P04 
{
    public static void main(String[] args) 
    {
        try 
        {
            String sourcePath = "source.txt";
            String destinationPath = "destination.txt";

            copyFileUsingStreams(sourcePath, destinationPath);

            System.out.println("File copied successfully.");
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void copyFileUsingStreams(String sourcePath, String destinationPath) throws IOException 
    {
        try 
        {
        	FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destinationPath);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) 
            {
                fos.write(buffer, 0, bytesRead);
            }
        }
        
        catch (IOException e) 
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


