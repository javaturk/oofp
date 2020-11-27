package org.javaturk.oofp.ch12.domain;

import java.util.ArrayList;
import java.util.List;

public class BookFactory {
	
	public static List<Book> getBookList(){
		List<Book> books = new ArrayList<>();
		books.add(new Book("The Cat in the Hat", "Dr", "Seuss", 450, true));
		books.add(new Book("Harry Potter and The Sorcerers Stone", "JK", "Rowling", 411, true));
		books.add(new Book("Miss Peregrine's Home for Peculiar Children", "Ranson", "Riggs", 382, true));
		books.add(new Book("Java Tutorial", "Mark", "Randall", 717, false));
		books.add(new Book("Java Lambdas", "John", "Maguire", 182, false));
		books.add(new Book("C++ reference", "Herbert", "Schildt", 982, false));
		books.add(new Book("Clean Code", "Robert C.", "Martin", 450, false));
		books.add(new Book("Harry Potter and The Sorcerers Stone", "JK", "Rowling", 420, true));
		books.add(new Book("Miss Peregrine's Home for Peculiar Children", "Ranson", "Riggs", 400, true));
		books.add(new Book("Effective Java", "Joshua", "Bloch", 717, false));
		books.add(new Book("Design Patterns", "Eric", "Gamma", 450, false));
		books.add(new Book("Refactoring", "Martin", "Fowler", 982, false));
		books.add(new Book("C++ reference", "Herbert", "Shildt", 982, false));
		books.add(new Book("C++ reference", "Herbert", "Schildt", 882, false));
		books.add(new Book("Come'n Bro", "Akin", "Kaldiroglu", 602, false));
		return books;
	}
}
