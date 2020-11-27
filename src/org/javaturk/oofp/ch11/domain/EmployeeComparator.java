
package org.javaturk.oofp.ch11.domain;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		Employee e1 = (Employee) arg0;
		Employee e2 = (Employee) arg1;

		if (e1.getNo() < e2.getNo())
			return -1;
		else if (e1.getNo() == e2.getNo())
			return 0;
		else
			return 1;
	}
	
	public static void main(String[] args) {
		EmployeeComparator ec = new EmployeeComparator();
		Employee e1 = new Employee(111, "Mihrimah", "Kaldiroglu", 3);
		Employee e2 = new Employee(222, "Ali", "Can", 5);
		System.out.println("Compare e1 to e2: " + ec.compare(e1, e2));
		System.out.println("Compare e2 to e1: " + ec.compare(e2, e1));
		System.out.println("Compare e1 to e1: " + ec.compare(e1, e1));
	}
}