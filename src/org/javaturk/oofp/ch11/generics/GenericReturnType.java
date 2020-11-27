package org.javaturk.oofp.ch11.generics;

import org.javaturk.oofp.ch10.domain.Employee;

public class GenericReturnType implements MyInterface{

	public String getObject1() {
		return "Javaaaa!";
	}

	public Employee getObject2() {
		return (Employee) new Employee(2, "Ali", "Nazik", 4);
	}
	/*
	 * public <T> T getObject3(<T extends Employee>){ return (T) new Employee(2,
	 * "Ali"); }
	 */

	public static void main(String[] args) {
		GenericReturnType o = new GenericReturnType();
		
		String s = o.getObject1();
		System.out.println(s);

//		Integer i = o.getObject();
//		System.out.println(i);

//		String s2 = o.getObject2();
//		System.out.println(s2);

		Employee e1 = o.getObject2();
		System.out.println(e1);

	}
}

interface MyInterface<T> {
	
	 T getObject1();

	 T getObject2();
}
