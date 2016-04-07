package com.accenture.andreipietrusel.scjp6playground.old;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ActiveTest {

	private InterfaceOverrideLogic interfaceOverrideLogic = new InterfaceOverrideLogic();

	@Test
	public void regexTest() {
		RegexLogic regexLogic = new RegexLogic();
		regexLogic.execute();
	}

	@Test
	public void dateTest() {
		DateLogic dateLogic = new DateLogic();
		dateLogic.execute();
	}

	@Test
	public void filesTest() {
		assertEquals(FilesLogic.MESSAGE_LINE_TO_WRITE, new FilesLogic().execute());
	}

	@Test
	public void stringsInternTest() {
		assertTrue(new StringsInternLogic().execute());
	}

	@Test
	public void interfaceOverrideTest() {
		assertNull(interfaceOverrideLogic.executeLogic());
	}

	@Test
	public void cloneTest() {
		CloneLogic cloneLogic1 = new CloneLogic();
		cloneLogic1.setA(5);

		CloneLogic cloneLogic2 = cloneLogic1.clone();
		Assert.assertEquals(cloneLogic1.getA(), cloneLogic2.getA());
	}

	@Ignore
	@Test
	public void adrianTest() {
		int targetSolutions = 1;
		int foundSolutions = 0;
		for (int i = 199920; i <= Integer.MAX_VALUE; i++) {
			int s = nrOfOnesFromOne(i);
			if (s == i) {
				System.out.print(" OK!");
				++foundSolutions;
			}
			System.out.print("Numarul " + i + " are " + s + " de 1 in numerele de pana la el.  Solutii gasite: "
					+ foundSolutions);
			System.out.println("");
			if (foundSolutions == targetSolutions)
				break;
		}
	}

	private int nrOfOnesFromOne(Integer n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += nrOfOnesPerNumber(i);
		}
		return s;
	}

	private int nrOfOnesPerNumber(Integer i) {
		String line = i.toString();
		return line.length() - line.replace("1", "").length();
	}

}
