/*
// * ListPerformance.java
 */

package org.javaturk.oofp.ch10.list;

import java.util.*;

public class ListPerformance {
	private static int n = 1_000_000; // For 1_000_000 in adding to the front, time for ArrayList is 91923.0 ms & time for LinkedList is 191.0 ms.

	public static void main(String[] args) {
//		 simpleArrayInsertion();
//		arrayListInsertion();
		linkedListInsertion();

		// simpleArrayAccess();
		// simpleArrayListAccess();
		// simpleLinkedListAccess();

		// simpleArraySearch(n/2);
//		 arrayListSearch(n/2);
		// linkedListSearch(n/2);
	}

	/**
	 * @author akin
	 * 
	 */
	private static void simpleArrayAccess() {
		Integer[] sArray = populateArray();
		int k;
		double start = System.currentTimeMillis();
		for (Integer i : sArray)
			k = i;
		double end = System.currentTimeMillis();
		System.out.println("Time to access for simple array is " + (end - start));
	}

	private static void simpleArrayListAccess() {
		ArrayList<Integer> aList = populateArrayList();
		int k;
		double start = System.currentTimeMillis();
		for (Integer i : aList)
			k = i;
		double end = System.currentTimeMillis();
		System.out.println("Time to access for ArrayList is " + (end - start));
	}

	private static void simpleLinkedListAccess() {
		LinkedList<Integer> lList = populateLinkedList();
		int k;
		double start = System.currentTimeMillis();
		for (Integer i : lList)
			k = i;
		double end = System.currentTimeMillis();
		System.out.println("Time to ccess for LinkedList is " + (end - start));
	}

	private static void simpleArraySearch(int k) {
		Integer[] sArray = populateArray();

		double start = System.currentTimeMillis();
		for (Integer i : sArray)
			if (i == k)
				break;
		double end = System.currentTimeMillis();
		System.out.println("Time to search for simple array is " + (end - start));
	}

	private static void arrayListSearch(int k) {
		ArrayList<Integer> aList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			aList.add(i);
		}

		double start = System.currentTimeMillis();
		for (Integer i : aList)
			if (i == k)
				break;
		double end = System.currentTimeMillis();
		System.out.println("Time to search for ArrayList is " + (end - start));
	}

	private static void linkedListSearch(int k) {
		LinkedList<Integer> lList = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			lList.add(i);
		}

		double start = System.currentTimeMillis();
		for (Integer i : lList)
			if (i == k)
				break;
		double end = System.currentTimeMillis();
		System.out.println("Time to search for ArrayList is " + (end - start));
	}

	public static void simpleArrayInsertion() {
		Integer[] sArray = new Integer[n];
		double start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sArray[i] = i;
		}
		double end = System.currentTimeMillis();
		System.out.println("Time for simple array is " + (end - start));
	}

	public static ArrayList arrayListInsertion() {
		ArrayList aList = new ArrayList();
		double start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			aList.add(0, i);
//			aList.add(i);
		}
		double end = System.currentTimeMillis();
		System.out.println("Time for ArrayList is " + (end - start));

		// start = System.currentTimeMillis();
		// for(Object o:aList){
		// int i = (Integer)o;
		// }
		// end = System.currentTimeMillis();
		// System.out.println("Iterating using forEach is " + (end - start));
		//
		// start = System.currentTimeMillis();
		// for(int j = 0; j < aList.size(); j++){
		// int element = (Integer) aList.get(j);
		// }
		// end = System.currentTimeMillis();
		// System.out.println("Iterating using classical for is " + (end -
		// start));

		return aList;
	}

	public static List linkedListInsertion() {
		List lList = new LinkedList();
		double start2 = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
//			lList.add(0, i);
			lList.add(i);
		}
		double end2 = System.currentTimeMillis();
		System.out.println("Time for LinkedList is " + (end2 - start2));
		return lList;
	}

	private static Integer[] populateArray() {
		Integer[] array = new Integer[n];
		for (int i = 0; i < n; i++) {
			array[i] = i;
		}
		return array;
	}

	private static ArrayList populateArrayList() {
		ArrayList list = new ArrayList(n);
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		return list;
	}

	private static LinkedList populateLinkedList() {
		LinkedList list = new LinkedList();
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		return list;
	}
}
