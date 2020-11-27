package org.javaturk.oofp.ch11.generics;

import java.util.*;

public class PrimitiveGenerics {

	public static void main(String[] args) {
//		List<int> ints = new ArrayList<>();
		
		f(new ArrayList<>());
		
		
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(5);
		ints.add(new Integer(7));
		
		for(int i : ints)
			System.out.println(i);
		
		byte b = 9;
//		ints.add(b);
		short s = 11;
//		ints.add(s);
//		ints.add(new Short(s)); // Can't do this!
//		ints.add(new Long(3L));   // Can't do this!
	}
	
	public static void f(ArrayList<Integer> a){
		a.add(4);
		System.out.println(a);
	}
}
