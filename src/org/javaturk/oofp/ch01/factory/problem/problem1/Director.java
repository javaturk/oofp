package org.javaturk.oofp.ch01.factory.problem.problem1;

public class Director {
	protected int no;
	protected String name;
	protected int year;
	protected String department;
	protected String departmentManaged;

	protected double bonus;

	public static final int BASE_SALARY = 500;
	public static final int MANAGEMENT_PAYMENT = 3000;

	public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
//		super(no, name, year, workingDepartment, managingDepartment);
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
		this.departmentManaged = departmentManaged;
		this.bonus = bonus;
	}

	public void work() {
		System.out.println("Director is working!");
		manage();
	}

	public void manage() {
		System.out.println("Director manages whole company!");
		makeAStrategicPlan();
	}

	public void makeAStrategicPlan() {
		System.out.println("Director makes a strategic plan for the company!");
	}

	public double calculateSalary() {
		return year * BASE_SALARY + MANAGEMENT_PAYMENT;
//		return super.calculateSalary() + bonus;
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

	@Override
	public String toString() {
		return "Director [bonus=" + bonus + ", departmentManaged=" + departmentManaged + ", no=" + no + ", name=" + name
				+ ", year=" + year + ", department=" + department + "]";
	}
}
