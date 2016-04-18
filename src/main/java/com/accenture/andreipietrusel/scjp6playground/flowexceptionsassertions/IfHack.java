package com.accenture.andreipietrusel.scjp6playground.flowexceptionsassertions;

class X {
	public void foo() {
		System.out.print("X ");
	}
}

public class IfHack extends X {
	public void foo() throws RuntimeException {
		super.foo();
		// XXX: if(true) needed before throw to accept further non-unreachable
		if (true)
			throw new RuntimeException();
		System.out.print("B ");
	}

	public static void main(String[] args) {
		new IfHack().foo();
	}
}