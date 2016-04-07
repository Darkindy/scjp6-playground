package com.accenture.andreipietrusel.scjp6playground.genericscollections.curiosity;

import com.accenture.andreipietrusel.scjp6playground.genericscollections.ComplicatedGenerics;

public class CuriosityGenerics<T extends ComplicatedGenerics> {

	/*
	 * XXX: You cannot instantiate and return an object of just the
	 * parameterized type.
	 */
	public T getGeneric1() {
		// return new CuriosityGenerics(); // Does not compile
		// return new ComplicatedGenerics(); // Does not compile
		return null;
	}

	/* XXX: You can return a new object of the */
	public CuriosityGenerics<T> getGeneric2() {
		return new CuriosityGenerics<T>();
	}

	/* Same as in ComplicatedGenerics. */
	public <X extends T> CuriosityGenerics<X> getGeneric3() {
		return new CuriosityGenerics<X>();
	}

	/* Returning just the passed in parameter. */
	public <X extends T> X getGeneric4(X x) {
		return x;
	}

}