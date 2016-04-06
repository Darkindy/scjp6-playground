package com.accenture.andreipietrusel.playground.serious.collections.curiosity;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapCuriosity {

	/*
	 * Q: Which Set implementation does LinkedHashMap.keySet() use? A: It's NOT
	 * LinkedHashSet as you might expect, but HashMap$KeySet (private type).
	 */
	public Set<String> getKeySetOfLinkedHashMap() {
		Map<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
		linkedHashMap.put("X", new Object());
		linkedHashMap.put("A", new Object());
		linkedHashMap.put("C", new Object());

		return linkedHashMap.keySet();
	}

}
