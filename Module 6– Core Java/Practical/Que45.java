package PracticalAssignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Implement a file copy program using FileInputStream and FileOutputStream.

public class Que45 {
	public static void main(String[] args) {
		String sourceFile = "myfile.txt";
		String destFile = "copy.txt";

		try {
			// Create input and output streams
			FileInputStream fis = new FileInputStream(sourceFile);
			FileOutputStream fos = new FileOutputStream(destFile);

			int byteData;
			// Read from source and write to destination
			while ((byteData = fis.read()) != -1) {
				fos.write(byteData);
			}

			// Close streams
			fis.close();
			fos.close();

			System.out.println("File copied successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}