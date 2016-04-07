package com.accenture.andreipietrusel.scjp6playground.old;

public class StringsInternLogic {

	public boolean execute() {

		String a = new String("lol");
		String b = new String("lol");
		a = a.intern();
		b = b.intern();

		return a == b;

		// System.out.println(a.substring(0, 0)); // nu da eroare, da blank
		// (parametri inclusiv,
		// exclusiv [ , ))
	}

}
