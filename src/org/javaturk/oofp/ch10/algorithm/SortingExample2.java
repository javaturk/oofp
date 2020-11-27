/*
 * SortingExample2.java
 */

package org.javaturk.oofp.ch10.algorithm;

import java.util.*;

public class SortingExample2 {
	
    public static void main(String[] args){
        List list = new ArrayList();
        Name2 name1 = new Name2("Ali", "Ulucan");         list.add(name1);
        Name2 name2 = new Name2("Zeynep", "Kemal");       list.add(name2);
        Name2 name3 = new Name2("Salih", "Kemal");        list.add(name3);
        Name2 name4 = new Name2("Kemal", "Terzi");        list.add(name4);
        System.out.println("Unsorted list is " + list);
        Collections.sort(list, new NameComparator());
        System.out.println("\nSorted list is   " + list);
    }
}

class Name2{
    String  firstName, lastName;
    
    public Name2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String toString() {return firstName + " " + lastName;}
}

class NameComparator implements Comparator{
    public int compare(Object a, Object b){
        Name2 name1 = (Name2)a;
        Name2 name2 = (Name2)b;
        int lastCmp = name1.lastName.compareTo(name2.lastName);
        return (lastCmp!=0 ? lastCmp : name1.firstName.compareTo(name2.firstName));
    }
}

