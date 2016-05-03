package com.accenture.andreipietrusel.scjp6playground.declarationsaccess;

import java.text.DateFormat;
import java.util.Date;

public class MostSpecificOverloadExperiment {

	public static void doSomething(DateFormat o) {
	}

	public static void doSomething(Date d) {
	}

	public static void main(String... args) {
		/* XXX: explicit cast on null can be used to select specific overload */
		doSomething((Date) null);
	}

}
