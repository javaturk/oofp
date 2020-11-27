/*
 * ShuffleExample1.java
 */

package org.javaturk.oofp.ch10.algorithm;

import java.util.*;

public class ShuffleExample1 {
    public static void main(String[] args){
    	
	List list = new ArrayList(20);
        for(int i = 0; i < 20; i++){
            list.add(i);
        }
        
        System.out.println("List before shuffle is " + list);
        System.out.println();
        Collections.shuffle(list);
        System.out.println("Shuffled list is " + list);
        System.out.println();
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);
        System.out.println();
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
        System.out.println();
        Collections.swap(list, 0, 19);
        System.out.println("Swapped list: " + list);
        System.out.println();
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
        System.out.println();
        System.out.println(Collections.binarySearch(list, -9));
        System.out.println();
        Collections.rotate(list, 3);
        System.out.println("Rotated list: " + list);
    }
}
