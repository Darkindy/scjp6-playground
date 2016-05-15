package com.accenture.andreipietrusel.scjp6playground.genericscollections;

import java.util.ArrayList;
import java.util.List;

public class GenericReturnExperiment {

	public static <E extends CharSequence> List<? super E> getThat(List<E> elements) {
		return elements;
	}
	// public static <E super CharSequence> List<E> getThatSuper(List<E>
	// elements){
	// return elements;
	// }

	public static void main(String[] args) {
		/*
		 * XXX: List<? super/extends X> return only be assign to wildcard/legacy
		 */
		List<? super String> strings = getThat(new ArrayList<String>(2));
		strings.add("");
	}

}