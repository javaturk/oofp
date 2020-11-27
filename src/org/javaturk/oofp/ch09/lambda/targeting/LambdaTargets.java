package org.javaturk.oofp.ch09.lambda.targeting;

import java.util.Comparator;

public class LambdaTargets {

	public static void main(String[] args) {

		Comparator<String> c = (String s1, String s2) -> s1.compareToIgnoreCase(s2);
		
		compareStrings(c, "Java", new String("java"));
		
		
		compareStrings((String s1, String s2) -> s1.compareToIgnoreCase(s2), "Java", new String("java"));
		
		Runnable r = toDoLater();
	}
	
	public static void compareStrings(Comparator<String> comparator,  String s1, String s2) {
		System.out.println(comparator.compare(s1, s2));
	}

	public static Runnable toDoLater() {
		
		return () -> {
			System.out.println("later");
		};
	}
}
