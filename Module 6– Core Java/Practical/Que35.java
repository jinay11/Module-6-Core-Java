package PracticalAssignment;

// Write a program to create and run multiple threads using the Thread class.

class MyThread extends Thread {
	private String threadName;

	MyThread(String name) {
		this.threadName = name;
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(threadName + "- Count: " + i);
			try {
				Thread.sleep(500); // pause for half a second
			} catch (InterruptedException e) {
				System.out.println(threadName + " interrupted.");
			}
		}
		System.out.println(threadName + " finished.");
	}
}

public class Que35 {
	public static void main(String[] args) {
		// creating multiple thread
		MyThread t1 = new MyThread("Thread-1");
		MyThread t2 = new MyThread("Thread-2");
		MyThread t3 = new MyThread("Thread-3");

		t1.start();
		t2.start();
		t3.start();

		System.out.println("Main thread finished.");
	}
}