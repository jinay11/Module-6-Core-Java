package PracticalAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

// Implement multiple catch blocks for different types of exceptions.

public class Que33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter number2: ");
		
		
		
		try 
		{
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println("result: "+result);
			
			int arr[] = {1,2,3};
			System.out.println("Accessing element at index 5: "+arr[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught ArithmeticException: Cannot divide by zero.");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Caught InputMismatchException: Please enter a valid integer.");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid array index.");
		}
		catch(Exception e)
		{
			// Default catch block for any other exceptions
			System.out.println("Caught Exception: "+e);
		}
		finally
		{
			System.out.println("Finally block executed.");
            sc.close();
		}
		
	}
}