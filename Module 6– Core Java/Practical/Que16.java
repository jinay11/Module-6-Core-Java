package PracticalAssignment;

//  Write a program demonstrating single inheritance.

class Animal{
	public void sound() {
		System.out.println("Animal have a differente sound");
	}
}

class Cat extends Animal{
	public void Catsound() {
		System.out.println("Cat sound is  meows meows");
	}
}

public class Que16 {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.sound();
		c1.Catsound();
	}
}