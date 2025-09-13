package PracticalAssignment;

//  Use inter-thread communication methods like wait(), notify(), and notifyAll()

class SharedResource {
	private boolean available = false; // flag to check item availability

	// Producer method
	synchronized void produce() {
		System.out.println("Producer started...");
		available = true;
		System.out.println("Produced an item ✅");
		notify(); // Wake up one waiting consumer
	}

	// Consumer method
	synchronized void consume() {
		if (!available) { // if no item produced, wait
			try {
				System.out.println("Consumer waiting...");
				wait(); // waits until producer notifies
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumer got the item 🛒");
	}
}

public class Que37 {
	public static void main(String[] args) {
		SharedResource resource = new SharedResource();

		// Consumer thread (waits until producer produces)
		Thread consumer = new Thread(() -> resource.consume());

		// Producer thread (produces and notifies consumer)
		Thread producer = new Thread(() -> resource.produce());

		consumer.start();
		producer.start();	
	}
}