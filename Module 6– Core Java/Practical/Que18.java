package PracticalAssignment;

// Implement method overriding to show polymorphism in action.

class Payment{
	public void pay() {
		System.out.println("Processing a generic payment...");
	}
}

class CreditCard extends Payment{
	public void pay() {
		System.out.println("Payment done using creadit card.");
	}
}

class UPIPayment extends Payment{
	public void pay() {
		System.out.println("Payment done using UPI");
	}
}

public class Que18 {
	public static void main(String[] args) {
		Payment p1 = new Payment();
		p1.pay();
		
		CreditCard p2 = new CreditCard();
		p2.pay();
		
		UPIPayment p3 = new UPIPayment();
		p3.pay();
	}
}