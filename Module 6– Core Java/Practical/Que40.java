package PracticalAssignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Create a program that demonstrates object serialization and deserialization.

public class Que40 {
	public static void main(String[] args) {
		 try {
	            // --- Serialize a String object ---
	            String message = "Hello, Java Serialization!";
	            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.dat"));
	            out.writeObject(message);
	            out.close();
	            System.out.println("Object saved to file.");

	            // --- Deserialize the String object ---
	            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.dat"));
	            String readMessage = (String) in.readObject();
	            in.close();

	            // Display deserialized data
	            System.out.println("Deserialized Object: " + readMessage);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
}
