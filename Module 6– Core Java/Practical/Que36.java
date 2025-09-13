package PracticalAssignment;

//Implement thread synchronization using synchronized blocks or methods.


class Counter {
	private int count = 0;

	// synchronized method - only one thread can access at a time
	public synchronized void increment(String threadName) {
		count++;
		System.out.println(threadName + " incremented count to: " + count);
	}
}

class MyThreads extends Thread {
	Counter c;
	String name;

	MyThreads(Counter c, String name) {
		this.c = c;
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			c.increment(name);
		}
	}
}

public class Que36 {
	public static void main(String[] args) {
		Counter counter = new Counter();

		// Two threads sharing the same Counter
		MyThreads t1 = new MyThreads(counter, "Thread-1");
		MyThreads t2 = new MyThreads(counter, "Thread-2");

		t1.start();
		t2.start();
	}
}
