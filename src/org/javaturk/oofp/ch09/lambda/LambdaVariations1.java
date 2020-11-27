package org.javaturk.oofp.ch09.lambda;

import static java.lang.Math.*;

import java.util.Date;

public class LambdaVariations1 {

	public static void main(String[] args) {
		Interface1 le1 = () -> System.out.println("Selam :)"); 
		le1.f();
		Interface1 le2 = () -> { System.out.println("Selam :)"); };
		Interface1 le3 = () -> { return;};
		Interface1 le4 = () -> { };
		Interface1 le100 = () -> System.out.println(new Date());

		System.out.println();
		
		Interface2 le5 = (int i) -> System.out.println("i: " + i);
		le5.f(22);
		Interface2 le6 = (i) -> System.out.println("i: " + i);
		Interface2 le61 = i -> System.out.println("i: " + i);
		
//		Interface2 le7 = 'c' -> System.out.println("c: " + c);
		Interface2 le101 = i -> System.out.println(Math.sqrt(i));
		le101.f(5);
		
		System.out.println();

		Interface3 le7 = () -> 5;
		Interface3 le8 = () -> 2 * 5;
		Interface3 le80 = () -> {return 2 * 5;};
//		Interface3 le81 = () -> {2 * 5;};	// Can't do this. If there is block then return is must to return a value.
		Interface3 le9 = () -> (int) pow((100 % 3 + 100 % 9), 2) + 5;
		System.out.println("le9: " + le9.f());
		Interface3 le10 = () -> {
			double d = pow((100 % 3 + 100 % 9), 2);
			int k = (int) d;
			k += 5;
			return k;
		};
		
		System.out.println("Value: " + le10.f());
		
		System.out.println();

		 Interface4 le11 = (int i) -> i; 
		 Interface4 le12 = (i) -> i * i;
		 Interface4 le121 = i -> i;
		 Interface4 le13 = (i) -> (int) pow((100 % 3 + 100 % 9), 2) + i;
		 Interface4 le14 = (i) -> {
				double d = pow((100 % 3 + 100 % 9), 2);
				int k = (int) d;
				k += i;
				return k;
			};
			
		Interface4 square = i -> i * i;
		System.out.println("Value: " + square.f(10));
		
		Interface4 remainderOfTwo = i -> i % 2;
		System.out.println("Value: " + remainderOfTwo.f(19));
		
		Interface5 le50 = (d1, d2) -> d1 % d2;
		System.out.println("Value: " + le50.f(1924, 25));
	}
}

@FunctionalInterface
interface Interface1 {
	public void f();
}

@FunctionalInterface
interface Interface2 {
	public void f(int i);
}

interface Interface3 {
	public int f();
}

interface Interface4 {
	public int f(int i);
}

interface Interface5 {
	public double f(double d1, double d2);
}