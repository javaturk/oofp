
package org.javaturk.oofp.ch09.examples;

import java.util.function.*;

/**
 * @author akin
 *
 */
public class BasicLamdaExpressionsExample {

	public static void main(String[] args) {
		
		AnInterface1 anInterface1 = () -> {System.out.println("Selam :)");};
		anInterface1.aMethod();
		
		AnInterface1 anInterface11 = () -> System.out.println("Hello :)");
		anInterface11.aMethod();
		
		AnInterface2 anInterface2 = (x) -> System.out.println("x: " + x);
		anInterface2.aMethod(5);
		
		AnInterface3 anInterface3 = (x, y) -> System.out.println("x: " + x + " and y: " + y);
		anInterface3.aMethod(5, 9);
		
		AnInterface4 anInterface4 = (x, y) -> {System.out.println("Adding " + x + " and " + y); return x + y;};
		System.out.println(anInterface4.aMethod(5, 9));
		
		method1(anInterface4);
		
		SquaredI squaredI = (i) -> Math.sqrt(i);
		System.out.println(squaredI.squared(5));
	}
	
	public static void method1(AnInterface4 anInterface4){
		anInterface4.aMethod(20, 15);
	}
}

interface AnInterface1 {
	public void aMethod();
}

interface AnInterface2 {
	public void aMethod(int x);
}

interface AnInterface3 {
	public void aMethod(int x, int y);
}

interface AnInterface4 {
	public int aMethod(int x, int y);
}

interface AnInterface5<U, T, V> {
	public V aMethod(U u, T t);
}

interface SquaredI{
	public double squared(double arg);
}
