package PracticalAssignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Create a program that reads from one file and writes the content to another file

public class Que46 {
	public static void main(String[] args) {
		 String sourceFile = "myfile.txt";
	        String destFile = "destination.txt";

	        try {
	            // Create FileReader and FileWriter
	            FileReader fr = new FileReader(sourceFile);
	            FileWriter fw = new FileWriter(destFile);

	            int ch;
	            // Read from source and write to destination
	            while ((ch = fr.read()) != -1) {
	                fw.write(ch);
	            }

	            // Close the streams
	            fr.close();
	            fw.close();

	            System.out.println("File content copied successfully.");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}