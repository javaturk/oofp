package org.javaturk.oofp.ch12.stream;

import java.util.List;
import java.util.stream.Stream;

import org.javaturk.oofp.ch12.domain.CollectionFactory;

public class StreamExample {
	
	public static void main(String[] args) {
		
		List<String> names = CollectionFactory.getNameList();
		
		System.out.println("\nPrinting names");
		Stream<String> stream = names.stream();
		stream.forEach(s -> System.out.println(s));
		
		System.out.println("\nFiltering and then printing names");
		stream = names.stream();
		stream.filter(s -> (s.length() > 5)).forEach(s -> System.out.println(s));
		
		System.out.println("\nDistincting, filtering and then printing distinct names");
		stream = names.stream();
		stream.distinct().filter(s -> (s.length() > 5)).forEach(s -> System.out.println(s));
		
		System.out.println("\nDistincting, filtering and then filtering again and then printing distinct names");
		stream = names.stream();
		stream.distinct().filter(s -> (s.length() > 5)).filter(s -> s.startsWith("A")).forEach(s -> System.out.println(s));
	}
}
