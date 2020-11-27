package org.javaturk.oofp.ch11.school;

import java.util.*;

public class SchoolTest2 {

	public static void main(String[] args) {
		List<Teacher> teachers = new ArrayList<>();
		List<AssistantPrincipal> assitantPrinceipals = new ArrayList<>();
		List<Principal> principals = new ArrayList<>();
		
		Teacher t1 = new Teacher(1, "Ayse", "Physics");
		teachers.add(t1);
		Teacher t2 = new Teacher(2, "Mahmut", "Math");
		teachers.add(t2);
		Teacher t3 = new Teacher(3, "Kemal", "Music");
		teachers.add(t3);
		
		AssistantPrincipal ap1 = new AssistantPrincipal(11, "Zubeyde", "Physics", true);
		AssistantPrincipal ap2 = new AssistantPrincipal(21, "Akın", "Math", true);
		assitantPrinceipals.add(ap1);
		assitantPrinceipals.add(ap2);
		
//		teachers.add(ap1);
		
		Principal p1 = new Principal(111, "Betul", "Art", true, 10_000);
		principals.add(p1);
		
//		teachers.add(p1);
		
		makeTeachersComittee(teachers);
		
//		makeManagementComittee(teachers);
		makeManagementComittee(assitantPrinceipals);
		makeManagementComittee(principals);
		
		makeGuardianComittee(teachers);
		makeGuardianComittee(assitantPrinceipals);
//		makeGuardianComittee(principals);
	}
	
	public static void makeTeachersComittee(List<Teacher> teachers){
		System.out.println("A teachers comittee is formed by " + teachers.size() + " people.");
	}
	
	public static void makeManagementComittee(List<? extends AssistantPrincipal> teachers){
		System.out.println("A teachers comittee is formed by " + teachers.size() + " people.");
	}
	
	public static void makeGuardianComittee(List<? super AssistantPrincipal> teachers){
		System.out.println("A teachers comittee is formed by " + teachers.size() + " people.");
	}

}
