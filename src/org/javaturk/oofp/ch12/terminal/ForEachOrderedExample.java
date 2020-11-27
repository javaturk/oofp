package org.javaturk.oofp.ch12.terminal;

import static org.javaturk.oofp.ch12.util.StreamUtil.print;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.javaturk.oofp.ch12.domain.Book;


public class ForEachOrderedExample {

	public static void main(String... args) {
		Set<Integer> set = new HashSet<>();
//		Set<String> set = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			int k = (int) (Math.random() * 100);
//			String kString = "" + k;
//			set.add(kString);
			set.add(k);
		}

		System.out.println("Original collection: " + set);

		Consumer<Integer> printConsumer = i -> System.out.print(i);
		System.out.println("-- unordered --");
		for (int i = 0; i < 5; i++) {
			Stream<Integer> stream = set.parallelStream();
//			Stream<String> stream = set.parallelStream();
//			stream.forEach(printConsumer);
			Object[] objects = stream.distinct().toArray();
			for (Object object : objects) {
				System.out.print(object);
//				System.out.print(object.toString() + " - " + System.identityHashCode(object) + " | ");
			}
			System.out.println();
		}
		System.out.println("-- ordered --");
		for (int i = 0; i < 5; i++) {
			Stream<Integer> stream = set.parallelStream();
//			Stream<String> stream = set.stream();
//			stream.forEachOrdered(printConsumer);
			Object[] objects = stream.unordered().distinct().toArray();
			for (Object object : objects) {
				System.out.print(object);
//				System.out.print(object.toString() + " - " + System.identityHashCode(object) + " | ");
			}
			System.out.println();
		}
	}
}
