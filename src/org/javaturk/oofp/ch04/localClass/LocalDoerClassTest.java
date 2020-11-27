
package org.javaturk.oofp.ch04.localClass;

import org.javaturk.oofp.ch04.anonymous.doer.DoerInterface;

public class LocalDoerClassTest {
	
	private int i = 2;
	private static int k = 5;
	
	public static void main(String[] args) {
		
		class LocalDoerClass implements DoerInterface{
			
//			int i = 5;
//			static final int i = 5;

			@Override
			public void doIt() {
				System.out.println(k);
				System.out.println("I always do it :)");
			}
			
			@Override
			public void doThat() {
				System.out.println(k);
				System.out.println("I always do that :)");
			}
		}
		
		LocalDoerClass object1 = new LocalDoerClass();
		object1.doIt();
		
		LocalDoerClass object2 = new LocalDoerClass();
		object2.doThat();
		
		LocalDoerClassTest test = new LocalDoerClassTest();
		test.aMethod();
	}
	
	public void aMethod(){
		class LocalDoerClass implements DoerInterface{

			@Override
			public void doIt() {
				System.out.println(i);
				System.out.println("I always do it :)");
			}
			
			@Override
			public void doThat() {
				System.out.println(k);
				System.out.println("I always do that :)");
			}
		}
		
		LocalDoerClass object1 = new LocalDoerClass();
		object1.doIt();
		
		LocalDoerClass object2 = new LocalDoerClass();
		object2.doThat();
	}
	
	public void anotherMethod() {
//		LocalDoerClass object1 = new LocalDoerClass();
//		object1.doIt();
	}
}
