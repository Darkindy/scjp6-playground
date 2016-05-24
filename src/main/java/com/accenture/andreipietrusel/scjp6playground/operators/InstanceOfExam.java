package com.accenture.andreipietrusel.scjp6playground.operators;

public class InstanceOfExam {

	interface Fish {
	}

	static class Perch implements Fish {
	}

	static class Walleye extends Perch {
	}

	static class Bluegill {
	}

	public static void main(String[] args) {
		Fish f = new Walleye();
		Walleye w = new Walleye();
		Bluegill b = new Bluegill();
		if (f instanceof Perch)
			System.out.print("f-p ");
		if (w instanceof Fish)
			System.out.print("w-f ");
		/* XXX: EXAM - instanceof an INTERFACE compiles every time! */
		if (b instanceof Fish)
			System.out.print("b-f ");
	}

}