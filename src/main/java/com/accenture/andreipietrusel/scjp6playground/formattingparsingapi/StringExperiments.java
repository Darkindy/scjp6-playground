package com.accenture.andreipietrusel.scjp6playground.formattingparsingapi;

public class StringExperiments {
	
	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "cd";
		String s = s1.concat(s2);
		String sp = "abcd";
		System.out.println(s == sp);

		s.intern(); // already in pool, doesnt replace it the pool one, returns
					// old pooled object
		System.out.println(s == sp); // this will be false

		String rev = s2.concat(s1);
		rev.intern(); // adds exactly this string to pool, returns same (not
						// used here)
		System.out.println("cdab" == rev); // this will be true

		String rev2 = new String(rev); // String(String) copy constructor
		System.out.println(rev == rev2); // false

		/* XXX: In String.split, all trailing delimiters are discarded! */
		System.out.println("Split with last double delimiter:" + "name:john;;;sex:m;;;;;".split(";").length);
	}

}