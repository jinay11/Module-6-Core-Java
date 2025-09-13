package PracticalAssignment;

//Demonstrate type casting (explicit and implicit)

public class Que6 {
	public static void main(String[] args) {
		
		//implicit
		int num = 101;
		double d = num;
		
		System.out.println(" ----implicit---- ");
		System.out.println("int value: "+num);
		System.out.println("int value convert a double type: "+d);
		
		//explicit
		double dbl = 2.9082025;
		int i = (int) dbl;
		
		System.out.println(" ---- explicit ----");
		System.out.println("double value: "+dbl);
		System.out.println("double value conver a int: "+i);
	}
}