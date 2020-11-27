package org.javaturk.oofp.ch09.functions.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class LambdaInLambda {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Işıl");
		names.add("Zeynep");
		names.add("Nil");
		names.add("Mahmut");
		names.add("Gül");
		names.add("Şenay");
		names.add("Itır");
		names.add("Ülkü");
		names.add("Su");
		names.add("Ayşe");
		names.add("İbrahim");

		System.out.println("\nAfter sorting alphabetically by a lambda expression.");
		Comparator<String> comparator1 = (s1, s2) -> s1.compareTo(s2);
		Collections.sort(names, comparator1);
		for (String s : names)
			System.out.println(s);

		System.out.println("\nAfter sorting alphabetically in lower case by a lambda expression.");
		Comparator<String> comparator2 = (s1, s2) -> {
			UnaryOperator<String> converter = s -> s.toLowerCase();
			s1 = converter.apply(s1);
			s2 = converter.apply(s2);
			return s1.compareTo(s2);
		};
		Collections.sort(names, comparator2);
		for (String s : names)
			System.out.println(s);
		
		System.out.println("\nAfter sorting in terms of their lengths by a lambda expression.");
		Comparator<String> comparator3 = (s1, s2) -> {
			Function<String, Integer> lengthMeasurer = s -> s.length();
			int i1 = lengthMeasurer.apply(s1);
			int i2 = lengthMeasurer.apply(s2);
			return i1 - i2;
		};
		Collections.sort(names, comparator3);
		for (String s : names)
			System.out.println(s);
	}
}
