
package org.javaturk.oofp.ch10.map;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedMap;

import org.javaturk.oofp.ch10.util.CollectionUtil;

import java.util.*;

/**
 * @author akin
 *
 */
public class NavigableAndSortedMapExample {
	public static void main(String[] args) {

		Map map = new TreeMap();
		System.out.println(map.put(1, "i"));
		System.out.println(map.put(2, "d"));
		System.out.println(map.put(3, "x"));
		System.out.println(map.put(4, "u"));
		System.out.println(map.put(5, "x"));
		System.out.println(map.put(6, "a"));
		System.out.println(map.put(7, "a"));

		CollectionUtil.listElements(map);

//		 SortedSet Interface Functionalities
//		sortedMapProperties((SortedMap)map);

//		 NavigableMap Interface Functionalities
		navigableMapProperties((NavigableMap) map);
	}

	public static void sortedMapProperties(SortedMap sortedMap) {
		System.out.println("\nSortedSet Interface Functionalities");
		System.out.println("First key: " + sortedMap.firstKey());
		System.out.println("Last key: " + sortedMap.lastKey());
		Comparator comparator = sortedMap.comparator();
		if (comparator != null)
			System.out.println(comparator.getClass().getName());
		else
			System.out.println("Comparator is null");

		SortedMap subMap = sortedMap.subMap(3, 6);
		System.out.println("Sub map:");
		CollectionUtil.listElements(subMap);

		SortedMap headMap = sortedMap.headMap(3);
		System.out.println("Head map:");
		CollectionUtil.listElements(headMap);
		
		SortedMap tailMap = sortedMap.tailMap(3);
		System.out.println("\nTail map:");
		CollectionUtil.listElements(tailMap);
	}

	public static void navigableMapProperties(NavigableMap navigableMap) {
		System.out.println("\nNavigableMap Interface Functionalities");
		System.out.printf("First entry: %s%n", navigableMap.firstEntry());
		System.out.printf("First entry: %s%n", navigableMap.lastEntry());
		System.out.printf("Head map to key 4 : %s%n", navigableMap.headMap(4));
		System.out.printf("Head map to key 4 including 4: %s%n", navigableMap.headMap(4, true));
		System.out.printf("Head map to key 4 excluding 4: %s%n", navigableMap.headMap(4, false));
		System.out.printf("Tail map greater than or equal to key 5: %s%n", navigableMap.tailMap(5));
		System.out.printf("Tail map greater than or equal to key 5 including 5: %s%n", navigableMap.tailMap(5, true));
		System.out.printf("Tail map greater than or equal to key 5 excluding 5: %s%n", navigableMap.tailMap(5, false));
		System.out.printf("Map entry with least key higher than 4: %s%n", navigableMap.higherEntry(4));
		System.out.printf("Map entry with greatest key lower than 4: %s%n", navigableMap.lowerEntry(4));
		System.out.printf("Map entry with least element grater than or equal to \"h\" : %s%n", navigableMap.floorKey(4));
		System.out.printf("Least key grater than or equal to key 4 : %s%n", navigableMap.ceilingKey(4));
		System.out.printf("Descending key set : %s%n", navigableMap.descendingKeySet());
	}

}
