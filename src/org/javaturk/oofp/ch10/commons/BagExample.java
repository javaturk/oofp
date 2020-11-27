package org.javaturk.oofp.ch10.commons;

import java.util.Iterator;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

/**
 * https://commons.apache.org/proper/commons-collections/javadocs/api-4.4/org/apache/commons/collections4/Bag.html
 * https://commons.apache.org/proper/commons-collections/javadocs/api-4.4/org/apache/commons/collections4/bag/HashBag.html
 * @author akin
 *
 */
public class BagExample {
	public static void main(String[] args) {

		Bag bag = new HashBag();
		bag.add("TEST1", 100);
		bag.add("TEST2", 500);
		
		System.out.println("At the  beginning");
		int test1Count1 = bag.getCount("TEST1");
		int test2Count1 = bag.getCount("TEST2");
		System.out.println("Counts: TEST1: " + test1Count1 + ", TEST2: " + test2Count1);
		bag.remove("TEST1", 91);
		bag.remove("TEST2", 490);
		
		System.out.println("\nAfter removal");
		int test1Count2 = bag.getCount("TEST1");
		int test2Count2 = bag.getCount("TEST2");
		System.out.println("Counts: TEST1: " + test1Count2 + ", TEST2: " + test2Count2);
		
		System.out.println("\nAll objects in bag");
		Iterator i = bag.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}
