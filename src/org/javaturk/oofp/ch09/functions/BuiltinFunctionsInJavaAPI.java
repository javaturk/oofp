package org.javaturk.oofp.ch09.functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class BuiltinFunctionsInJavaAPI {

	public static void main(String[] args) {
//		List<String> names = Arrays.asList("Paul", "Jane", "Michael", "Sam", "Pat"); // Don't use this because removeIf is not supported!
		List<String> names = new ArrayList<>();
		names.add("Paul");
		names.add("Michael");
		names.add("Sam");
		names.add("Ed");
		names.add("Alexander");
		
		// Uses forEach()
		printList(names);
		
		System.out.println("\nAfter sorting alphabetically.");
		Collections.sort(names);
		printList(names);
		
		System.out.println("\nAfter adding new names.");
		names.add("Ann");
		names.add("Peter");
		printList(names);
		
		System.out.println("\nAfter sorting alphabetically using lambda expression.");
		Collections.sort(names, (a, b) -> a.compareTo(b));
		printList(names);
		
		System.out.println("\nAfter sorting by length");
		Comparator<String> lengthComparator = (name1, name2) -> name1.length() - name2.length() ;
		Collections.sort(names, lengthComparator);
		printList(names);
		
		System.out.println("\nAfter removing");
		Predicate<String> pr1 = name -> name.length() > 5;
		names.removeIf(pr1);
		printList(names);
		
		System.out.println("\nAfter replacing");
		UnaryOperator<String> uo = s -> s.toUpperCase();
		names.replaceAll(uo);
		printList(names);
	}
	
	private static void printList(List<String> list) {
		System.out.println("**************************");
		System.out.println("Printing the list");
		list.forEach(i -> System.out.println(i));
//		for(String s : list)
//			System.out.println(s);
		System.out.println("**************************");
	}
}
