package PracticalAssignment;

//Create multiple constructors in a class and demonstrate constructor overloading

class Students {
	String name;
	int age;

	// default constructor
	Students() {
		name = "Unknown";
		age = 0;
	}

	// constructor with only name
	Students(String name) {
		this.name = name;
		this.age = 0;
	}

	// constructor with only age
	Students(int age) {
		this.name = "Not Provide";
		this.age = age;
	}

	// constructor with both name and age
	Students(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Student Name: "+name);
		System.out.println("Student age: "+age);
	}
}

public class Que11 {
	public static void main(String[] args) {
		Students s1 = new Students();
		Students s2 = new Students("Luffy");
		Students s3 = new Students(20);
		Students s4 = new Students("Roronoa Zoro",21);
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}
}