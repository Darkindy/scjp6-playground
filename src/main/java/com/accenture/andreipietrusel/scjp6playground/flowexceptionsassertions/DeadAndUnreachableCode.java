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

		/* XXX: Following if(true) then exception, code is NOT unreachable */
		if (true)
			throw new RuntimeException();

		/*
		 * Without if-ing the previous throw, the following will throw
		 * compilation error.
		 */
		System.out.println(
				"This is surprisingly NOT unreachable because of if(true). What a hack! :O. Of course, it never executes.");
	}

}
