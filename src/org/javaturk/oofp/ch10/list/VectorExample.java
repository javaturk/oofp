package org.javaturk.oofp.ch10.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector vector = new Vector();
		
		System.out.println("Adding to the vector");
		System.out.println(vector.add(1));
		System.out.println(vector.add(10));
		System.out.println(vector.add(100));
		System.out.println(vector.add(1000));

		System.out.println("\nAt the beginning");
		System.out.println("Empty? " + vector.isEmpty());
		System.out.println("Size: " + vector.size());
		
		System.out.println("First element: " + vector.firstElement());
		System.out.println("Last element: " + vector.lastElement());
		
		System.out.println("\nElements");
		Enumeration enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			int i = (int) enumeration.nextElement();
			System.out.println(i);
		}
		
		System.out.println("\nElements");
		Iterator iterator = vector.iterator();
		while(iterator.hasNext()) {
			int i = (int) iterator.next();
			System.out.println(i);
		}
		
		System.out.println("\nElements");
		
		vector.forEach(System.out::println);
	}
}
