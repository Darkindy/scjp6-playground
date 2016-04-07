package com.accenture.andreipietrusel.scjp6playground.formattingparsingapi.formatter;

public class FormatterSpecifiers {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		boolean b = false;
		int i = 7;
		double d = 1.23;
		float f = 4.56f;

		System.out.printf(" %b", b);
		System.out.format(" %d", i);
		System.out.format(" %f", f); // note that %f also accepts double

		/*
		 * XXX: %i is not a valid format specifier. Results:
		 * java.util.UnknownFormatConversionException
		 */
		// System.out.printf(" %i", i);

		/*
		 * XXX: %d only accepts int. Results:
		 * java.util.IllegalFormatConversionException.
		 */
		// System.out.format(" %d", d);
	}

}