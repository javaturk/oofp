package org.javaturk.oofp.ch10.interfaces;

import java.util.Collection;

import org.javaturk.oofp.ch10.util.CollectionUtil;

public class CollectionExample {

	public static void main(String[] args) {
		Collection coll = CollectionUtil.getCollection();

		System.out.println("Elements in collection.");
		for (Object o : coll)
			System.out.println(o);
		
		System.out.println("Size of collection: " + coll.size());

		System.out.println("\nElements in collection.");
		coll.forEach(System.out::println);

		boolean b = coll.add("ten");
		System.out.println("\nIs adding successfull? " + b);

		System.out.println("\nElements in collection.");
		coll.forEach(System.out::println);

		Collection coll2 = CollectionUtil.getAnotherCollection();
		b = coll.add(coll2);
		System.out.println("\nIs adding successfull? " + b);

		System.out.println("\nElements in collection.");
		coll.forEach(System.out::println);

		b = coll.remove("one");
		System.out.println("\nIs removing one successfull? " + b);

		System.out.println("\nElements in collection.");
		coll.forEach(System.out::println);

		b = coll.removeIf(e -> e.equals("two"));
		System.out.println("\nIs removing two successfull? " + b);

		System.out.println("\nElements in collection after adding two.");
		coll.forEach(System.out::println);
		
		System.out.println("Does the collection contain one? " + coll.contains("one"));
		System.out.println("Does the collection contain four? " + coll.contains("four"));
		System.out.println("Does the collection contain onether collection? " + coll.containsAll(coll2));

		System.out.println("\nElements in array.");
		Object[] array = coll.toArray();
		for(Object o : array)
			System.out.println(o);
		
		System.out.println("\nElements in collection 2.");
		coll2.forEach(System.out::println);
		
		b = coll.removeAll(coll2);
		System.out.println("\nIs removing all collection successfull? " + b);
		System.out.println("\nElements in collection after removing a collection.");
		coll.forEach(System.out::println);

		coll.clear();

		System.out.println("\nElements in collection after clearing.");
		coll.forEach(System.out::println);
	}
}
