package com.accenture.andreipietrusel.scjp6playground.flowexceptionsassertions;

public class Assert2ndExpressionThatModifies {

	public static void main(String[] args) {
		case2WhatHappens();
	}

	/* XXX: assert false_expression will throw AssertionError */
	static void case1ThrowsAssertionError() {
		boolean assertsOn = false;
		assert (assertsOn) : assertsOn = true;

		System.out.println("SERIOS?");
		if (assertsOn) {
			System.out.println("assert is on");
		}
	}

	static void case2WhatHappens() {
		boolean assertsOn = false;
		assert (!assertsOn) : assertsOn = true;

		System.out.println("SERIOS?");
		if (assertsOn) {
			System.out.println("assert is on");
		}
	}

}
