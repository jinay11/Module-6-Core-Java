package PracticalAssignment;

// Write a program that implements multiple interfaces in a single class.

interface Printable{
	void print();
}

interface showable{
	void show();
}

class Report implements Printable, showable{
	public void print() {
		System.out.println("Printing the report");
	}
	public void show() {
		System.out.println("Showing the report");
	}
}

public class Que28 {
	public static void main(String[] args) {
		Report p1= new Report();
		p1.print();
		p1.show();
	}
}