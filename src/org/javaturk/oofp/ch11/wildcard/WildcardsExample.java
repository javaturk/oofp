package org.javaturk.oofp.ch11.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.javaturk.oofp.ch11.domain.*;

public class WildcardsExample {

	public static void main(String[] args) {
		List<?> list = Arrays.asList(new Employee(1, "Mehmet", "Sade", 9), "Java", new Date(), true );
//		You can't add anything to this list!
//		list.add(new Object());
//		list.add(new String());
//		list.add(5);
		
		Object o = list.get(0);
		System.out.println(o);
		String s = (String) list.get(1);
		System.out.println(s);
		o = list.get(2);
		System.out.println(o);
		o = list.get(3);
		System.out.println(o);
		
		System.out.println();
		
		list.forEach((Object obj) -> System.out.println(obj));

	}

	public static void makeUpTeam1(List<? extends Employee> employees) {
		System.out.println("\nCreating a new team with " + employees.size() + " employees. Team members:");
		for (Employee e : employees)
			System.out.println(e);
	}
}
