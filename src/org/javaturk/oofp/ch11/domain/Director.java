package org.javaturk.oofp.ch11.domain;


public class Director extends Manager {
	protected double bonus;
	
	public Director(int no, String firstName, String lastName, int year, String department, double bonus) {
		super(no, firstName, lastName, year, department);
		this.bonus = bonus;
	}
	
	
	public void work(){
		System.out.println("Director is working!");
		manage();
	}
	
	public void manage(){
		System.out.println("Director manages whole company!");
		makeAStrategicPlan();
	}
	
	public void makeAStrategicPlan(){
		System.out.println("Director makes a strategic plan for the company!");
	}


	@Override
	public String toString() {
		return "Director [bonus=" + bonus + ", department=" + department + ", no=" + no + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
