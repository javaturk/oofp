package org.javaturk.oofp.ch10.commons;

import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.HashedMap;

/**
 * https://commons.apache.org/proper/commons-collections/javadocs/api-4.4/org/apache/commons/collections4/IterableMap.html
 * https://commons.apache.org/proper/commons-collections/javadocs/api-4.4/org/apache/commons/collections4/map/HashedMap.html
 * @author akin
 *
 */
public class MapIteration {

	public static void main(String[] args) {
		IterableMap names = new HashedMap();
		names.put("a", "Ali");
		names.put("b", "Betul");
		names.put("c", "Cihan");
		names.put("d", "Dilan");
		names.put("e", "Emre");
		names.put("f", "Fatih");

		MapIterator iterator = names.mapIterator();
		while (iterator.hasNext()) {
			Object key = iterator.next();
			Object value = iterator.getValue();
			if (value.equals("Emre"))
				iterator.setValue("Emine");
		}
		
		System.out.println("Keys: " + names.keySet());
		System.out.println("Values: " + names.values());
		

	}

}
