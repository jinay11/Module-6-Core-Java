package PracticalAssignment;

// Write a program that demonstrates inheritance using extends keyword.

class Vehicles{
	String color = "black";
	
	public void details() {
		System.out.println("The car color is: "+color);
	}
}

class Bike extends Vehicles{
	public void showDetails() {
		System.out.println("The bike color is: "+color);
	}
}

public class Que24 {
	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.details();
		b1.showDetails();
	}
}