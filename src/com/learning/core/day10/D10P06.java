package com.learning.core.day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class D10P06 
{
    public static void main(String[] args) 
    {
        String[] inputFiles = {"DavidEnglish.txt", "DavidScience.txt", "DavidComputer.txt"};
        String outputFile = "DavidNotes.txt";

        try 
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            for (String inputFile : inputFiles) 
            {
                writeNotes(inputFile, writer);
            }
            System.out.println("Notes for David have been written to DavidNotes.txt");
        } 
        catch (IOException e) 
        {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void writeNotes(String inputFile, BufferedWriter writer) 
    {
        try 
        {
        	BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = reader.readLine()) != null) 
            {
                writer.write(line);
                writer.newLine(); 
            }
            writer.newLine(); 
        } 
        catch (IOException e) 
        {
            System.err.println("Error reading file " + inputFile + ": " + e.getMessage());
        }
    }
}

