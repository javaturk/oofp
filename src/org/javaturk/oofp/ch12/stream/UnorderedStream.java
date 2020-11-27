package org.javaturk.oofp.ch12.stream;

import java.util.*;
import java.util.stream.Stream;

import org.javaturk.oofp.ch12.domain.CollectionFactory;

public class UnorderedStream {

	public static void main(String[] args) {
		System.out.println("For names set");
		
		Set<String> namesSet = CollectionFactory.getNameSet();

		System.out.println("\nNames in the stream");
		Stream<String> stream = namesSet.stream();
		stream.forEach(s -> System.out.println(s));

		System.out.println("\nSorted names in the stream");
		stream = namesSet.stream().sorted();
		stream.forEach(s -> System.out.println(s));

		System.out.println("\nUnordered names in the stream");
		stream = namesSet.stream().unordered();
		stream.forEach(s -> System.out.println(s));

		System.out.println("\nFor names list");
		
		List<String> namesList = CollectionFactory.getNameList();

		System.out.println("\nNames in the stream");
		stream = namesList.stream();
		stream.forEach(s -> System.out.println(s));
		
		System.out.println("\nSorted names in the stream");
		stream = namesList.stream().sorted();
		stream.forEach(s -> System.out.println(s));
		
		System.out.println("\nUnordered names in the stream");
		stream = namesList.stream().unordered();
		stream.forEach(s -> System.out.println(s));
	}

}
