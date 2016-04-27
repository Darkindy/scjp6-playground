package com.accenture.andreipietrusel.scjp6playground.assignments;

public class AmbiguousOverloads {

	public static void doStuff(int x, long y) {

	}

	public static void doStuff(long y, int x) {

	}

	public static void main(String... strings) {
		/* XXX: method overloads can cause ambiguities. */
		// doStuff(4, 4);
	}

}