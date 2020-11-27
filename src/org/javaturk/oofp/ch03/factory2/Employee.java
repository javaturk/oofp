package org.javaturk.oofp.ch03.factory2;

import java.text.DateFormat;
import java.util.Date;

public class Employee extends Person implements Worker, Schedulable{
	private static final int BASE_SALARY = 500;
	protected int no;
	protected int year;
	protected String department;
	
	public Employee(int no, String name, int year, String department){
		super(name);
		this.no = no;
		this.year = year;
		this.department = department;
	}
	
	public Employee(int no, String name, int year){
		super(name);
		this.no = no;
		this.year = year;
	}
	
	public void printInfo(){
		System.out.println("\nNo: " + no);
		System.out.println("Name:" + name);
		System.out.println("Year: " + year);
		System.out.println("Department: " + department);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", year=" + year + ", department=" + department + "]";
	}

	
	@Override
	public void work() {
		System.out.println("Employee is working!");
		
	}
	
	public double calculateSalary(){
		return year * BASE_SALARY ;
	}

	/**
	 * @author akin
	 * @see org.javaturk.oofp.ch04.factory2.Schedulable#schedule()
	 */
	@Override
	public void schedule(Date from, Date to) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		String fromString = df.format(from);
		String toString = df.format(to);
		System.out.println("I am scheduled between: " + fromString + " and " + toString);
	}

	/**
	 * @author akin
	 * @see org.javaturk.oofp.ch04.factory2.Person#live()
	 */
	@Override
	public void live() {
		System.out.println("I am living an Employee life :)");
	}
}
