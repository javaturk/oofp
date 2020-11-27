package org.javaturk.oofp.ch11.generics;

import org.javaturk.oofp.ch10.domain.Employee;
import org.javaturk.oofp.ch10.domain.Manager;

public class WildcardGeneric <T extends Employee> {
	private T[] employees;

	public static void main(String[] args) {
		WildcardGeneric<Employee> wg = new WildcardGeneric<>();
		
		Employee[] eArray = new Employee[3];
		wg.employees = eArray;
		
		Manager[] mArray = new Manager[3];
		wg.employees = mArray;
		
//		int[] intArray = new int[3];
//		wg.employees = intArray;
	}

}
