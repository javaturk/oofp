package org.javaturk.oofp.ch12.stream;

import java.util.*;
import java.util.stream.Stream;

import org.javaturk.oofp.ch12.domain.CollectionFactory;

public class StreamAndIterator {
	
	public static void main(String[] args) {
		List<String> names = CollectionFactory.getNameList();
		
		System.out.println("Iterating by Iterator");
		Iterator<String> iterator1 = names.iterator();
		while (iterator1.hasNext())
			System.out.println(iterator1.next());

		System.out.println("\nIterating by ListIterator");

		ListIterator<String> listIterator = names.listIterator(names.size());
		while (listIterator.hasPrevious())
			System.out.println(listIterator.previous());

		System.out.println("\nIterating by Stream's forEach method");

		Stream<String> stream = names.stream();
		stream.forEach(s -> System.out.println(s));
		
		System.out.println("\nIterating by Stream's iterator after filtering");
		stream = names.stream();
		Iterator<String> iterator2 = stream.filter(s -> s.length() < 5).iterator();
		while (iterator2.hasNext())
			System.out.println(iterator2.next());
		
		if(iterator1 == iterator2)
			System.out.println("\nThe same");
		else
			System.out.println("\nDifferent");
	}
}
