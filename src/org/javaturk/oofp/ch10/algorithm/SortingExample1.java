/*
 * ComparableExample2.java
 */

package org.javaturk.oofp.ch10.algorithm;

import java.util.*;

import org.javaturk.oofp.ch10.domain.Name;

public class SortingExample1 {
	public static void main(String[] args) {
		List<Name> list = new ArrayList<Name>();
		
		Name name1 = new Name("Ali", "Ulucan");
		list.add(name1);
		Name name2 = new Name("Zeynep", "Kemal");
		list.add(name2);
		Name name3 = new Name("Husamettin", "Kemal");
		list.add(name3);
		Name name4 = new Name("Ali Kemal", "Terzioglu");
		list.add(name4);
		Name name5 = new Name("Murat", "Selimoglu");
		list.add(name5);
		
		System.out.println("Unsorted list is " + list);
		Collections.sort(list);
		System.out.println("\nSorted list is   " + list);
	}
}
