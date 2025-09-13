package PracticalAssignment;

import java.util.Scanner;

//Write a program to read input from the console using Scanner.

public class Que44 {
	public static void main(String[] args) {
		  // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read a string
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Read an integer
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Read a double
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        // Display input
        System.out.println("\nYour Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        // Close Scanner
        sc.close();
	}
}