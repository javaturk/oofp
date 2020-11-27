
package org.javaturk.oofp.ch04.anonymous.doer;

public class WeirdAnonymousDoerClassTest {
	private int i = 8;
	private static int k = 11;

	public static void main(String[] args) {
		WeirdAnonymousDoerClassTest test = new WeirdAnonymousDoerClassTest();
//		test.callAnonymousDoerClass1();
		test.callAnonymousDoerClass2();
		
//		test.aMethod(new DoerClass());
		
//		test.aMethod(new DoerInterface(){
//			
//			@Override
//			public void doIt(){
//				System.out.println("I have to do it :)");
//			}
//			
//			@Override
//			public void doThat(){
//				System.out.println("I have to do that :)");
//			}
//		});
	}
	
	public void callAnonymousDoerClass1(){
		DoerInterface doerObject = new DoerInterface(){
			
			@Override
			public void doIt(){
				System.out.println("I'll always do it :)");
				System.out.println("i: " + i + " k: " + k);
				aMethod(this);
			}
			
			@Override
			public void doThat(){
				System.out.println("\nI'll always do that :)");
				doSomethingElse();
			}
			
			private void doSomethingElse(){
				System.out.println("\nI'll sometimes do that :)");
			}
			
		};
		doerObject.doIt();
//		doerObject.doThat();
//		doerObject.doSomethingElse(); // Can't call that!
	}
	
	public void callAnonymousDoerClass2(){
		int j = 3;
//		j++;  // Not allowed to be used in anonymous class.
		
		(new DoerInterface(){
			private int t = 7;
			private static final int z = 18;
			
//			static { // Can't do it!
//				System.out.println("In instance initializer block.");
//			}
			
			{
				System.out.println("In instance initializer block.");
				t = 9;
				System.out.println(t);
			}
			
			@Override
			public void doIt(){
				System.out.println("I am gonna always do it :)");
				System.out.println("j: " + j);
				System.out.println("z: " + z);
//				j++; // Must be effectively final
				
				new DoerInterface(){
					
					{
						System.out.println("In inner instance initializer block.");
					}
					
					@Override
					public void doIt(){
						System.out.println("Inner doIt()");
					}
					
					@Override
					public void doThat(){
						System.out.println("Inner doThat()");
					}
					
				}.doThat();
			}
			
			@Override
			public void doThat(){
				System.out.println("I am gonna always do that :)");
			}
			
		}).doIt();
	}
	
	public void aMethod(DoerInterface doerInterface){
		System.out.println("\nIn aMethod()");
//		doerInterface.doIt();
		doerInterface.doThat();
	}
}
