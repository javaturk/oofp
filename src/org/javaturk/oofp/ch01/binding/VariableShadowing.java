package org.javaturk.oofp.ch01.binding;

public class VariableShadowing {

	public static void main(String[] args) {
		Parent parent = new Child1();
		
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		
		System.out.println(Parent.i);
		System.out.println(parent.j);
		
		System.out.println();
		
		System.out.println(Child1.i);
		System.out.println(child1.j);
		
		System.out.println();
		
		System.out.println(Child2.i);
		System.out.println(child2.j);
	}
}
