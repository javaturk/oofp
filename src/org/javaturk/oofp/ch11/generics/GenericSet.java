package org.javaturk.oofp.ch11.generics;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.javaturk.oofp.ch10.domain.Employee;
import org.javaturk.oofp.ch10.domain.Manager;
import org.javaturk.oofp.ch10.domain.Student;

public class GenericSet {

	public static void main(String[] args) {
		Set set1 = new HashSet();
		set1.add(new Employee(1, "Tarik", "Ozel", 1));
		set1.add(new Manager(2, "Fatma", "Sat", 11, "Sales"));
		set1.add(new Date());
		set1.add(new Student(5, "Mahmut"));

		Iterator i1 = set1.iterator();

		while (i1.hasNext()) {
			Object o = i1.next();

			if (o instanceof Employee) {
				Employee e = (Employee) o;
				System.out.println("Employee name: " + e.getFirstName() + " " + e.getLastName());
			} else {
				System.out.println("It is not an Employee, it is a : " + o.getClass().getName());
				System.out.println(o + "\n");
			}
		}

		Set<Employee> set2 = new HashSet<>();
		set1.add(new Employee(1, "Tarik", "Ozel", 1));
		set1.add(new Manager(2, "Fatma", "Sat", 11, "Sales"));

		// set2.add("naber");

		Iterator<Employee> i2 = set2.iterator();

		while (i2.hasNext()) {
			Employee e = i2.next();
			System.out.println(e);
			System.out.println(e.getFirstName());
		}

		Set<Employee> set3 = new HashSet<Employee>();
		set3.add(new Employee(3, "Kemal", "Can", 3));
		set3.add(new Manager(4, "Nurcan", "Kurucu", 13, "Purchasing"));

		set2.addAll(set3);

		Set<Manager> set4 = new HashSet<Manager>();
		// set4.add(new Employee(3, "Kemal"));
		set4.add(new Manager(5, "Kamil", "Turuncu", 21, "Production"));
		set4.add(new Manager(6, "Zeynep", "Nazli", 5, "HR"));

		set2.addAll(set4);
	}
}
