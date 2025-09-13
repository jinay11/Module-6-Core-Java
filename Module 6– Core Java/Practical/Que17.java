package PracticalAssignment;

//  Create a class hierarchy and demonstrate multilevel inheritance.

class Vehicle{
	public void start() {
		System.out.println("Vehicle start with a key.");
	}
}

class Car extends Vehicle{
	public void fuleType() {
		System.out.println("Car runs on Petrol and Diesel.");
	}
}

class SportsCar extends Car{
	public void speed() {
		System.out.println("Sports car can go very fast!");
	}
}

public class Que17 {
	public static void main(String[] args) {
		SportsCar myObj = new SportsCar();
		myObj.start();
		myObj.fuleType();
		myObj.speed();
	}
}