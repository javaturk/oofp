package org.javaturk.oofp.ch11.wildcard;

import java.util.ArrayList;
import java.util.List;

import org.javaturk.oofp.ch11.domain.*;

public class UpperboundedWildcardExample {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Mehmet", "Sade", 5));
		employees.add(new Employee(2, "Necip", "Marasli", 6));
		employees.add(new Employee(3, "Behice", "Narin", 2));
		employees.add(new Manager(10, "Ali", "Nazik", 7, "Sales"));
		employees.add(new Director(2, "Necip", "Marasli", 20, "Production", 8000));

		makeUpTeam2(employees);

		List<Manager> managers = new ArrayList<>();
		managers.add(new Manager(10, "Ali", "Nazik", 7, "Sales"));
		managers.add(new Manager(20, "Mahmut", "Tatli", 12, "HR"));

		makeUpTeam2(managers);

		List<Director> directors = new ArrayList<>();
		directors.add(new Director(1, "Mehmet", "Sade", 15, "Sales", 5000));
		directors.add(new Director(2, "Necip", "Marasli", 20, "Production", 8000));

		makeUpTeam2(directors);

//		List<Employee> emp = managers;
		// emp.add(new Employee(3, "Behice", "Narin", 2));
		// Manager m = managers.get(4);

		List<? extends Employee> emp2 = managers;

//		makeUpGuardianTeam(employees);
		makeUpGuardianTeam(managers);
		makeUpGuardianTeam(directors);

	}

	public static void makeUpTeam1(List<Employee> employees) {
		System.out.println("\nCreating a new team with " + employees.size() + " employees. Team members:");
		for (Employee e : employees)
			e.work();
	}

	public static void makeUpTeam2(List<? extends Employee> employees) {
		System.out.println("\nCreating a new team with " + employees.size() + " employees. Team members:");
		for (Employee e : employees)
			System.out.println(e);
	}

	public static void makeUpGuardianTeam(List<? extends Manager> managers) {
		System.out.println("\nCreating a new team with " + managers.size() + " managers. Team members:");
		for (Manager m : managers)
			System.out.println(m);
	}
}
