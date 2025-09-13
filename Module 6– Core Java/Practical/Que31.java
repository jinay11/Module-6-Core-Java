package PracticalAssignment;

// Demonstrate the use of different access modifiers within the same package and across different packages.

class Accessmodifiers{
	private int age = 20;
	String name = "Luffy";
	protected String surname = "Monkey D";
	public String crewName = "Straw Hat pirates";
	
	public void displayAll() {
		System.out.println("Private: "+age);
		System.out.println("Default: " + name);
        System.out.println("Protected: " + surname);
        System.out.println("Public: " + crewName);
	}
}

public class Que31 {
	public static void main(String[] args) {
		Accessmodifiers a1 = new Accessmodifiers();
		a1.displayAll();
	}
}