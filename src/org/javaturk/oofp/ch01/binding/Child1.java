package org.javaturk.oofp.ch01.binding;

public class Child1 extends Parent{
	public static int i = 15;
	public int j = 19;
	
//	@Override
	public void doThis() {
		System.out.println("The object of Child1 is doing this!");
	}
	
//	@Override
	public static void doIt(){
		System.out.println("Child1 class is doing it!");
	}
	
	@Override
	public void make(){
		System.out.println("The object of Child1 is making something!");
	}

	public static void main(String[] args) {
		Parent parent = new Child1();
//		parent.doThat();  					// Parent's doThat() is called!
		parent.make();						// ChildStaticBinding's make() is called! Dynamic binding!
		
		Child1.doIt();
		Parent.doIt();
		parent.doIt();
		doIt();
	}
}
