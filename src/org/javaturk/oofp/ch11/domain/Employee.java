
package org.javaturk.oofp.ch11.domain;

public class Employee extends Person implements Worker {
	protected int no;
	protected int year;

	public Employee(int no, String firstName, String lastName, int year) {
		super(firstName, lastName);
		this.no = no;
		this.year = year;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [no=" + no + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public int compareTo(Object o) {
		int compare = 0;
		Employee otherEmp = (Employee) o;

		if (no < otherEmp.no)
			compare = -1;
		else if (no > otherEmp.no)
			compare = 1;
		return compare;
	}

	@Override
	public void work() {
		System.out.println("Employee is working!");

	}

	@Override
	public double calculateSalary() {
		return year * BASE_SALARY;
	}

	@Override
	public int hashCode() {
		return no;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (no != other.no)
			return false;
		return true;
	}
	//
	// @Override
	// public int compareTo(Object o) {
	// Employee other = (Employee) o;
	// int result = 0;
	// if (no == other.no)
	// result = 0;
	// else if (no < other.no)
	// result = -1;
	// else
	// result = 1;
	// return result;
	// }
}
