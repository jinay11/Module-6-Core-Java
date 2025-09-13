package PracticalAssignment;

//   Create a class with static variables and methods to demonstrate their use.

class Demo {
	static int count = 0;

	String name;

	Demo(String name) {
		this.name = name;
		count++;
	}

	static void showCount() {
		System.out.println("Total numbers of students: "+count);
	}
	
	public void showName() {
		System.out.println("Student Name: "+name);
	}
}

public class Que15 {
	public static void main(String[] args) {
		Demo d1 = new Demo("Luffy");
		Demo d2 = new Demo("Zoro");
		Demo d3 = new Demo("Brook");
		
		d1.showName();
		d2.showName();
		d3.showName();
		
		Demo.showCount();

	}
}