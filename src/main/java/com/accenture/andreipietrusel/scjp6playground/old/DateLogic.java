package com.accenture.andreipietrusel.scjp6playground.old;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateLogic {

	@SuppressWarnings("unused")
	public void execute() {

		/* Instanta de data */
		Date date1 = new Date();
		String date1ToString = date1.toString();
		/* Printeaza data in format intern */
		// System.out.println(date1ToString);

		/* Ia calendar fara locale */
		Calendar calendarSimpleInstance = Calendar.getInstance();

		/* Creeaza un nou locale */
		Locale locale = new Locale("ro", "RO");
		Calendar calendarLocaleInstance = Calendar.getInstance(locale);
		// calendarLocaleInstance.add(field, amount);

		/* Adauga/Ruleaza calendarul */
		calendarLocaleInstance.add(Calendar.DAY_OF_WEEK, 5);
		// roll face acelasi lucru ca si add decat ca atunci cand schimbi ceva
		// nu se schimba si partile mai mari, ex: adaugi 24 de ore si ajungi
		// exact de unde ai plecat (se invarte pe loc respectiva componenta a
		// datei)

		/* Ia data si ora curenta a calendarului = getTime!!! */
		Date date2 = calendarLocaleInstance.getTime();

		/* Creeaza un formator de data */
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		// getDateTimeInstance ca sa iei cu tot cu timp (nu e e la examen)
		String formattedDate = dateFormat.format(date2);
		// System.out.println(formattedDate);

		/* Ia prima zi a saptamanii */
		// System.out.println(calendarLocaleInstance.getFirstDayOfWeek());

		/* NUMBER FORMAT LOGIC */
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formattedCurrency = nf.format(2500000);
		// System.out.println(formattedCurrency);
	}

}
