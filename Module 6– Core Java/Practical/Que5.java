package PracticalAssignment;

import java.util.Scanner;

// Create a calculator using arithmetic and relational operators.

public class Que5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		System.out.println("\n---- Arithmetic operations ----");
		System.out.println("Addition: "+(a+b) );
		System.out.println("Substraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		
		if(b > 0) {
			System.out.println("Division: "+(a/b));
		}else {
			System.out.println("enter valid value for division");
		}
		
		if(b >0 ) {
			System.out.println("Remider: "+a%b);
		}else {
			System.out.println("enter valid value for remider");
		}
		
		sc.close();
	}
}