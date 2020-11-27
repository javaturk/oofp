package org.javaturk.oofp.ch11.wildcard;

import java.util.*;
import java.util.function.UnaryOperator;

import org.javaturk.oofp.ch11.domain.Employee;

public class UnboundedWildcardExample {

	public static void main(String[] args) {
		List<?> list = Arrays.asList(new Employee(1, "Mehmet", "Sade", 9), "Java", new Date(), true);
		// You can't add anything to this list!
//		 list.add(new Object());
//		 list.add(new String());
//		 list.add(5);

		Object o = list.get(0);
		System.out.println(o);
		
		String s = (String) list.get(1);
		System.out.println(s);
		
		o = list.get(2);
		System.out.println(o);
		
		o = list.get(3);
		System.out.println(o);

		System.out.println();

		list.forEach((Object obj) -> System.out.println(obj));
		
		System.out.println();
		
		Iterator<?> i = list.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println();
		
		System.out.println("Contains \"Java\"? " + list.contains("Java"));
//		list.clear();
		System.out.println("Size of list: " + list.size());
		
		System.out.println("Is list empty? : " + list.isEmpty());
		
//		list.set(1, "I love Java"); // Can't call this!
		
//		UnaryOperator<Integer> operator = j -> j * j;
//		UnaryOperator<?> operator = (Integer j) -> j * j;
//		list.replaceAll(operator);
		
		System.out.println();
		unboundedWildcardOnList(list);
		System.out.println();
		unboundedWildcardOnCollections(list);
	}
	
	public static void unboundedWildcardOnList(List<?> list){
		System.out.println("in unboundedWildcardOnList()");
		Collection<?> coll1 = Arrays.asList("Java");
		System.out.println("Contains: " + list.containsAll(coll1));
		
//		list.removeAll(coll1);	// May get UnsupportedOperationException!
		System.out.println("Collection: " + coll1); 
	}
	
	public static void unboundedWildcardOnCollections(List<?> list){
		System.out.println("in unboundedWildcardOnCollections()");
		List<?> coll1 = Arrays.asList("Java", "C", "C++", "C#", "Python");
		List<?> coll2 = Arrays.asList("A", "B", "C", "D");
		
		System.out.println("Disjoint? " + Collections.disjoint(coll1, coll2));
		
		Collections.reverse(coll1);
		System.out.println("Reversed list: " + coll1);
	}
}
