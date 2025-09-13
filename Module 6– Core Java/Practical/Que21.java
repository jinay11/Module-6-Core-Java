package PracticalAssignment;

import java.util.Scanner;

// Write a program to perform matrix addition and subtraction using 2D arrays.

public class Que21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();

		System.out.println("Enter number of columns: ");
		int cols = sc.nextInt();

		int[][] matrix1 = new int[rows][cols];
		int[][] matrix2 = new int[rows][cols];
		int[][] sum = new int[rows][cols]; // stores result of addition
		int[][] diff = new int[rows][cols]; // stores result of substraction

		System.out.println("Enter element of first matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter element of second matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j]; // Add
				diff[i][j] = matrix1[i][j] - matrix2[i][j]; // Subtract
			}
		}

		System.out.println("\nMatrix Addition:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nMatrix Subtraction:");
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < cols; j++) {
		        System.out.print(diff[i][j] + " ");
		    }
		    System.out.println();
		}

	}
}