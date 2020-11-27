package org.javaturk.oofp.ch12.terminal.collect;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.javaturk.oofp.ch12.domain.Book;
import org.javaturk.oofp.ch12.util.StreamUtil;

import static java.util.stream.Collectors.*;
import static org.javaturk.oofp.ch12.util.StreamUtil.*;
import static org.javaturk.oofp.ch12.domain.BookFactory.*;

public class CollectorsExample {

	public static void main(String[] args) {
		System.out.println("\nTo list");
		List<String> list1 = Arrays.asList("aa", "bb", "ccc", "dd", "aa", "ee", "ff", "ccc");
		List<String> result1 = list1.stream().collect(toList());
		print(result1);

		System.out.println("\nTo set");
		List<String> set2 = Arrays.asList("aa", "bb", "ccc", "dd", "aa", "ee", "ff", "ccc");
		Set<String> result2 = set2.stream().collect(toSet());
		print(result2);

		System.out.println("\nCounting");
		Long result3 = set2.stream().collect(counting());
		System.out.println(result3);

		System.out.println("\nSumming doubles given as String objects");
		List<String> list2 = Arrays.asList("92", "117", "15", "67");
		double o = list2.stream().collect(Collectors.summingDouble(n -> Double.parseDouble(n)));
		System.out.println(o);

		System.out.println("\nBooks page statistics");
		List<Book> books = getBookList();
		IntSummaryStatistics pageStats = books.stream().collect(Collectors.summarizingInt(Book::getPages));
		System.out.println(pageStats);

		System.out.println("\nBooks page statistics");
		Stream<String> nameStream = generateNameStream();
		String joinedString = nameStream.collect(Collectors.joining(" | "));
		System.out.println(joinedString);
		
		System.out.println("\nGrouping books");
		books = getBookList();
		Map<Boolean, Integer> bookGroups = books.stream().collect(Collectors.groupingBy(Book::isSciFi,
				                                  Collectors.summingInt(Book::getPages)));
		
		StreamUtil.print(bookGroups);
		
		System.out.println("\nPartioning books");
		books = getBookList();
		Map<Boolean, List<Book>> bookPartitions = books.stream().collect(Collectors.partitioningBy(b -> b.getPages() > 500));
		StreamUtil.print(bookPartitions);
	}
	
	public static Stream generateNameStream() {
		return Stream.of("Alican", "Veli", "Nil", "Selim", "Nuri", "Zeynep");
	}
}
