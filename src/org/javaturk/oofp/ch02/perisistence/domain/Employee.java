package org.javaturk.oofp.ch02.perisistence.domain;

public class Employee extends Entity{
	protected String name;
	protected int year;
	protected String department;
	protected String password;
	
	public static final int BASE_SALARY = 500;
	
	public Employee(long id, String name, int year, String department, String password){
		super(id);
		this.name = name;
		this.year = year;
		this.department = department;
		this.password = password;
	}
	
	public void work(){
		System.out.println("Employee is working.");
	}

	public double calculateSalary(){
		return year * BASE_SALARY ;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", year=" + year + ", department=" + department + ", password=" + password + "]";
	}
}
