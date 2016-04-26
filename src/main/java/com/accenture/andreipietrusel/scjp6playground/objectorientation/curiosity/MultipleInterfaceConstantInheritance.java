package com.accenture.andreipietrusel.scjp6playground.objectorientation.curiosity;

interface I1 {
	String s = "i2";
}

interface I2 {
	String s = "i3";
}

public class MultipleInterfaceConstantInheritance implements I1, I2 {

	/* XXX: Two impl. interf. have same const &u use it => ambig. comp. err */
	public static void main(String... smt) {
		// System.out.println("String is " + s); // This would give c.err

		String a = "abc";
		String b = "efg";

		String d = "abcefg";
		String c = a + b;
//		c = c.intern();

		System.out.println((c == d) + " " + c + " " + d);
	}

}