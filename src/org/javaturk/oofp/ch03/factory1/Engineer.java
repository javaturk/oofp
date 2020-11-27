package org.javaturk.oofp.ch03.factory1;

public class Engineer extends Employee{

	private String project;

	public Engineer(int no, String name, int year, String department, String project) {
		super(no, name, year, department);
		this.project = project;
	}
	
	@Override
	public void work(){
		System.out.println("Engineer is working on a project: " + project);
	}
	
	public void assignTask(String task){
		System.out.println("Engineer " + name + " works on the task: " + task);
	}
}
