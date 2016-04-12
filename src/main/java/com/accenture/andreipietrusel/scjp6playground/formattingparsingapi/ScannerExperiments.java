package com.accenture.andreipietrusel.scjp6playground.formattingparsingapi;

import java.util.Scanner;

public class ScannerExperiments {

	public static void main(String... args) {
		String csv = "Sue,5,true,3";
		Scanner scanner = new Scanner(csv);
		scanner.useDelimiter(",");
		int age = scanner.nextInt(); // InputMismatchException
	}

}