package PracticalAssignment;

import java.util.Scanner;

//Implement a simple menu - driven program using a switch-case.

public class Que8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		double totalBill = 0;

		do {
			System.out.println("\n ---- Welcome to Los Pollos Hermanos Cafe ---- ");
			System.out.println("1. Pizza        $5.50");
			System.out.println("2. Burger       $8.00");
			System.out.println("3. Sandwich     $4.00");
			System.out.println("4. Cold Coffee  $2.00");
			System.out.println("5. Exit");

			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("You selected Pizza");
				totalBill += 5.50;
				break;
			case 2:
				System.out.println("You selected Burger");
				totalBill += 8.00;
				break;
			case 3:
                System.out.println("You selected Sandwich");
                totalBill += 4.00;
                break;
            case 4:
                System.out.println("You selected Cold Coffee");
                totalBill += 2.00;
                break;
            case 5:
            	System.out.println("\nYour total bill: "+totalBill+"$");
            	System.out.println("Thank you for visiting Los Pollos Hermanos :)");
            	break;
            default :
            	System.out.println("Invalid choice! Please enter a valid option.");
			}
		} while (choice != 5);
	}
}