
package org.javaturk.oofp.ch10.interfaces;

import java.util.Collection;
import java.util.Iterator;

import org.javaturk.oofp.ch10.util.CollectionUtil;

public class IteratorExample {

	public static void main(String[] args) {
//		iteratorExample3();
//		iteratorExample3();
		iteratorExample3();
	}
	
	public static void iteratorExample1() {
		Collection coll = CollectionUtil.getCollection();
		System.out.println("Collection: " + coll);

		coll.add("twenty"); // No problem with that!

		System.out.println("Include \"twenty\": " + coll.contains("twenty"));

		Iterator it = coll.iterator();

//		coll.add("twenty five");
//		coll.remove("twenty five");
		System.out.println("\nIterating");
		
		while (it.hasNext()){
			Object o = it.next();
			String s = (String) o;
			System.out.println("Element: " + s);
			if(s.startsWith("o"))
				it.remove();
		}
		
		System.out.println("\nCollection after iteration: " + coll);
		
		coll.add("twenty six"); 
		
		System.out.println();
		
		System.out.println("Iterating one more time");
		it = coll.iterator();
		while (it.hasNext()){
			Object o = it.next();
			String s = (String) o;
			System.out.println(s);
		}

		 coll.add("twenty five"); // Comment out this line to make it run
		// correctly!
		// coll.remove("twenty");
//		 it.next();
//
		// while (it.hasNext()) {
		// System.out.println(it.next());
		// if(((String)it.next()).startsWith("t"))
		// coll.add("xXXXX");
		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());
		// it.remove();

		// }

		// while (it.hasNext())
		// System.out.println("BURADA: " + it.next());
//		if (it != null)
//			System.out.println("Iterator: " + it);
//		else
//			System.out.println("NULLLLL :(");

		coll.add("x");
		// System.out.println("BURADA: " + it.next());
		coll.add("y");

		System.out.println("\nAfter iteration.");
		System.out.println("Collection: " + coll);

		coll.remove("y");

		System.out.println("\nAfter iteration.");
		System.out.println("Collection: " + coll);
		
		it = coll.iterator();
		while (it.hasNext()){
			Object o = it.next();
			it.remove();
		}
		
		System.out.println("\nAfter removal in iteration.");
		System.out.println("Collection: " + coll);
		
		//Throws java.util.NoSuchElementException
//		it.next();
	}
	
	public static void iteratorExample2() {
		Collection coll = CollectionUtil.getCollection();
		System.out.println("Collection: " + coll);
		
		System.out.println("\nAfter forEachRemaining.");
		Iterator it = coll.iterator();
		it = coll.iterator();
		it.forEachRemaining(System.out::println);
	}
	
	public static void iteratorExample3() {
		Collection coll = CollectionUtil.getCollection();
		System.out.println("Collection: " + coll);
		
		System.out.println("\nIterator in for each:");
		for(Iterator it = coll.iterator(); it.hasNext();) {
			Object o = it.next();
			System.out.println(o);
		}
	}
}
