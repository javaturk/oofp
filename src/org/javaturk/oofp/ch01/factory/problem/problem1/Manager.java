package org.javaturk.oofp.ch01.factory.problem.problem1;


public class Manager{
	protected int no;
	protected String name;
	protected int year;
	protected String department;
	protected String departmentManaged;
	
	public static final int BASE_SALARY = 500;
	public static final int MANAGEMENT_PAYMENT = 3000;
	
	public Manager(int no, String name, int year, String workingDepartment, String departmentManaged){
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
		this.departmentManaged = departmentManaged;
	}
	
	public void work(){
		System.out.println("Manager is working!");
		manage();
	}
	
	public void manage(){
		System.out.println("Manager manages department: " + departmentManaged);
	}
	
	public void manageProject(String projectName){
		System.out.println("Manager manages the project: " + projectName);
	}
	
	public double calculateSalary(){
		return year * BASE_SALARY +MANAGEMENT_PAYMENT;
//		return super.calculateSalary() + MANAGEMENT_PAYMENT;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public String toString() {
		return "Manager [departmentManaged=" + departmentManaged + ", no=" + no + ", name=" + name + ", year=" + year
				+ ", department=" + department + "]";
	}
}
