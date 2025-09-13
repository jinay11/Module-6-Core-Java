package PracticalAssignment;

// Implement an interface for a real-world example, such as a payment gateway.

interface PaymentGateway{
	void pay(double amount);
}

class Creditcard implements PaymentGateway{
	public void pay(double amount) {
		System.out.println("Paid: "+amount+ " using credit card");
	}
}

class UPIPayments implements PaymentGateway{
	public void pay(double amount) {
		System.out.println("Paid: "+amount+ " using UPI ID");
	}
}

public class Que29 {
	public static void main(String[] args) {
		PaymentGateway p1 = new Creditcard();
		p1.pay(990);
		
		PaymentGateway p2 = new UPIPayments();
		p1.pay(1000);
	}
}