package org.javaturk.oofp.ch01.factory;


public class Director extends Manager {
	protected double bonus;
	
	public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
		super(no, name, year, workingDepartment, managingDepartment);
		this.bonus = bonus;
	}
	
	@Override
	public void work(){
		System.out.println("Director is working!");
		manage();
	}
	
	@Override
	public void manage(){
		System.out.println("Director manages whole company!");
		makeAStrategicPlan();
	}
	
	public void makeAStrategicPlan(){
		System.out.println("Director makes a strategic plan for the company!");
	}
	
	@Override
	public double calculateSalary(){
		return super.calculateSalary() + bonus;
	}

	@Override
	public String toString() {
		return "Director [bonus=" + bonus + ", departmentManaged=" + departmentManaged + ", no=" + no + ", name="
				+ name + ", year=" + year + ", department=" + department + "]";
	}
}
