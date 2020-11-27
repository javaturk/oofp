package org.javaturk.oofp.ch09.lambda;

public class LambdaProperties {

	public static void main(String[] args) {
		LambdaProperties lp = new LambdaProperties();
		lp.start();
		
		PropertyInterface adder2 = (i, j) -> {
			PropertyInterface.sMethod();
//			this.dMethod();
			return i + j;
		};
	}
	
	public void start() {
		PropertyInterface adder1 = (i, j) -> i + j;
		System.out.println(adder1.doIt(3, 4));

		System.out.println(PropertyInterface.aProperty);
		System.out.println(adder1.aProperty);

		adder1.dMethod();

//		adder.sMethod(); // Can't call this on the lambda expression. Static method
		// can only be called on the interface itself.
		PropertyInterface.sMethod();

		aMethod(adder1, 7, 9);

		System.out.println();

		PropertyInterface adder2 = (i, j) -> {
			PropertyInterface.sMethod();
			//adder1 = (ii, jj) -> ii + jj;
			adder1.dMethod();
			return i + j;
		};
		System.out.println(adder2.doIt(13, 24));

		System.out.println();

		SubPropertyInterface multiplier = (i, j) -> i * j;
		System.out.println(multiplier.doIt(3, 4));
		
		PropertyInterface multiplier2 = multiplier;
		System.out.println(multiplier2.doIt(3, 4));

		System.out.println(SubPropertyInterface.aProperty);
		System.out.println(SubPropertyInterface.aSubProperty);
		System.out.println(multiplier.aProperty);
		System.out.println(multiplier.aSubProperty);

		multiplier.dMethod();
		multiplier.subDMethod();

		// adder.sMethod(); // Can't call this on the lambda expression. Static method
		// can only be called on the interface itself.
		// multiplier.subSMethod(); // Can't call this on the lambda expression. Static
		// method can only be called on the interface itself.
		// SubPropertyInterface.sMethod(); // Can't call on the sub interface.
		SubPropertyInterface.subSMethod();

		aMethod(multiplier, 7, 9);

		PropertyInterface lambdaExp = adder2;
		lambdaExp = multiplier;
		
		SubPropertyInterface adder3 = (i, j) -> i + j;
		PropertyInterface lambdaExp2 = adder3;
		System.out.println(lambdaExp2.doIt(5, 7));
	}

	public static void aMethod(PropertyInterface pi, int i, int j) {
		System.out.println("in aMethod(): " + pi.doIt(i, j));
	}
}

@FunctionalInterface
interface PropertyInterface {
	int aProperty = 1;

	int doIt(int i, int j);

	public static void sMethod() {
		System.out.println("in sMethod()");
	}

	public default void dMethod() {
		System.out.println("in dMethod()");
	}
}

@FunctionalInterface
interface SubPropertyInterface extends PropertyInterface {
	int aSubProperty = 10;

	// public int doThat(int i, int j); // Can't do that! It is a functional
	// interface

	public static void subSMethod() {
		System.out.println("in sMethod()");
	}

	public default void subDMethod() {
		System.out.println("in dMethod()");
	}
}
