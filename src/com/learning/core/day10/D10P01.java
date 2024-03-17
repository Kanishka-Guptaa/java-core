package com.learning.core.day10;

import java.io.*;

public class D10P01 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("give only source file and destination file name.");
            return;
        }

        String sourceFileName = args[0];
        String destinationFileName = args[1];

        File sourceFile = new File(sourceFileName);
        File destinationFile = new File(destinationFileName);

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        if (destinationFile.exists()) {
            // Ask user whether to overwrite
            System.out.print("Destination file already exists. Do you want to overwrite? (Yes/No): ");
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String userInput = reader.readLine().trim().toLowerCase();
                if (!userInput.equals("yes")) {
                    System.out.println("Operation cancelled by user.");
                    return;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }

        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

