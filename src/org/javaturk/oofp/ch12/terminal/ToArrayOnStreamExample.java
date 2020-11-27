package org.javaturk.oofp.ch12.terminal;

import static org.javaturk.oofp.ch12.domain.BookFactory.getBookList;
import static org.javaturk.oofp.ch12.domain.CollectionFactory.getNameList;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

import org.javaturk.oofp.ch12.domain.Book;
import org.javaturk.oofp.ch12.domain.Person;

public class ToArrayOnStreamExample {
	public static void main(String[] args) {

		System.out.println("\nNew array");
		List<String> nameList = getNameList();
		Object[] names = nameList.stream().toArray();
		for (Object o : names)
			System.out.println(o);

		System.out.println("\nNew array using a generator");
		nameList = getNameList();
		String[] stringArray = nameList.stream().toArray(String[]::new);
		for (String s : stringArray)
			System.out.println(s);

		System.out.println("\nUsing a generator that produces uppercase. It does not work!");
		final List<String> newNameList = getNameList();
		IntFunction<String[]> generator = (size) -> {
			String[] newStringArray = new String[size];
			for (int i = 0; i < size; i++)
				newStringArray[i] = newNameList.get(i).toUpperCase();

			System.out.println("Uppercase names");
			for (String name : newStringArray)
				System.out.println(name);
			return stringArray;
		};

		System.out.println("\n");
		String[] uppercaseNames = newNameList.stream().toArray(generator);
		for (String s : uppercaseNames)
			System.out.println(s);

		System.out.println("\nNew book array");
		List<Book> bookList = getBookList();
		Object[] books = bookList.stream().toArray();
		for (Object book : books)
			System.out.println(book);

		System.out.println("\nNew array using a generator");
		bookList = getBookList();
		Book[] newBooks = bookList.stream().toArray(Book[]::new);
		for (Book book : newBooks)
			System.out.println(book);

		System.out.println("\nNew array using a generator");
		final List<Book> newBookList = getBookList();
		IntFunction<Book[]> bookGenerator = (size) -> {
			Book[] newBookArray = new Book[size];
			for (int i = 0; i < size; i++) {
				Book book = newBookList.get(i);
				book.setPages(0);
				newBookArray[i] = book;
			}
			System.out.println("\nBooks with pages zeroed");
			for (Book book : newBookArray)
				System.out.println(book);
			return newBookArray;
		};

		Book[] booksWithPageNumbersZeroed = bookList.stream().toArray(bookGenerator);
		for (Book book : booksWithPageNumbersZeroed)
			System.out.println(book);
	}
}
