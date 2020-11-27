package org.javaturk.oofp.ch01.factory.problem.problem1;

public class PayrollOffice {

	public void paySalary(Employee employee) {

		double salary = employee.calculateSalary();
		System.out.println("Paying a salary of " + salary + " to " + employee.getName());
	}
	
	public void paySalary(Manager manager) {

		double salary = manager.calculateSalary();
		System.out.println("Paying a salary of " + salary + " to " + manager.getName());
	}
	
	public void paySalary(Director director) {

		double salary = director.calculateSalary();
		System.out.println("Paying a salary of " + salary + " to " + director.getName());
	}
}
