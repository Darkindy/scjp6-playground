package com.accenture.andreipietrusel.scjp6playground.assignments;

public class CaretLogicalXorOperator {

	public static void main(String[] args) {
		Long tail = 2000L;
		Long distance = 1999L;
		Long story = 1000L;
		if ((tail > distance) ^ ((story * 2) == tail)) // true ^ true = false
			System.out.print("1");
		if ((distance + 1 != tail) ^ ((story * 2) == distance))
			System.out.print("2"); // false ^ false = false
		/* No output is produced. */
		
		/* XXX: Additive inverse of short value -128 is -128. */
		byte z = Byte.MIN_VALUE;
		byte zz = (byte) -z;
		System.out.println(z + " " + zz);
		
		/* XXX: Applying - or + unary operator converts a value < int to int */
		byte a = -2;
		byte b =(byte) +a;
		System.out.println(b);
	}

}