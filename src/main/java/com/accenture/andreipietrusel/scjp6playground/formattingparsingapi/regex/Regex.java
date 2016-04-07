package com.accenture.andreipietrusel.scjp6playground.formattingparsingapi.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static final String word = "1012 0208 430";

	/*
	 * XXX: Once matched group w/ find(), the next find continue from end of grp
	 */
	public static void main(String[] args) {
		// XXX: ? in regex means 0 or 1 occurences
		System.out.println("*** I ***");
		executeRegexLogic("0([0-7])?", word);

		// XXX: * in regex means 0 or many occurences
		System.out.println("*** II ***");
		executeRegexLogic("0([0-7])*", word);

		// XXX: + in regex means 1 or many occurences
		System.out.println("*** III ***");
		executeRegexLogic("0([0-7])+", word);
	}

	static void executeRegexLogic(String pattern, String word) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(word);
		while (m.find())
			System.out.print(m.group() + " ");
		System.out.println();
	}

}