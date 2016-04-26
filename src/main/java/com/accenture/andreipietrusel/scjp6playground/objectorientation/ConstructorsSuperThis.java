package com.accenture.andreipietrusel.scjp6playground.objectorientation;

class Super {
	public int a;

	/**
	 * XXX: if parameterized constructor, subclass needs to invoke it d.o.indir.
	 */
	protected Super(int a) {
		this.a = a;

		if (this instanceof ConstructorsSuperThis)
			System.out.println("It is");
	}
}

public class ConstructorsSuperThis extends Super {
	public ConstructorsSuperThis(int a) {
		super(a);
	}

	public static void main(String... args) {
		new Super(4);
		System.out.println("Following:");
		new ConstructorsSuperThis();
	}

	public ConstructorsSuperThis() {
		// this.a = 5;
		this(5); // will work, because it eventually calls super(a)
		// super(5); // will work
	}
}
