/*
// * ListPerformance.java
 */

package org.javaturk.oofp.ch10.set;

import java.util.*;

public class SetPerformance {
	private static int n = 10_000_000; 
	private static Random random = new Random();

	public static void main(String[] args) {
		hashSetInsertion();
		treeSetInsertion();
	}

	public static void hashSetInsertion() {
		Set<Integer> set = new HashSet<Integer>(n);
		double start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
//			set.add(i);
			set.add(random.nextInt());
		}
		double end = System.currentTimeMillis();
		System.out.println("Time to insert into HashSet is " + (end - start));
	}
	
	public static void treeSetInsertion() {
		Set<Integer> set = new TreeSet<Integer>();
		double start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
//			set.add(i);
			set.add(random.nextInt());
		}
		double end = System.currentTimeMillis();
		System.out.println("Time to insert into TreeSet " + (end - start));
	}

}
