package com.accenture.andreipietrusel.scjp6playground.flowexceptionsassertions;

import java.io.IOException;

class Base {
	void crunch() throws IOException {
	}
}

public class OverridesAndExceptions extends Base {
	public static void main(String[] args) {
		new OverridesAndExceptions().crunch();
	}

	/* Consider every method below, BY ITSELF! */

	// void crunch() {
	// } // CORRECT - compiles, removes need for exception handling in main

	// void crunch() throws Exception {
	// } // Incorrect override. Broader exceptions are not allowed in subclass

	// void crunch(int x) throws Exception(){}
	// Override is legal, but it doesn't remove need for exc handling in main

	void crunch() throws RuntimeException {
	} // CORRECT - compiles, removes need for exception handling in main

	// void crunch() throws FileNotFoundException {
	// } // Override is legal (subclass of exception in base)
	// , but it doesn't remove need for exc handling in main

}