package org.javaturk.oofp.ch10.domain;

public class Manager extends Employee {
	String department;

	public Manager(int no, String firstName, String lastName, int year, String department) {
		super(no, firstName, lastName, year);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}


}