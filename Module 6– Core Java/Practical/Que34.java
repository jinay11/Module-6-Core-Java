package PracticalAssignment;

//Create a custom exception class and use it in your program

//custom exception
class AgeException extends Exception {
	public AgeException(String message) {
		super(message);
	}
}

public class Que34 {
	static void validateAge(int age) throws AgeException {
		if (age < 18) {
			throw new AgeException("Age must be 18 or above to vote.");
		} else {
			System.out.println("Valid age: You can vote!");
		}
	}

	public static void main(String[] args) {
		 try {
	            validateAge(15);   // Will throw exception
	            validateAge(20);   // Will execute if no exception
	        } catch (AgeException e) {
	            System.out.println("Caught Custom Exception: " + e.getMessage());
	        } finally {
	            System.out.println("Program finished (finally block executed).");
	        }
	}
}