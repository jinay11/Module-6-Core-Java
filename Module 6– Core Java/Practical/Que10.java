package PracticalAssignment;

// Create a class Student with attributes (name, age) and a method to display the details.

class Student {
	String name;
	int age;

	public void display(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
	}
}

public class Que10 {
	public static void main(String[] args) {
		Student myObj = new Student();
		myObj.display("Malang", 21);
		System.out.println("--------");
		myObj.display("Tapu", 19);
	}
}