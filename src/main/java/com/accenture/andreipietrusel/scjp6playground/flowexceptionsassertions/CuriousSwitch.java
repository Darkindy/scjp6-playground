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
			int a = 3;
			break;
		default:
			/* XXX: variables declared in prev cases are reusable evn >break */
			/* XXX: previous case vars must be reinitialized explicitly */
			// System.out.println(a); must be reinitialized in order to work
			System.out.print("retriever ");
		case harrier:
			System.out.print("harrier ");
		}
	}
}