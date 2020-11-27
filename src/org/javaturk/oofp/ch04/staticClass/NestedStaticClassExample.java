package org.javaturk.oofp.ch04.staticClass;

public class NestedStaticClassExample {

	private int i;
	private static int k = 9;
	
	public NestedStaticClassExample(int i){
		this.i = i;
	}

	private static class StaticClass {
		
		public StaticClass() {
			System.out.println("in StaticClass()");
		}
		
		public void aMethod(int j){
			System.out.println("in aMethod() and j: " + j + " and k: " + k);
			
			NestedStaticClassExample o = new NestedStaticClassExample(21);
			System.out.println(o.i);
		}

	}

	public static void main(String[] args) {
		NestedStaticClassExample.StaticClass o1 = new NestedStaticClassExample.StaticClass();
		o1.aMethod(10);
	}

}
