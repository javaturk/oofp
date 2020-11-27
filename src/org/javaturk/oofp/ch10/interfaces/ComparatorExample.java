
package org.javaturk.oofp.ch10.interfaces;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.javaturk.oofp.ch10.domain.Employee;
import org.javaturk.oofp.ch10.domain.EmployeeComparator;
import org.javaturk.oofp.ch10.util.CollectionUtil;

/**
 * @author akin
 *
 */
public class ComparatorExample {

	public static void main(String[] args) {
		compareExample();
//		collectionExample();
	}

	public static void compareExample() {
		Employee e1 = new Employee(111, "Mihrimah", "Kaldiroglu", 1);
		Employee e2 = new Employee(222, "Ali", "Can", 3);

		Comparator<Employee> ec = new EmployeeComparator();

		System.out.println("Compare e1 to e2: " + ec.compare(e1, e2));
		System.out.println("Compare e2 to e1: " + ec.compare(e2, e1));
		System.out.println("Compare e1 to e1: " + ec.compare(e1, e1));

		System.out.println("\nAfter reversed.");

		Comparator<Employee> ecReversed = ec.reversed();
		System.out.println("Compare e1 to e2: " + ecReversed.compare(e1, e2));
		System.out.println("Compare e2 to e1: " + ecReversed.compare(e2, e1));
		System.out.println("Compare e1 to e1: " + ecReversed.compare(e1, e1));
	}
	
	public static void collectionExample() {
		List<Employee> employees = CollectionUtil.getEmployeeList();
		
		System.out.println("Before sorting alphabetically.");
		printEmployees(employees);
		
		System.out.println("\nAfter sorting alphabetically by a lambda expression.");
		Comparator<Employee> comparator1 = (e1, e2) -> e1.getLastName().compareTo(e2.getLastName());
		Collections.sort(employees, comparator1);
		printEmployees(employees);
		
		System.out.println("\nAfter sorting alphabetically in reverse by a lambda expression.");
		Comparator<Employee> comparator2 = comparator1.reversed();
		Collections.sort(employees, comparator2);
		printEmployees(employees);
		
		System.out.println("\nAfter sorting by year.");
		employees = CollectionUtil.getEmployeeList();
		Comparator<Employee> comparator3 = (e1, e2) -> e1.getYear() - e2.getYear() ;
		Collections.sort(employees, comparator3);
		printEmployees(employees);
	}
	
	private static void printEmployees(List<Employee> employees) {
		System.out.println("\nEmployees");
		employees.forEach(System.out::println);
	}
}
