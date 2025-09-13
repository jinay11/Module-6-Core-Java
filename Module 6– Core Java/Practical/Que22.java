package PracticalAssignment;

import java.util.Scanner;
//  Create a program to reverse a string and check for palindromes.

public class Que22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		String reversed = "";
		for(int i =str.length() - 1; i >= 0 ; i--) {
			reversed = reversed + str.charAt(i);
		}
		
		System.out.println("Reversed string: "+reversed);
		
		if(str.equalsIgnoreCase(reversed)) {
			System.out.println("It is a Palindrome!");
		}else {
			System.out.println("It is NOT a Palindrome.");
		}
	}
}