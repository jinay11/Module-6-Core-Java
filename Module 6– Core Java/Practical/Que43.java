package PracticalAssignment;

import java.util.HashMap;

//Create a HashMap to store and retrieve key-value pairs

public class Que43 {
	public static void main(String[] args) {
		// Step 1: Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Step 2: Add key-value pairs
        map.put(1, "Luffy");
        map.put(2, "Zoro");
        map.put(3, "Nami");

        // Step 3: Retrieve and display values
        System.out.println("Value for key 2: " + map.get(2));

        // Step 4: Display all key-value pairs
        System.out.println("\nAll key-value pairs in the HashMap:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
	}
}
