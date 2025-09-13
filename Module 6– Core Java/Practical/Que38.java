package PracticalAssignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//  o Write a program to read and write content to a file using FileReader and FileWriter.

public class Que38 {
	public static void main(String[] args) {
		 try {
	            // --- Writing to a file using FileWriter ---
	            FileWriter writer = new FileWriter("myfile.txt");
	            writer.write("Hello, this is a test file.\n");
	            writer.write("We are learning FileReader and FileWriter in Java.");
	            writer.close();
	            System.out.println("✅ Data written to file successfully.");

	            // --- Reading from a file using FileReader ---
	            FileReader reader = new FileReader("myfile.txt");
	            int ch;
	            System.out.println("\nFile content:");
	            while ((ch = reader.read()) != -1) {
	                System.out.print((char) ch); // convert int to character
	            }
	            reader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}