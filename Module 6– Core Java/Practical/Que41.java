package PracticalAssignment;

import java.util.ArrayList;
import java.util.LinkedList;

//  o Write a program that demonstrates the use of an ArrayList andLinkedList.

public class Que41 {
	public static void main(String[] args) {
		// --- ArrayList ---
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");

		System.out.println("ArrayList Elements:");
		for (String fruit : arrayList) {
			System.out.println(fruit);
		}

		// --- LinkedList ---
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Dog");
		linkedList.add("Cat");
		linkedList.add("Rabbit");

		System.out.println("\nLinkedList Elements:");
		for (String animal : linkedList) {
			System.out.println(animal);
		}
	}
}
