package com.accenture.andreipietrusel.scjp6playground.flowexceptionsassertions;

public class DeadAndUnreachableCode {

	@SuppressWarnings("unused")
	public static void main(String... args) {
		/* XXX: Dead code is only a warning: if(false) is allowed. */
		if (false) {
			System.out.println("");
		}

		/* XXX: Do{} while(false) is allowed */
		do {
			System.out.println("");
		} while (false);

		/* XXX: Unreachable code: while(false) is illegal! */
		// while (false) {
		//
		// }

		/* XXX: Unreachable code: for(;false;) is illegal! */
		// for (;false;){
		//
		// }
	}

}
