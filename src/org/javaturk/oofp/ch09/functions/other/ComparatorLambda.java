package org.javaturk.oofp.ch09.functions.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Paul");
		names.add("Michael");
		names.add("Sam");
		names.add("Ed");
		names.add("Alexander");
		names.add("Eeeee");
		
		System.out.println("Before sorting alphabetically.");
		for(String s : names)
			System.out.println(s);
		
		System.out.println();
		
		System.out.println("\nAfter sorting alphabetically.");
		Collections.sort(names);
		for(String s : names)
			System.out.println(s);
		
		System.out.println("\nAfter sorting alphabetically by a lambda expression.");
		Comparator<String> comparator1 = (s1, s2) -> s1.compareTo(s2);
		Collections.sort(names, comparator1.reversed());
		for(String s : names)
			System.out.println(s);
		
		System.out.println("\nAfter sorting by length.");
		Comparator<String> comparator2 = (name1, name2) -> name1.length() - name2.length() ;
		Collections.sort(names, comparator2);
		for(String s : names)
			System.out.println(s);
		
		System.out.println("\nAfter sorting by number of 'e's.");
		Comparator<String> comparator3 = (name1, name2) -> {
			int count1 = 0;
			for(int i = 0; i< name1.length(); i++) {
				char c = name1.charAt(i);
				if(c == 'e')
					count1++;
			}
			
			int count2 = 0;
			for(int i = 0; i< name2.length(); i++) {
				char c = name2.charAt(i);
				if(c == 'e')
					count2++;
			}
			
			return count2 - count1;
		};
		
		Collections.sort(names, comparator3);
		for(String s : names)
			System.out.println(s);
		
		System.out.println("\nNow sort it in reverse order!");
		names = new ArrayList<>();
		names.add("Paul");
		names.add("Michael");
		names.add("Sam");
		names.add("Ed");
		names.add("Alexander");
		
		Collections.sort(names, comparator1.reversed());
		for(String s : names)
			System.out.println(s);
	}
}
