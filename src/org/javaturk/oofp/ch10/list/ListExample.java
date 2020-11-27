
package org.javaturk.oofp.ch10.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import org.javaturk.oofp.ch10.util.CollectionUtil;

public class ListExample {

	public static void main(String[] args) {
		processList();
//		iterateList();
//		processUnmodifiableList();
//		listFromArray();
	}

	public static void processList() {
		System.out.println("*** processList() ***");
		List list = CollectionUtil.getList();

		System.out.println("\nList elements");
		list.forEach(System.out::println);
		
		list.add("End");
		list.add(0, "Start");
		
		System.out.println("\nList elements");
		list.forEach(System.out::println);

		System.out.println();

		System.out.println("Akin is in the list? " + list.contains("Akin"));
		System.out.println("3rd element: " + list.get(3));
		System.out.println("Index of 3: " + list.indexOf(3));
		System.out.println("last index of 3: " + list.lastIndexOf(3));

		System.out.println();

		System.out.println("Set 1st element: " + list.set(1, "Mustafa"));
		System.out.println("Akin is in the list? " + list.contains("Akin"));

		System.out.println("\nSub list between 1 (inclusive) and 3 (exclusive)");

		List subList = list.subList(1, 3);
		subList.forEach(System.out::println);

		System.out.println("\nA string list");
		List<String> stringList = CollectionUtil.getStringList();
		stringList.forEach(System.out::println);

		System.out.println("\nSorting string list");
		Comparator<String> stringComparator = (s1, s2) -> s1.length() - s2.length();
		stringList.sort(stringComparator);
		stringList.forEach(System.out::println);

		System.out.println("\nProcessing a string list with a unary operation");
		UnaryOperator<String> operator = s -> s.toUpperCase();
		stringList.replaceAll(operator);
		stringList.forEach(System.out::println);

		System.out.println("\nProcessing a string list with a predicate");
		Predicate<String> stringLengthPredicate = s -> s.length() > 3;
		stringList.removeIf(stringLengthPredicate);
		stringList.forEach(System.out::println);
	}

	public static void iterateList() {
		System.out.println("*** iterateList() ***");

		List list = CollectionUtil.getList();
		System.out.println("\nIterating the list through a for loop:");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();

		System.out.println("\nIterating the list through an iterator:");
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println("\nIterating forward through forEach:");
		list.forEach(System.out::println);

		System.out.println("\nIterating forward through a list iterator:");
		ListIterator listIter = list.listIterator();
		while (listIter.hasNext()) {
			System.out.println(listIter.nextIndex() + ": " + listIter.next());
		}

		System.out.println("\nIterating backward through a list iterator:");
		while (listIter.hasPrevious()) {
			System.out.println(listIter.previousIndex() + ": " + listIter.previous());
		}

		System.out.println("\nProcessing the list while iterating forward through a list iterator:");
		listIter = list.listIterator();
		listIter.add("11");
		while (listIter.hasNext()) {
			listIter.add("* * *");
			if (listIter.next().equals("Akin"))
				listIter.set("Selim");
		}
		listIter.add("* * *");
		listIter.add("22");
		list.forEach(System.out::println);
	}

	public static void processUnmodifiableList() {
		System.out.println("*** processUnmodifiableList() ***");
		List<String> list = List.of("Mehmet", "Zeynep", "Tarik", "Ahmet");
		list.forEach(System.out::println);

//		list.set(0, "Yesim"); // UnsupportedOperationException

//		List<String> list2 = List.of("Mehmet", "Zeynep", "Tarik", null); // NullPointerException
	}

	private static void listFromArray() {
		System.out.println("*** listFromArray() ***");
		String[] array = new String[] {"Hit List", "To Do List", "Mailing List", "Price List", "Top Ten List"};

		List list = Arrays.asList(array);
		System.out.println("List");
		list.forEach(System.out::println);

//		list.add("Last List"); // Run time error: java.lang.UnsupportedOperationException

		list.set(0, "Black List");
		System.out.println("\nList");
		list.forEach(System.out::println);

		System.out.println("\nArray");
		for (String s : array)
			System.out.println(s);
	}
}
