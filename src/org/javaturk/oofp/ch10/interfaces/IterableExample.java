
package org.javaturk.oofp.ch10.interfaces;

import java.util.Collection;
import java.util.Iterator;

import org.javaturk.oofp.ch10.util.CollectionUtil;

public class IterableExample {

	public static void main(String[] args) {
		Collection coll = CollectionUtil.getCollection();
		
		System.out.println("Elements in collection.");
		for (Object o : coll)
			System.out.println(o);

		iterate(coll);
		forEach(coll);
		
		// System.out.println("\nIterating an array.");
		// int[] array = { 4, 1, 5, 2, 8, 9, 6 };
		// for (int i : array) {
		// System.out.println(i);
		// }

		// iterate(array); // Arrays are not iterable objects!

	}

	public static void iterate(Iterable iterable) {
		System.out.println("\n***   iterate()   ***");
		Iterator iterator = iterable.iterator();
		while (iterator.hasNext()) {
			String s = (String) iterator.next();
			System.out.println(s + " has " + s.length() + " characters.");
		}
	}

	public static void forEach(Iterable iterable) {
		System.out.println("\n***   forEach()   ***");
		iterable.forEach(s -> {
			System.out.println(s + " has " + ((String)s).length() + " characters.");
		});
	}
}
