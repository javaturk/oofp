package org.javaturk.oofp.ch12.intermediate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SortedExample {

	public static void main(String[] args) {
		String[] s = { "one", "two", "three", "four" };

		System.out.println("-- Sequential --");
		Stream.of(s).sorted().forEach(System.out::println);

//		System.out.println("-- Parallel --");
//		Stream.of(s).parallel().sorted().forEach(System.out::println);

		System.out.println("-- Comparing by last character using Comparator --");
		Stream.of(s).sorted((a, b) -> Character.compare(a.charAt(a.length() - 1), b.charAt(b.length() - 1)))
				.forEach(System.out::println);
		
		System.out.println("-- Sorting integers --");
		Set<Integer> list = new HashSet<>(Arrays.asList(2, 1, 3, 7, 0, 9, 4));
        Object[] objects = list.stream().sorted().toArray();
        System.out.println(Arrays.toString(objects));
	}
}
