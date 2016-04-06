package com.accenture.andreipietrusel.playground.serious.generics;

public class ComplicatedGenerics {

	class A {
	}

	class B extends A {
	}

	class C extends B {
	}

	/*
	 * XXX: This is a complicated generic class and function combo. It seems
	 * that we can redefine (w/extend) class generic types as generic method
	 * types.
	 * 
	 * Rule: Always pay attention to the return type and the arguments! Don't
	 * get distracted by the generic method specifier!
	 * 
	 * super can only be used in the form of: ? super T and it means T or any
	 * base (ancestor) class/interface of it.
	 */
	class Carpet<V extends B> {
		public <X extends V> Carpet<? extends V> method(Carpet<? super X> e) {

			// return new Carpet<X>(); // Compiles
			return new Carpet<V>(); // Compiles
			// return new Carpet<A>();
			// return new Carpet<B>();
			// return new Carpet<C>();
		}
	}

}