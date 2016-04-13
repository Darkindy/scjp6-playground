package com.accenture.andreipietrusel.scjp6playground.flowexceptionsassertions;

public class CuriousSwitch {
	public enum Dogs {
		collie, harrier, shepherd
	};

	public static void main(String[] args) {
		Dogs myDog = Dogs.shepherd;
		switch (myDog) {
		case collie:
			System.out.print("collie ");
			/* XXX: It's default, not case default: */
			// case default:
		default:
			System.out.print("retriever ");
		case harrier:
			System.out.print("harrier ");
		}
	}
}