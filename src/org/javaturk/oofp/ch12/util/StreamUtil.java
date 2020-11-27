package org.javaturk.oofp.ch12.util;

import java.util.*;
import java.util.stream.Stream;

public class StreamUtil {

	public static <T> void print(Stream<T> stream) {
		System.out.println("Printing the stream");
		stream.forEach(s -> System.out.println(s));
		System.out.println();
	}
	
	public static <T> void print(List<T> list) {
		System.out.println("\nPrinting the list: " + list.size() + " items.");
		for(T t : list)
			System.out.println(t);
		System.out.println();
	}
	
	public static <T> void print(Set<T> set) {
		System.out.println("Printing the set: " + set.size() + " items.");
		for(T t : set)
			System.out.println(t);
		System.out.println();
	}
	
	public static <T, R> void print(Map<T, R> map) {
		System.out.println("Printing the map: " + map.size() + " items.");
		Iterator<T> it = map.keySet().iterator();
		while(it.hasNext()) {
			T t = it.next();
			R r = map.get(t);
			System.out.println(t + " : " + r);
		}
	}
}
