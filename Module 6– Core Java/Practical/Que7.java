package PracticalAssignment;

import java.util.Scanner;

// Write a program to find if a number is even or odd using an if-else statement.

public class Que7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		int sum = sc.nextInt();
		
		if(sum % 2 == 0) {
			System.out.println(sum + " is even number");
		}else {
			System.out.println(sum + " is odd number");
		}
	}
}