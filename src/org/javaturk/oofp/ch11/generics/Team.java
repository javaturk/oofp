package org.javaturk.oofp.ch11.generics;

import java.util.ArrayList;
import java.util.List;

import org.javaturk.oofp.ch11.domain.*;

public class Team<T extends Manager, E extends Employee> {
	private String name;
	private T teamManager;
	private List<E> members;
	
	public Team(String name, T teamManager) {
		this.name = name;
		this.teamManager = teamManager;
	}
	
	public Team(String name, T teamManager, List<E> members) {
		this.name = name;
		this.teamManager = teamManager;
		this.members = members;
	}
	
	public T getTeamManager(){
		return teamManager;
	}

	public List<E> getMembers(){
		return members;
	}
	
	public void listMembers(){
		for(E e : members)
			System.out.println(e);
	}
	
	public void listAllMembers(){
		System.out.println("Team manager: \n" + teamManager);
		System.out.println("Team members:");
		for(E e : members)
			System.out.println(e);
	}
	
	public boolean isMember(E employee){
		boolean member = false;
		for(E e : members)
			if(e.equals(employee))
				member = true;
		return member;
	}
	
	public int getTeamSize(){
		return members.size() + 1;
	}
	
	public static void main(String[] args) {
		List<Employee> employees1 = new ArrayList<>();
		employees1.add(new Employee(1, "Mehmet", "Sade", 15));
		employees1.add(new Employee(2, "Necip", "Marasli", 16));
		employees1.add(new Employee(3, "Behice", "Narin", 22));
		
		Director director = new Director(1, "Nuri", "Yetis", 25, "Sales", 5000);
		
		Team<Director, Employee> team1 = new Team<>("Dinazorlar", director, employees1);
		System.out.println("Team size: " + team1.getTeamSize());
		team1.listAllMembers();
		
		System.out.println();
		
		List<Employee> employees2 = new ArrayList<>();
		employees2.add(new Employee(1, "Serap", "Acar", 5));
		employees2.add(new Employee(2, "Mustafa", "Ferah", 1));
		employees2.add(new Employee(3, "Aysun", "kara", 2));
		
		Manager manager = new Manager(10, "Ali", "Nazik", 7, "Sales");
		Team<Manager, Employee> team2 = new Team<>("Gencler", manager, employees2);
		System.out.println("Team size: " + team2.getTeamSize());
		team2.listAllMembers();
		System.out.println("Team manager: " + team2.getTeamManager());
	}

}

