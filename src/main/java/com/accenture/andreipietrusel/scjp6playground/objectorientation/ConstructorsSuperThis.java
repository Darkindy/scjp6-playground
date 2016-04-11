package com.accenture.andreipietrusel.scjp6playground.objectorientation;

class Super {
	public int a;

	/**
	 * XXX: if parameterized constructor, subclass needs to invoke it d.o.indir.
	 */
	protected Super(int a) {
		this.a = a;
	}
}

class Sub extends Super {
	public Sub(int a) {
		super(a);
	}

	public Sub() {
		// this.a = 5;
		this(5); // will work, because it eventually calls super(a)
		// super(5); // will work
	}
}
