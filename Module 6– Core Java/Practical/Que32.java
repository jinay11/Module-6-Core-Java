package PracticalAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

//Write a program to demonstrate exception handling using try-catch-finally.

public class Que32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number1 :");
		int num1 = sc.nextInt();

		System.out.println("Enter number2 :");
		

		try {
			
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println("Result: " + result);
			
		} catch (InputMismatchException e) {
			System.out.println("String can not divide by number : ");
			
		} catch (ArithmeticException e) {
			 System.out.println("Exception caught: Cannot divide by zero.");
			
		} finally {
			System.out.println("finally block always executes.");
			sc.close();
		}
	}
}