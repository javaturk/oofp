package org.javaturk.oofp.ch01.binding;

public class Child2 extends Parent{
	public static int i = 25;
	public int j = 29;
	
//	@Override
	private void doThis() {
		System.out.println("The object of Child2 is doing this!");
	}
	
//	@Override
	public static void doIt(){
		System.out.println("Child2 class is doing it!");
	}
	
	@Override
	public void make(){
		System.out.println("The object of Child2 is making something!");
	}
}
