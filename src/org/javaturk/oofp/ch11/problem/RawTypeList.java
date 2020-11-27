package org.javaturk.oofp.ch11.problem;

import java.util.*;

import org.javaturk.oofp.ch11.domain.Employee;
import org.javaturk.oofp.ch11.domain.Manager;

public class RawTypeList {

	public static void main(String[] args) {

		List employees = new ArrayList();

		employees.add(new Employee(1, "Mehmet", "Ozturk", 2));
		employees.add(new Manager(2, "Fatma", "Narin", 9, "Sales"));

		employees.add(5);
		employees.add("Selam");
		employees.add(true);

//		for (Employee e : employees)
//			System.out.println(e);

		for (Object e : employees) {
//			Employee e1 = (Employee) e;
			if (e instanceof Employee emp)
				System.out.println(emp);
//				System.out.println(((Employee) e).getFirstName());
		}

		Object o = employees.get(0);
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			System.out.println(e.getFirstName());
		}

//		 Employee e1 = employees.get(0); // Can't do this!
//		 System.out.println(e1.getFirstName());

		Employee e2 = (Employee) employees.get(0); // Casts needed!
		System.out.println(e2.getFirstName());

		Manager m = (Manager) employees.get(1); // Casts needed!
		System.out.println(m.getFirstName());
		System.out.println(m.getDepartment());
	}
}