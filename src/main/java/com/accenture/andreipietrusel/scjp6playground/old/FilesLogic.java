package com.accenture.andreipietrusel.scjp6playground.old;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FilesLogic {

	private static final String TEMP_DIR_PATH = System.getProperty("java.io.tmpdir");
	public static final File playgroundFilesDir;

	private static final String FILE_A_NAME = "fileone.txt";
	private static final String FILE_B_NAME = "filetwo.txt";

	public static final String MESSAGE_LINE_TO_WRITE = "Hello";

	static {
		File tempDir = new File(TEMP_DIR_PATH); // specifica un director
		playgroundFilesDir = new File(tempDir, "accenture-playground"); // specifica
																		// un
																		// director
																		// dintr-un
																		// subdirector
		playgroundFilesDir.mkdir(); // creeaza un director
	}

	public String execute() {

		try {
			// Refera un subdirector pentru testul cu fisiere
			File fileTestDir = new File(playgroundFilesDir, "file-tests");

			// Sterge directorul cu toate fisierele
			deleteFiles(fileTestDir);

			// Creeaza directorul
			fileTestDir.mkdir();

			// Creeaza doua fisiere goale in director
			File fileA = new File(fileTestDir, FILE_A_NAME);
			fileA.createNewFile();

			File fileB = new File(fileTestDir, FILE_B_NAME);
			fileB.createNewFile();

			// Scrie ceva in fisierul A
			PrintWriter pra = new PrintWriter(fileA); // ar si creea fisierul
														// daca nu ar exista
			pra.println(MESSAGE_LINE_TO_WRITE);
			pra.flush();
			pra.close();

			// Scrie ce e in A in fisierul B
			FileReader fra = new FileReader(fileA);
			BufferedReader bra = new BufferedReader(fra);

			FileWriter fwb = new FileWriter(fileB); // redundant, intrucat
													// printwriter poate lua
													// direct File ca parametru
			PrintWriter pwb = new PrintWriter(fwb);

			String line;
			while ((line = bra.readLine()) != null) {
				pwb.println(line);
			}
			pwb.flush();
			pwb.close();
			bra.close();

			// Citim sa vedem daca B-ul a fost umplut cu linia din A
			FileReader frb = new FileReader(fileB);
			BufferedReader brb = new BufferedReader(frb);
			try {
				return brb.readLine();
			} finally {
				brb.close();

				// In the end rename fileB to fileA_copy
				File fileACopy = new File(fileTestDir, fileA.getName().replace(".", "_copy."));
				fileB.renameTo(fileACopy);
			}
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private void deleteFiles(File dirOrFile) {
		if (dirOrFile == null)
			return;
		else if (dirOrFile.isDirectory())
			for (File f : dirOrFile.listFiles()) { // listfiles da fisiere, list
													// da doar nume de fisiere
				deleteFiles(f);
				f.delete();
			}
		else if (dirOrFile.isFile())
			dirOrFile.delete();
		else
			; // ignora stergerea
	}

}
