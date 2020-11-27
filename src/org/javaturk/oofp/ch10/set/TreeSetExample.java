/*
 * ComparableExample.java
 */

package org.javaturk.oofp.ch10.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.javaturk.oofp.ch10.domain.Employee;
import org.javaturk.oofp.ch10.domain.EmployeeComparator;

public class TreeSetExample {
	public static void main(String[] args) {
		Set set = new TreeSet();
//		Set set = new TreeSet(new EmployeeComparator());

		Employee e1 = new Employee(888, "Akin", "Kaldiroglu", 4);
		System.out.println(set.add(e1));
		Employee e2 = new Employee(222, "Ali", "Can", 7);
		System.out.println(set.add(e2));
		Employee e3 = new Employee(111, "Ayse", "Unlu", 1);
		System.out.println(set.add(e3));
		Employee e4 = new Employee(223, "Sami", "Mutlu", 10);
		System.out.println(set.add(e4));
		Employee e5 = new Employee(222, "Ali", "Can", 7);
		System.out.println(set.add(e5));

		System.out.println();
		
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Employee e = (Employee) i.next();
			System.out.println(e.getNo() + " " + e.getFirstName() + " " + e.getLastName());
		}
	}
}