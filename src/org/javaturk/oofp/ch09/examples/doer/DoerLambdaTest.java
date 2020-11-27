
package org.javaturk.oofp.ch09.examples.doer;


public class DoerLambdaTest {

	public static void main(String[] args) {

		DoerInterface englishDi = () -> System.out.println("I'll do it right away!");
		englishDi.doIt();
		
		DoerInterface turkishDi = () -> System.out.println("\nHemen yapacagim!");
		turkishDi.doIt();
		
		DoerInterface longerEnglishDi = () -> {
			System.out.println("\nI'll do it right away!");
			System.out.println("Please don't worry, trust me!");
		};
		longerEnglishDi.doIt();
	}
}
