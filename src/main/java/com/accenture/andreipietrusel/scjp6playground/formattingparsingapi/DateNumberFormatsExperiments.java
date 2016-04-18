package com.accenture.andreipietrusel.scjp6playground.formattingparsingapi;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateNumberFormatsExperiments {

	public static void main(String... args) {
		/* Calendar */
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.roll(Calendar.MONTH, -2);
		calendar.add(Calendar.HOUR, 5);

		/* Locale */
		Locale locale = new Locale("ro", "MD");
		// Locale currentLocale = Locale.getDefault();
		System.out.println("The locale selected is " + locale.getDisplayLanguage() + ", " + locale.getDisplayCountry()
				+ " in the default locale and " + locale.getDisplayLanguage(locale) + ", " + locale.getDisplayCountry()
				+ " in the selected locale.");

		/* DateFormat */
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
		String formattedDate = dateFormat.format(calendar.getTime());
		System.out.println(formattedDate);

		/* NumberFormat */
		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		numberFormat.setMinimumFractionDigits(6);
		String formattedNumber = numberFormat.format(145.16);
		System.out.println(formattedNumber);

		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
		String formattedCurrency = currencyFormat.format(145.16);
		System.out.println(formattedCurrency);
	}

}