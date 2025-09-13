package PracticalAssignment;

//  Write a program to create and initialize an object using a parameterized constructor.

class Cars{
	String brand;
	String model;
	int year;
	
	Cars(String b, String m, int y){
		brand = b;
		model = m;
		year = y;
	}
	
	public void display() {
		System.out.println("Car Brand: "+brand);
		System.out.println("Car Model: "+model);
		System.out.println("Car Year: "+year);
	}
}

public class Que19 {
	public static void main(String[] args) {
		Cars c1 = new Cars("Toyota", "Fortuner", 2023);
		c1.display();
		
		Cars c2 = new Cars("Hyundai","Creta",2022);
		c2.display();
	}
}