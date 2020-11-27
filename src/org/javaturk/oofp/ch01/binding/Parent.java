package org.javaturk.oofp.ch01.binding;

public class Parent {
	public static int i = 5;
	public int j = 9;
	
	private void doThis() {
		System.out.println("The object of Parent is doing this!");
	}
	
	public final void doThat(){
		System.out.println("The object of Parent is doing that!");
	}
	
	public static void doIt(){
		System.out.println("Parent class is doing it!");
	}
	
	protected void make(){
		System.out.println("The object of Parent is making something!");
	}

	public static void main(String[] args) {
		Parent psb = new Parent();
		System.out.println(psb.i);
		psb.doThis();
		psb.doThat();
		
//		Parent.doIt();
		psb.doIt();
		
		psb.make();
	}
}
