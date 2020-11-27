package org.javaturk.oofp.ch11.generics;

import java.util.*;

import org.javaturk.oofp.ch10.domain.Employee;
import org.javaturk.oofp.ch10.domain.Manager;

public class GenericInvarianceAndParameters {

	public static void main(String[] args) {
		
//		List<String> strings = new ArrayList<>();
//		List<Object> objects = strings; // Can we do this?	
		
//		List<String> strings = new ArrayList<>();
//		List<? extends Object> objects = strings; // Can we do this?
		
		
		List<Employee> employees1 = new ArrayList<>();

		employees1.add(new Employee(1, "Yeliz", "Duman", 2));
		employees1.add(new Manager(2, "Selim", "Giral", 8, "Sales"));
		
		makeUpTeam1(employees1);
		
		
		List<Manager> managers1 = new ArrayList<>();

		managers1.add(new Manager(2, "Selim", "Giral", 10, "Sales"));
		managers1.add(new Manager(3, "Nuran", "Temiz", 14, "HR"));
		
//		employees1 = managers1; // Can't do this
//		managers1 = employees1; // Can't do this
		
//		makeUpTeam1(managers1); // can'T do that!
		makeUpTeam2(managers1);
		
//		List<Manager> managers2 = new ArrayList<>();
//		List<? extends Employee> employees2  = managers2;
	}

	public static void makeUpTeam1(List<Employee> employees) {
		System.out.println("\nCreating a new team with " + employees.size() + " employees. Team members:");
		for(Employee e : employees)
			System.out.println(e);
	}
	
	public static void makeUpTeam2(List<Manager> employees) {
		System.out.println("\nCreating a new team with " + employees.size() + " employees. Team members:");
		for(Employee e : employees)
			System.out.println(e);
	}
	
//	public static void makeUpTeam3(List<? extends Employee> employees) {
//		System.out.println("\nCreating a new team with " + employees.size() + " employees. Team members:");
//		for(Employee e : employees)
//			System.out.println(e);
//		
//		Employee e1 = employees.get(0);		
//		if(e1 instanceof Manager){
//			Manager m = (Manager) e1;
//		}
//	}
}
