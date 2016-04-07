package com.accenture.andreipietrusel.scjp6playground.declarationsaccess;

public class StaticHiding extends Thread {

	public static void main(String[] args) {
		Thread t = new Thread(new StaticHiding());
		Thread t2 = new Thread(new StaticHiding());
		t.start();
		t2.start();
	}

	/*
	 * XXX: This static method cannot hide the instance method from superclass.
	 * 
	 * Additional notes:
	 * 
	 * > the reverse is also a compiler error (instance method hiding static
	 * method defined in superclass)
	 *
	 * > What is permitted: Overriding an instance method by an instance method
	 * and Hiding a static method by a static method
	 */
	public /* static */ void run() {
		for (int i = 0; i < 2; i++)
			System.out.print(Thread.currentThread().getName() + " ");
	}
}