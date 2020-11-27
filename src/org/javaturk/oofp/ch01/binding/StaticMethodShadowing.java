package org.javaturk.oofp.ch01.binding;

public class StaticMethodShadowing {

	public static void main(String[] args) {
		Parent parent = new Child1();
		parent.doIt();  // Parent's doIt is called
		parent.make();
		System.out.println();
		parent = new Child2();
		parent.doIt();
		parent.make();
		
		System.out.println();
		
		Child1 child1 = new Child1();
		child1.doIt();
		Child2 child2 = new Child2();
		child2.doIt();
		
		System.out.println();
		
		System.out.println(Parent.i);
		System.out.println(parent.j);
		
		System.out.println(Child1.i);
		System.out.println(child1.j);
		
		System.out.println(Child2.i);
		System.out.println(child2.j);
	}
}
