package org.javaturk.oofp.ch10.map;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

import org.javaturk.oofp.ch10.util.CollectionUtil;

public class HashtableExample {

	public static void main(String[] args) {
		Hashtable table = new Hashtable<>();
		table.put("one", 1);
		table.put("five", 5);
		table.put("eleven", 11);
		table.put("nineteen", 19);
		
		
		System.out.println("*** Entry set *** ");
		Set entrySet = table.entrySet();
		entrySet.forEach(System.out::println);

		System.out.println("\n*** Keys ***");
		Set keySet = table.keySet();
		keySet.forEach(System.out::println);

		System.out.println("\n*** Values ***");
		Collection coll = table.values();
		coll.forEach(System.out::println);
		
		System.out.println("\n*** Values ***");
		Enumeration values = table.elements();
		while(values.hasMoreElements()) {
			int i = (int) values.nextElement();
			System.out.println(i);
		}

		table.put("twenty", 20);
		table.put("five", 50);
		
		table.replace("one", 10);
		
		table.putIfAbsent("thirty", 30);
		table.putIfAbsent("thirty", 300);
		
		System.out.println("\nContains key one? " + table.containsKey("one"));
		System.out.println("Contains value one? " + table.containsValue("one"));

		System.out.println("\nKeys and Values");
		Set keys = table.keySet();
		for (Object key : keys) {
			Object value = table.get(key);
			System.out.println(key + " - " + value);
		}

		System.out.println("\nKeys and Values with BiConsumer");
		BiConsumer biConsumer = (k, v) -> System.out.println(k + " - " + v);
		table.forEach(biConsumer);
	}
}
