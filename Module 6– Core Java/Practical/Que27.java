package PracticalAssignment;

// Create an abstract class and implement its methods in a subclass.

abstract class Shape{
	abstract public void draw();
	
	public void display() {
		System.out.println("This is the shape.");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing a circle. ");
	}
}

public class Que27 {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.display();
		c1.draw();
	}
}