package com.accenture.andreipietrusel.scjp6playground.flowexceptionsassertions;

public class SkippingFinally {

	static void doStuff() {
		System.exit(0);
	}

	/*
	 * XXX: Calling System.exit (in the catch block) will make finally not
	 * execute!!! Just "done" will be printed here.
	 */
	public static void main(String[] args) {
		try {
			if (args.length == 0)
				throw new Exception();
		} catch (Exception e) {
			System.out.print("done ");
			doStuff(); // assume this method compiles
		} finally {
			System.out.println("finally ");
		}
	}

}