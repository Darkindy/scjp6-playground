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
	 * types and, in this case, we can only return full generic types used by
	 * the generic method.
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