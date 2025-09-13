package PracticalAssignment;

//  Implement a simple class with getters and setters for encapsulation.

class Data{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	//getter methods
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}

public class Que12 {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.setName("Luffy");
		d1.setAge(20);
		
		System.out.println("Student Name: "+d1.getName());
		System.out.println("Student Age: "+d1.getAge());
	}
}