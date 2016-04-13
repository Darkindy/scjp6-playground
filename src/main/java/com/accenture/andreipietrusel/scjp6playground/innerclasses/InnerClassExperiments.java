package com.accenture.andreipietrusel.scjp6playground.innerclasses;

public class InnerClassExperiments {

	public static void main(String... args) {
		Outer outer = new Outer();
		/* XXX: syntax outer.new Inner() to instantiate inner. Qalif only ref */
		Outer.Inner inner = outer.new Inner(); // dont do Outer.Inner!!!

		/* XXX: when you instantiate static nested, you Outer qualify both */
		Outer.StaticNested staticNested = new Outer.StaticNested();
	}

}

class Outer {

	static class StaticNested {

	}

	class Inner {

	}

}