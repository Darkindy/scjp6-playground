package com.accenture.andreipietrusel.scjp6playground.genericscollections.curiosity;

import java.util.ArrayList;
import java.util.List;

import com.accenture.andreipietrusel.scjp6playground.genericscollections.ComplicatedGenerics;

public class CuriosityGenerics<T extends ComplicatedGenerics> {

	/*
	 * XXX: You cannot instantiate and return an object of just the generic
	 * type.
	 */
	public T getGeneric1() {
		// return new CuriosityGenerics(); // Does not compile
		// return new ComplicatedGenerics(); // Does not compile
		return null;
	}

	/* XXX: You can return a new object of the full parameterized type. */
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
	
	public <X extends String> List<X> doMyStuff(List<X> param){
		return null;
	}
	
	public void lol(){
		@SuppressWarnings("rawtypes")
		List l = new ArrayList();
		doMyStuff(l);
	}

}