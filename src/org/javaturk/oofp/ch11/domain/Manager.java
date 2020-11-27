package org.javaturk.oofp.ch11.domain;

public class Manager extends Employee {
	String department;

	public Manager(int no, String firstName, String lastName, int year, String department) {
		super(no, firstName, lastName, year);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + ", no=" + no + ", year=" + year + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}