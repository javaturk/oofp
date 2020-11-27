package org.javaturk.oofp.ch10.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.javaturk.oofp.ch10.util.CollectionUtil;

public class MapEntryExample {
	public static void main(String[] args) {
		Map map = CollectionUtil.getMap();

		System.out.println("*** Entry set *** ");
		Set entrySet = map.entrySet();
		entrySet.forEach(System.out::println);

		System.out.println("\n*** Processing map entries ***");
		Iterator it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " - " + value);
		}
		
		System.out.println();
		
		Comparator<Entry<String, Integer>> keyComparator = Map.Entry.comparingByKey();
		Comparator<Entry<String, Integer>> valueComparator = Map.Entry.comparingByValue();
		
		// Map.entry() creates a new Map.Entry object.
		Map.Entry entryForAKeyAndValue1 = Map.entry("x", 100);
		Map.Entry entryForAKeyAndValue2 = Map.entry("x", 100);
		Map.Entry entryForAKeyAndValue3 = Map.entry("y", 1000);
		Map.Entry entryForAKeyAndValue4 = Map.entry("five", 15);
		
		System.out.println("entryForAKeyAndValue1 ve entryForAKeyAndValue2 kıyası: " + keyComparator.compare(entryForAKeyAndValue1, entryForAKeyAndValue1));
		System.out.println("entryForAKeyAndValue1 ve entryForAKeyAndValue3 kıyası: " + keyComparator.compare(entryForAKeyAndValue1, entryForAKeyAndValue3));
		System.out.println("entryForAKeyAndValue3 ve entryForAKeyAndValue4 kıyası: " + keyComparator.compare(entryForAKeyAndValue3, entryForAKeyAndValue4));
		
//		Map.Entry.comparingByKey();
	}
}
