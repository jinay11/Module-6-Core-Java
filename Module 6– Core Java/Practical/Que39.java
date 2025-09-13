package PracticalAssignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//   Implement a program that reads a file line by line using BufferedReader.

public class Que39 {
	public static void main(String[] args) {
		try {
            // Create a BufferedReader to read from a file
            BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
            String line;

            System.out.println("📖 Reading file line by line:");
            // Read each line until end of file
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); // close the reader
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
	}
}
