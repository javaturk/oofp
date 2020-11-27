
package org.javaturk.oofp.ch04.anonymous.doer;

public class AnonymousDoerClassTest {

	public static void main(String[] args) {
		AnonymousDoerClassTest test = new AnonymousDoerClassTest();
		// test.callAnonymousDoerClass1();
		// test.callAnonymousDoerClass2();

		test.aMethod(new DoerClass());

		test.aMethod(new DoerInterface() {

			@Override
			public void doIt() {
				System.out.println("I have to do it :)");
			}

			@Override
			public void doThat() {
				System.out.println("I have to do that :)");
			}
		});
	}

	public void callAnonymousDoerClass1() {
		DoerInterface doerObject = new DoerInterface() {

			@Override
			public void doIt() {
				System.out.println("I'll always do it :)");
			}

			@Override
			public void doThat() {
				System.out.println("\nI'll always do that :)");
			}

		};
		doerObject.doIt();
		doerObject.doThat();
	}

	public static void callAnonymousDoerClass2() {
		(new DoerInterface() {
			
			{
				System.out.println("in DoerInterface() initializer.");
			}

			@Override
			public void doIt() {
				System.out.println("I am gonna always do it :)");
			}

			@Override
			public void doThat() {
				System.out.println("I am gonna always do that :)");
			}

		}).doIt();
	}

	public void aMethod(DoerInterface doerInterface) {
		System.out.println("\nIn aMethod()");
		doerInterface.doIt();
		doerInterface.doThat();
	}
}
