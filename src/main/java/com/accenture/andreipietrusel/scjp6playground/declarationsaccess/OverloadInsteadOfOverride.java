package com.accenture.andreipietrusel.scjp6playground.declarationsaccess;

import java.awt.print.Book;
import java.util.ArrayList;

public class OverloadInsteadOfOverride {

	class BookList extends ArrayList<Book> {
		public int count = 0;

		/*
		 * XXX: When extending a generic class, same name and arity false
		 * overrides (overloads) of are not ok!
		 */
		// public boolean add(Object o) {
		public boolean add(Book o) {
			if (o instanceof Book)
				return super.add((Book) o);
			else
				return count++ == -1;
		}
	}

	class Something {
		void doSomething(String arg) {
		}
	}

	class SomethingElse extends Something {
		void doSomething(Object arg) {
		}
	}

}