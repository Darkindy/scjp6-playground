package com.accenture.andreipietrusel.scjp6playground.declarationsaccess;

interface A111 {
	/* XXX: consts in interfaces NOT necessary declared public static final */
	String s = "yo";
	final String g = "t";
	static final String g2 = "t";
	public static final String g3 = "t";
	// protected/private static final String g4 = "t"; // will NOT work!

	public void method1();

	/* methods from interface NOT necessary declared public abstract;butcould */
	public abstract void somth();
}

interface B {
}

interface C extends A111, B {
	public void method1();

	public void method1(int x);
}

public class InterfaceImplicits {

	public static void main(String[] strings) {
		System.out.println(A111.s);
	}

}