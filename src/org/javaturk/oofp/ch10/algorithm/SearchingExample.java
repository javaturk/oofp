/*
 * SearchingExample.java
 */

package org.javaturk.oofp.ch10.algorithm;

import java.util.*;

import org.javaturk.oofp.ch10.domain.Name;

public class SearchingExample {
    
    public static void main(String[] args){
        List list = new ArrayList();
        Name name1 = new Name("Ali", "Ulucan");         list.add(name1);
        Name name2 = new Name("Zeynep", "Kemal");       list.add(name2);
        Name name3 = new Name("Salih", "Kemal");        list.add(name3);
        Name name4 = new Name("Kemal", "Terzi");        list.add(name4);
        Name name5 = new Name("Mehmet", "Kuscu");       list.add(name5);
        Name name6 = new Name("aaa", "aaa");       		list.add(name6);
        Name name7 = new Name("Ayse", "Can");           list.add(name7);
        Name name8 = new Name("Ahmet", "Bal");          list.add(name8);
        Name name9 = new Name("A", "A");                list.add(name9);
        
        System.out.println(list);

        Collections.sort(list);
        
        System.out.println(list);
        
        Name searchFor = new Name("Mehmet", "Kuscu"); 
        
        int index = Collections.binarySearch(list, searchFor);
        System.out.println("\nIndex: " + index);
//        System.out.println("Index is " + index + " and name is " + list.get(index));
    }
}
