package org.javaturk.oofp.ch10.domain;

public class Name implements Comparable {
	private String firstName, lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String toString() {
		return firstName + " " + lastName;
	}

	public int compareTo(Object o) {
		Name n = (Name) o;
		int lastCmp = lastName.compareTo(n.lastName);
		return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
	}
	
//	public int compareTo(Object o) {
//		Name n = (Name) o;
//		String fullName = firstName + lastName;
//		String otherFullName = n.firstName + n.lastName;
////		System.out.println(otherFullName.length() - fullName.length());
//		return (otherFullName.length() - fullName.length());
//	}
}