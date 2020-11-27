package org.javaturk.oofp.ch10.map;

import java.util.*;

import org.javaturk.oofp.ch10.domain.Student;
import org.javaturk.oofp.ch10.util.CollectionUtil;

public class TreeMapExample {
	static Map studentsWithID = new TreeMap();
	static Map studentsWithName = new TreeMap();

	public static void main(String[] args) {
		for (int i = 10; i > 0; i--) {
			Student s = new Student(i, "Ogrenci" + i);
			studentsWithID.put(s.getId(), s);
		}
		
		System.out.println("Student with ID");
		Set ids = studentsWithID.keySet();
		Iterator iterator = ids.iterator();
		while (iterator.hasNext()) {
//			Student s = (Student) iterator.next();
//			int i = (Integer) studentsWithID.get(s);
			int id = (Integer) iterator.next();
			Student s = (Student) studentsWithID.get(id);
			System.out.println(s);
		}

		System.out.println("\nStudent with names");
		for (int i = 10; i > 0; i--) {
			Student s = new Student(i, "Ogrenci" + i);
			studentsWithName.put(s.getIsim(), s);
		}

		Set names = studentsWithName.keySet();
		Iterator iterator2 = names.iterator();
		while (iterator2.hasNext()) {
			String name = (String) iterator2.next();
			Student s = (Student) studentsWithName.get(name);
			System.out.println(s);
		}
		
		System.out.println("\nGiving a comparator");
		Comparator<String> nameLengthComparator = (s1, s2) -> s1.length() - s2.length();
		Map studentsWithNameByLength = new TreeMap(nameLengthComparator);
		for (int i = 10; i > 8; i--) {
			Student s = new Student(i, "Ogrenci" + i);
			studentsWithNameByLength.put(s.getIsim(), s);
		}
		
		studentsWithNameByLength.forEach((k, v) -> System.out.println(k + " -> " + v));
	}
}
