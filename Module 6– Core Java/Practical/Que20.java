package PracticalAssignment;

// Demonstrate constructor overloading by passing different types of parameters

class AllCars {
	String brand;
	String model;
	int year;
	double price;

	// default constructor
	AllCars() {
		brand = "Unknown";
		model = "Unknow";
		year = 0;
		price = 0.0;
	}

	// constructor with string parameters
	AllCars(String b, String m) {
		brand = b;
		model = m;
	}

	// constructor with string and int parameters
	AllCars(String m, String b, int y) {
		model = m;
		brand = b;
		year = y;
	}

	// constructor with all parameters
	AllCars(String m, String b, int y, double p) {
		model = m;
		brand = b;
		year = y;
		price = p;
	}

	public void displayDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Price: " + price);
		System.out.println("-----------------------------");
	}
}

public class Que20 {
	public static void main(String[] args) {
		AllCars c1 = new AllCars();

		AllCars c2 = new AllCars("Hyundai", "creta");

		AllCars c3 = new AllCars("Harrier", "Tata", 2024);

		AllCars c4 = new AllCars("Fortuner", "Toyota", 2023, 3500000.00);

		c1.displayDetails();
		c2.displayDetails();
		c3.displayDetails();
		c4.displayDetails();

	}
}