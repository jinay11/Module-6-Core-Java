package PracticalAssignment;

import java.util.Scanner;

//  Implement method overloading by creating methods for different data types

class Calculator {
	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	String add(String a, String b) {
		return a + " " + b;
	}
}

public class Que14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c1 = new Calculator();

		System.out.println("Enter two integers: ");
		int int1 = sc.nextInt();
		int int2 = sc.nextInt();
		System.out.println("Sum of integers: " + c1.add(int1, int2));

		System.out.println("Enter two decimal numbers: ");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		System.out.println("Sum of doubles: " + c1.add(d1, d2));

		sc.nextLine();
		System.out.println("Enter first string: ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter second string: ");
		String s2 = sc.nextLine();
		System.out.println("Concate string: " + c1.add(s1, s2));
	}
}