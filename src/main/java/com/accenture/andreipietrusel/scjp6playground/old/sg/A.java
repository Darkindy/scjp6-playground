package com.accenture.andreipietrusel.scjp6playground.old.sg;

public class A {

	protected static String value = "A";

	public void printValue() {
		System.out.println(value);
	}

	public static void main(String[] args) {
		new A().printValue();
		new B1().printValue();
		new B2().printValue();
		new A().printValue();
	}

}
