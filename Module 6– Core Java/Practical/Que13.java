package PracticalAssignment;

import java.util.Scanner;

//Write a program to find the maximum of three numbers using a method

class MaxFinder {
	int findMax(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}
}

public class Que13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();

		System.out.print("Enter third number: ");
		int num3 = sc.nextInt();

		MaxFinder myObj = new MaxFinder();
		int result = myObj.findMax(num1, num2, num3);
		
		 System.out.println("The maximum of the three numbers is: " + result);
		 sc.close();
	}
}