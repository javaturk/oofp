/*
 * ComparableExample.java
 */

package org.javaturk.oofp.ch10.set;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.javaturk.oofp.ch10.util.CollectionUtil;

public class NavigableAndSortedSetExample {
	public static void main(String[] args) {

		Set set = new TreeSet();
		System.out.println(set.add("i"));
		System.out.println(set.add("d"));
		System.out.println(set.add("x"));
		System.out.println(set.add("u"));
		System.out.println(set.add("z"));
		System.out.println(set.add("a"));
		System.out.println(set.add("a"));

		CollectionUtil.listElements(set);

//		 SortedSet Interface Functionalities
//		sortedSetProperties((SortedSet) set);

//		 NavigableSet Interface Functionalities
		navigableSetProperties((NavigableSet) set);
	}

	public static void sortedSetProperties(SortedSet sortedSet) {
		System.out.println("\nSortedSet Interface Functionalities");
		System.out.println("First: " + sortedSet.first());
		System.out.println("Last: " + sortedSet.last());
		Comparator comparator = sortedSet.comparator();
		if (comparator != null)
			System.out.println(comparator.getClass().getName());
		else
			System.out.println("Comparator is null");

		SortedSet subSet = sortedSet.subSet("i", "z");
		System.out.println("Sub set:");
		CollectionUtil.listElements(subSet);

		SortedSet headSet = sortedSet.headSet("i");
		System.out.println("Head set:");
		CollectionUtil.listElements(headSet);
		
		SortedSet tailSet = sortedSet.tailSet("i");
		System.out.println("Tail set:");
		CollectionUtil.listElements(tailSet);
	}

	public static void navigableSetProperties(NavigableSet navigableSet) {
		System.out.println("\nNavigableSet Interface Functionalities");
		System.out.printf("First  : %s%n", navigableSet.first());
		System.out.printf("First  : %s%n", navigableSet.last());
		System.out.printf("Head set lower than \"i\" : %s%n", navigableSet.headSet("i"));
		System.out.printf("Head set lower than \"i\" including \"i\" : %s%n", navigableSet.headSet("i", true));
		System.out.printf("Head set lower than \"i\" excluding \"i\" : %s%n", navigableSet.headSet("i", false));
		System.out.printf("Tail set greater than or equal to \"i\" : %s%n", navigableSet.tailSet("i"));
		System.out.printf("Tail set greater than or equal to including \"i\" : %s%n", navigableSet.tailSet("i", true));
		System.out.printf("Tail set greater than or equal to excluding \"i\" : %s%n", navigableSet.tailSet("i", false));
		System.out.printf("Least element higher than \"i\" : %s%n", navigableSet.higher("i"));
		System.out.printf("Greatest element lower than \"i\" : %s%n", navigableSet.lower("i"));
		System.out.printf("Least element grater than or equal to \"h\" : %s%n", navigableSet.ceiling("h"));
		System.out.printf("Greatest element lower than or equal to \"h\" : %s%n", navigableSet.floor("h"));
		System.out.printf("Descending set : %s%n", navigableSet.descendingSet());
	}
}