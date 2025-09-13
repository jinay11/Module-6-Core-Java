package PracticalAssignment;

//  Use the super keyword to call the parent class constructor and methods.

class Animal1{
	String name = "Camel";
	
	Animal1(){
		System.out.println("Camel is longest animal");
	}
	
	public void color() {
		System.out.println("camel color is brown");
	}
}

class horse extends Animal1{
	horse(){
		super();
		System.out.println("horse is a running a fast");
	}
	
	public void colorHorse() {
		super.color();
		System.out.println("horse color is white");
	}
}

public class Que26 {
	public static void main(String[] args) {
		horse h1 = new horse();
		h1.colorHorse();
	}
}