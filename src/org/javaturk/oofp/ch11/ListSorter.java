package org.javaturk.oofp.ch11;

import java.util.*;

import org.javaturk.oofp.ch10.domain.*;

public class ListSorter {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(3, "Kemal", "Can", 3));
		employees.add(new Employee(23, "Fatma", "Nar", 5));
		employees.add(new Employee(20, "Fatma", "Abali", 1));
		employees.add(new Employee(2, "Esma", "Guler", 2));

		for (Employee e : employees)
			System.out.println(e);

		employees.sort(null);

		System.out.println();

		for (Employee e : employees)
			System.out.println(e);
	}
}
