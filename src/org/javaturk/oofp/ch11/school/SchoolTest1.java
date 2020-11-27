package org.javaturk.oofp.ch11.school;

import java.util.*;

public class SchoolTest1 {

	public static void main(String[] args) {
//		processTeachers();
		processAssistantPrincipals();
	}
	
	public static void processTeachers() {
		List<Teacher> teachers = new ArrayList<>();

		Teacher t1 = new Teacher(41, "Ayse", "Math");
		teachers.add(t1);
		Teacher t2 = new Teacher(22, "Mahmut", "Turkish");
		teachers.add(t2);
		Teacher t3 = new Teacher(63, "Kemal", "English");
		teachers.add(t3);
		Teacher t4 = new Teacher(92, "Murat", "Biology");
		teachers.add(t4);
		Teacher t5 = new Teacher(9, "Lale", "Chemistry");
		teachers.add(t5);
		Teacher t6 = new Teacher(19, "Deniz", "Art");
		teachers.add(t6);
		Teacher t7 = new Teacher(5, "Remzi", "IT");
		teachers.add(t7);

		System.out.println("Before sorting Teachers: " + teachers);
		Collections.sort(teachers);
		System.out.println("After sorting Teachers: " + teachers);
		Collections.shuffle(teachers);
		System.out.println("After shuffling Teachers: " + teachers);
		Collections.sort(teachers, new TeacherComparator());
		Collections.sort(teachers, new EmployeeComparator());
		
		System.out.println();
		
		System.out.println("Position: " + Collections.binarySearch(teachers, t1, new TeacherComparator()));
		System.out.println("Position: " + Collections.binarySearch(teachers, t1, new EmployeeComparator()));
//		System.out.println("Position: " + Collections.binarySearch(teachers, t1, new AssistantPrincipalComparator()));
		// Can't do this!: binarySearch(List<? extends T> list, T key, Comparator<? super T> c)
//		System.out.println("Position: " + Collections.binarySearch(teachers, t1, new AssistantPrincipalComparator()));
		
		System.out.println("Max of Teachers: " + Collections.max(teachers));
		System.out.println("Min of Teachers: " + Collections.min(teachers));
		
		System.out.println("Max of Teachers: " + Collections.max(teachers, new TeacherComparator()));
		System.out.println("Min of Teachers: " + Collections.min(teachers, new EmployeeComparator()));
		System.out.println("Min of Teachers: " + Collections.min(teachers, getEmployeeComparator()));
		// an't do this because Teacher is not Princpal
//		System.out.println("Max of Teacheers: " + Collections.max(teachers, getPrincipalComparator()));

	}
	
	public static void processAssistantPrincipals() {
		List<AssistantPrincipal> assitantPrincipals = new ArrayList<>();
		AssistantPrincipal ap1 = new AssistantPrincipal(111, "Zubeyde", "Art", true);
		assitantPrincipals.add(ap1);
		AssistantPrincipal ap2 = new AssistantPrincipal(121, "Akın",  "Programming", true);
		assitantPrincipals.add(ap2);
		AssistantPrincipal ap3 = new AssistantPrincipal(639, "Yeliz",  "Physics", true);
		assitantPrincipals.add(ap3);
		AssistantPrincipal ap4 = new AssistantPrincipal(961, "Berrin",  "Biology", true);
		assitantPrincipals.add(ap4);
		AssistantPrincipal ap5 = new AssistantPrincipal(311, "Murat",  "Physics", false);
		assitantPrincipals.add(ap5);
		AssistantPrincipal ap6 = new AssistantPrincipal(396, "Temel",  "Biology", true);
		assitantPrincipals.add(ap6);
		
		System.out.println("Before sorting AssistantPrincipals: " + assitantPrincipals);
//		Collections.sort(assitantPrinceipals);
		Collections.sort(assitantPrincipals, new AssistantPrincipalComparator());
		System.out.println("After sorting AssistantPrincipals: " + assitantPrincipals);
		
		System.out.println();
		
		System.out.println("Max of AssitantPrincipals: " + Collections.max(assitantPrincipals));
		System.out.println("Min of AssitantPrincipals: " + Collections.min(assitantPrincipals));
		
		System.out.println();
		
		System.out.println("Max of AssitantPrincipals: " + Collections.max(assitantPrincipals, new AssistantPrincipalComparator()));
		System.out.println("Max of AssitantPrincipals: " + Collections.max(assitantPrincipals, new TeacherComparator()));
		System.out.println("Max of AssitantPrincipals: " + Collections.max(assitantPrincipals, new EmployeeComparator()));
		System.out.println("Max of AssitantPrincipals: " + Collections.max(assitantPrincipals, getEmployeeComparator()));
		// an't do this because AssitantPrincipal is not Princpal
//		System.out.println("Max of AssitantPrincipals: " + Collections.max(assitantPrincipals, getPrincipalComparator()));
		
	}	
		
	public static Comparator<Employee> getEmployeeComparator(){
		Comparator<Employee> employeeComparator = ( p1,  p2) ->{
			int result = 0;
			boolean b = p1.getNo() < p2.getNo();

			if (b)
				result = -1;
			else if (!b)
				result = 1;

			return result;
		};
	
		return employeeComparator;
	}
	
	public static Comparator<Principal> getPrincipalComparator(){
		Comparator<Principal> principalComparator = (Principal p1, Principal p2) ->{
			int result = 0;
			boolean b = p1.getBudget() < p2.getBudget();

			if (b)
				result = -1;
			else if (!b)
				result = 1;

			return result;
		};
	
		return principalComparator;
	}
}


// Can't do this!: sort(List<T> list, Comparator<? super T> c), T is Teacher and AssistantPrincipal is not ok for ? super T
//Collections.sort(teachers, new AssistantPrincipalComparator());
// That's ok: sort(List<T> list, Comparator<? super T> c), T is Teacher and Employee is ok for ? super T
//Collections.sort(teachers, new EmployeeComparator());
//System.out.println("After sorting Teachers: " + teachers);
//// Following works if class Teacher extends Employee implements Comparable<Teacher> 
//// Change it to class Teacher extends Employee implements Comparable<AssistantPrincipal> and see what happens!
//Collections.sort(teachers);
