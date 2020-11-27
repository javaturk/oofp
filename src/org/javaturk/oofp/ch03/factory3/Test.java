package org.javaturk.oofp.ch03.factory3;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		HR hr = new HR();
		int n = 10;
		Employee[] employees = new Employee[n];
		for(int i = 0; i < n; i++)
			employees[i] = hr.getAnEmployee();
		
		System.out.println("Before sorting");
		for(Employee e : employees)
			System.out.println(e);
		
		System.out.println("\nAfter sorting");
		Arrays.sort(employees);
		for(Employee e : employees)
			System.out.println(e);
	}
}
