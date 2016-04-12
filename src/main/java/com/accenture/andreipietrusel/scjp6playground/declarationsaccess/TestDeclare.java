package com.accenture.andreipietrusel.scjp6playground.declarationsaccess;

interface DeclareStuff {
	public static final int EASY = 3;

	void doStuff(int t);
}

public class TestDeclare implements DeclareStuff {
	public static void main(String[] args) {
		int x = 5;
		new TestDeclare().doStuff(++x);
	}

	/* XXX: If not declared public Compilation error! */
	public void doStuff(int s) {
		/* XXX: Think of s += ... it as s = s + ... or you WILL fail! */
		s += EASY + ++s;
		System.out.println("s " + s);
	}

}