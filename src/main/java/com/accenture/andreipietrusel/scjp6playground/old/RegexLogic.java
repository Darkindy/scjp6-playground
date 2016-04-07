package com.accenture.andreipietrusel.scjp6playground.old;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLogic {
	// \d = digit, \s = spatiu, \w =word (0,a,_)

	public void execute() {
		Pattern p = Pattern.compile("ab"); // the expression
		Matcher m = p.matcher("abaaaba"); // the source
		while (m.find()) { // odata gasit un match, se sare peste caracterele ce
							// il compun
			// System.out.print(m.start() + " ");
		}
	}

}
