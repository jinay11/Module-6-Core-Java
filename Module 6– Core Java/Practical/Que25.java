package PracticalAssignment;

//Implement runtime polymorphism by overriding methods in the child class.

class Animals{
	public void sound() {
		System.out.println("Animal make a sounds: ");
	}
}

class Dog extends Animals{
	public void sound() {
		System.out.println("Dog barks");
	}
}

class Cats extends Animals{
	public void sound() {
		System.out.println("Cat meows");
	}
}

public class Que25 {
	public static void main(String[] args) {
		Animals a1 = new Animals();
		Animals a2 = new Dog();
		Animals a3 = new Cats();
		
		a1.sound();
		a2.sound();
		a3.sound();
	}
}