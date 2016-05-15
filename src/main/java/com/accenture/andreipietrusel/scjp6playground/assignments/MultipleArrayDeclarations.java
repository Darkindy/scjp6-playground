package com.accenture.andreipietrusel.scjp6playground.assignments;

public class MultipleArrayDeclarations {

	public static void main(String... args) {
		int[] a, b[], c[][];

		/*
		 * XXX: in multiple array declarations, the type[] is furth considered.
		 */
		b = new int[5][];
		c = new int[5][5][5];
	}

}
