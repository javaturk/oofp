
package org.javaturk.oofp.ch10.domain;

public class Employee extends Person implements Worker, Comparable{
	protected int no;
	protected int year;
	
	public Employee(int no, String firstName, String lastName) {
		super(firstName, lastName);
		this.no = no;
	}

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

	public int getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return "Employee [no=" + no + ", year=" + year + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public void work() {
		System.out.println("Employee is working!");
		
	}
	
	@Override
	public double calculateSalary(){
		return year * BASE_SALARY ;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode() on Employee with no: " + no);
		return no;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() on Employee with no: " + no);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		 System.out.println("equals() on Employee with no: " + this + " other Employee with no: " + obj);
		if (no != other.no)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		Employee other = (Employee) o;
		int result = 0;
		if (no == other.no)
			result = 0;
		else if (no < other.no)
			result = -1;
		else
			result = 1;
		return result;
	}
	
//	@Override
//	public int compareTo(Object o) {
//		Employee other = (Employee) o;
//		return lastName.compareTo(other.lastName);
//	}
}
