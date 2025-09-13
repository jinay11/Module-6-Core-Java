package PracticalAssignment;

import java.util.ArrayList;
import java.util.HashSet;

//Implement a program using HashSet to remove duplicate elements from a list.

public class Que42 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");

		System.out.println("Original List: " + list);

		// Step 2: Use HashSet to remove duplicates
		HashSet<String> set = new HashSet<>(list);

		// Step 3: Convert back to list if needed
		ArrayList<String> uniqueList = new ArrayList<>(set);

		System.out.println("List after removing duplicates: " + uniqueList);
	}
}