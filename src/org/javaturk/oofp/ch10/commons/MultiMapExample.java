package org.javaturk.oofp.ch10.commons;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiKeyMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

/**
 * https://commons.apache.org/proper/commons-collections/javadocs/api-4.4/org/apache/commons/collections4/MultiValuedMap.html
 * https://commons.apache.org/proper/commons-collections/javadocs/api-4.4/org/apache/commons/collections4/map/MultiKeyMap.html
 * @author akin
 *
 */
public class MultiMapExample {

	public static void main(String[] args) {
//		multiValuedMap();
		multiKeyedMap();
	}
	
	public static void multiValuedMap() {
		MultiValuedMap map = new HashSetValuedHashMap();
		map.put("ONE", "TEST");
		map.put("ONE", "HELLO");
		map.put("ONE", "CAR");
		map.put("TWO", "PICNIC");
		map.put("TWO", "TELEVISION");
		map.put("TWO", "TESTIMONY");
		Set keySet = map.keySet();

		Iterator keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			Object key = keyIterator.next();
			System.out.print("Key: " + key + ": ");
			Collection values = (Collection) map.get(key);
			Iterator valuesIterator = values.iterator();
			System.out.print("Its values: ");
			while (valuesIterator.hasNext()) {
				System.out.print(valuesIterator.next() + " ");
			}
			System.out.println();
		}
	}
	
	public static void multiKeyedMap() {
		MultiKeyMap<String, Integer> map = new MultiKeyMap<>();
		map.put("ONE", "BIR", "EINS", 1);
		map.put("TWO", "IKI", "ZWEI", 2);
		map.put("THREE", "UC", "DREI", 3);
		map.put("FOUR", "DORT", "VIER", 4);
		Set keySet = map.keySet();

		Iterator keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			Object key = keyIterator.next();
			System.out.print("Key: " + key + ", and value: ");
			Integer value = map.get(key);
			System.out.println(value);
//			Iterator valuesIterator = value.iterator();
//			System.out.print("Its values: ");
//			while (valuesIterator.hasNext()) {
//				System.out.print(valuesIterator.next() + " ");
//			}
			System.out.println();
		}
	}
}
