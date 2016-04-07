package com.accenture.andreipietrusel.scjp6playground.formattingparsingapi;

import java.io.File;

public class DirectoryListing {
	public static void main(String[] args) {
		String[] files = new String[100];
		File dir = new File(args[0]);
		files = dir.list(); // it
		System.out.println(files.length);
	}
}