package PracticalAssignment;

import java.util.Scanner;

//  Write a program to display the Fibonacci series using a loop.

public class Que9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of terms in Fibonacci series: ");
		int n = sc.nextInt();
		
		int first =0;
		int second = 1;
		
		System.out.println("Fibonacci series: ");
		for(int i=0;i<n;i++) {
			System.out.println(first+" ");
			int next = first + second;
			first = second;
			second =next;
		}
		sc.close();
	}
}