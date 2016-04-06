package com.accenture.andreipietrusel.playground.serious.collections.curiosity;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class LinkedHashMapCuriosityTest {

	private LinkedHashMapCuriosity curiosity = new LinkedHashMapCuriosity();

	/*
	 * Q: Which Set implementation does LinkedHashMap.keySet() use? A: It's NOT
	 * LinkedHashSet as you might expect, but HashMap$KeySet (private type).
	 */
	@Test
	public void testGetKeySetOfLinkedHashMap() {
		Set<String> keySet = curiosity.getKeySetOfLinkedHashMap();
		Assert.assertNotEquals(LinkedHashSet.class, keySet.getClass());
	}

}