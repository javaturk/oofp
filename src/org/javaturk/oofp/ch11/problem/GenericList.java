package org.javaturk.oofp.ch11.problem;

import java.util.*;

import org.javaturk.oofp.ch03.factory2.Person;
import org.javaturk.oofp.ch11.domain.Employee;
import org.javaturk.oofp.ch11.domain.Manager;

public class GenericList {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>(); // For Java 7 and later
//		 List<Employee> employees = new ArrayList<Employee>(); // For Java 5 &

		employees.add(new Employee(1, "Mehmet", "Ozturk", 6));
		employees.add(new Manager(2, "Fatma", "Narin", 5, "Sales"));

//		 employees.add(5); // Compiler error!
//		 employees.add("Selam"); // Compiler error!
//		 employees.add(true); // Compiler error!
//		 employees.add(new Person());
		
		System.out.println("Employees: \n" + employees);
		
		System.out.println("\nEmployees:");

		for (Employee e : employees)
			System.out.println(e);

		// for (Object e : employees)
		// System.out.println(((Employee) e).getName());
		
		System.out.println();
		
		Iterator<Employee> it = employees.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println(e.getLastName());
		}

		Object o = employees.get(0);
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			System.out.println(e.getFirstName());
		}

		Employee e = employees.get(0); // No need to cast anymore!
		System.out.println(e.getFirstName());

		e = employees.get(0);
		System.out.println(e.getFirstName());

		Manager m = (Manager) employees.get(1);
		System.out.println(m.getFirstName());
		System.out.println(m.getDepartment());
		
		employees.set(0, new Employee(10, "Salih", "Ozkan", 16));
		System.out.println(employees);
		
//		var x = new ArrayList<String>();
//		var x = new ArrayList<>();
//		x.add(1);
//		x.add(new Date());
	}
}