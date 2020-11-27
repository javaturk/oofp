/*
  * Queue.java
 */

package org.javaturk.oofp.ch10.list;

import java.util.*;

public class Queue {

	private LinkedList list = new LinkedList();

	public void put(Object v) {
		list.addFirst(v);
	}

	public Object get() {
		return list.removeLast();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		for (int i = 0; i < 10; i++)
			queue.put(Integer.toString(i));
		while (!queue.isEmpty())
			System.out.println(queue.get());
	}
}
