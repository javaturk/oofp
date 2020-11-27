package org.javaturk.oofp.ch01.factory.problem.problem2;

public class PayrollOffice {

	public void paySalary(Employee employee) {

		double salary = 0.0;
		
		int type = employee.getType();
		
		if(type == 0){ // Employee
			salary = employee.getYear() * Employee.BASE_SALARY ;
		}
		else if(type == 1){ // Manager
			salary = employee.getYear() * Employee.BASE_SALARY  + Employee.MANAGEMENT_PAYMENT;
		}
		else if(type == 2){ // Director
			salary = employee.getYear() * Employee.BASE_SALARY  + Employee.MANAGEMENT_PAYMENT + employee.getBonus();
		}
		
		System.out.println("Paying a salary of " + salary + " to " + employee.getName());
	}
}
