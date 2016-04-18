package com.accenture.andreipietrusel.scjp6playground.genericscollections;

import java.util.TreeSet;

public class TreeSetAddSameElement implements Comparable {
	public String name;

	public int compareTo(Object o) {
		return 0;
	}

	public static void main(String... args) {
		TreeSetAddSameElement one = new TreeSetAddSameElement();
		TreeSetAddSameElement two = new TreeSetAddSameElement();
		one.name = "Coffee";
		two.name = "Tea";
		TreeSet set = new TreeSet();
		set.add(one);
		set.add(two);
		System.out.println(set.size() + " " + ((TreeSetAddSameElement) set.iterator().next()).name);
	}
}