package org.javaturk.oofp.ch11.generics;

import java.util.*;

import org.javaturk.oofp.ch10.domain.Employee;
import org.javaturk.oofp.ch10.domain.Manager;

public class GenericsAndSubtyping {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();

		// List<Object> objects = strings; // Can we do this? Aliasing
		// List<Object> and List<String>?

		List<Object> objects = null;

		strings.add("Java");
		objects.add(new Date());
		objects.add(Math.PI);

		String s1 = strings.get(0); // That's a string
		String s2 = strings.get(1); // That's not a string it is a date!
		String d1 = strings.get(2); // That's not a string it is a double!

		List<Manager> managers = new ArrayList<>();
		// List<Employee> employees = managers; // Can we do this? Aliasing List<Employee> and List<Manager>?

		managers.add(new Manager(2, "Selim", "Giral", 7, "Sales"));
		// employees.add(new Employee(1, "Yeliz", "Duman"));

		Manager m1 = managers.get(0); // That's a manager
		Manager m2 = managers.get(1); // That's not a manager!

		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(new Integer(5));
		short sh1 = 7;
		// ints.add(new Short(sh1)); // Compiler error!
		// ints.add(new Long(3L)); // Compiler error!

		List<Number> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(new Integer(5));
		short sh2 = 7;
		numbers.add(new Short(sh2));
		numbers.add(new Long(3L));

	}
}
