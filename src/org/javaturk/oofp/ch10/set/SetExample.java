
package org.javaturk.oofp.ch10.set;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

import org.javaturk.oofp.ch10.util.CollectionUtil;

public class SetExample {

	public static void main(String[] args) {
//		processSet();
//		processUnmodifiableSet();
//		addSetToSet();
//		addCollectionToSet();
	}

	public static void processSet() {
		Set set = CollectionUtil.getEmptySet();
		System.out.println(set.add(3));
		System.out.println(set.add("Akin"));
		System.out.println(set.add(3));
		System.out.println(set.add("Veli"));
		System.out.println(set.add("Televizyon"));
		System.out.println(set.add(new Date()));

		System.out.println("Contains Akin? " + set.contains("Akin"));

		set.add("Zeynep");

		System.out.println("\nIterating the list through an iterator:");
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println();
		System.out.println("\nIterating forward through forEach:");
		set.forEach(System.out::println);
		
		System.out.println("\nListing the set.");
		Predicate<Object> stringPredicate = s -> s instanceof String;
		set.forEach(System.out::println);
		System.out.println("\nFiltering the set.");
		set.removeIf(stringPredicate);
		set.forEach(System.out::println);
		
		System.out.println("\nAdding null to the set.");
		System.out.println(set.add(null));
		System.out.println(set.add(null));
	}
	
	public static void processUnmodifiableSet() {
		Set<String> set = Set.of("Mehmet", "Zeynep", "Tarik", "Ahmet");
		set.forEach(System.out::println);
		
//		set.remove("Mehmet"); // UnsupportedOperationException
		
//		Set<String> set2 = Set.of("Mehmet", "Zeynep", "Tarik", null); // NullPointerException
	}
	
	public static void addSetToSet() {
		Set set1 = CollectionUtil.getEmptySet(); 
		set1.add(3);
		set1.add("Akin");
		set1.add(3);
		set1.add("Veli");
		set1.add("Televizyon");
		set1.add(new Date());
		
		Set set2 = CollectionUtil.getEmptySet();
		set2.add(5);
		set2.add("Halil");
		set2.add(3);
		set2.add("Veli");
		set2.add("Radyo");
		set2.add(new Date());
		
		System.out.println("\nAdding set2 to the set1");
		System.out.println(set1.addAll(set2));
//		System.out.println(set1.add(set2)); // false if used add()
		
		System.out.println("\nSet");
		set1.forEach(System.out::println);
	}
	
	public static void addCollectionToSet() {
		Set set = new HashSet(); 
		set.add(3);
		set.add("Akin");
		set.add(3);
		set.add("Veli");
		set.add("Televizyon");
		set.add(new Date());
		
		Collection coll = CollectionUtil.getCollectionWithDuplicates();
		System.out.println("\nCollection with duplicated items");
		coll.forEach(System.out::println);
		
		System.out.println("\nAdding collection with duplicated items to the set");
		System.out.println(set.addAll(coll));
//		System.out.println(set.add(coll));
		
		System.out.println("\nSet");
		set.forEach(System.out::println);
	}
}
