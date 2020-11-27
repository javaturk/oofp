package org.javaturk.oofp.ch06.runtime;

import org.javaturk.oofp.ch06.shape1.Circle;
import org.javaturk.oofp.ch06.shape1.NegativeArgumentException;
import org.javaturk.oofp.ch06.shape1.Shape;

public class RuntimeExceptionExample {

	public static void main(String[] args) {
//		produceNullPointerException();
//		produceArrayIndexOutOfBoundsException();
//		produceStringIndexOutOfBoundsException();

//		Shape shape = getMeAShape();
//		System.out.println(shape.calculateArea());
	}

	public static void produceNullPointerException() {
		Shape shape = getMeAShape();
		shape.draw();

//		if(shape !=null)
//			shape.draw();
//		else
//			System.err.println("Shape is null!");
	}

//	public static Shape getMeAShape() throws NullPointerException
	/**
	 * This method may return null.
	 * 
	 * @return new Shape object
	 */
	public static Shape getMeAShape() {
		Shape shape = null;
		int i = (int) (Math.random() * 10);
		if (i > 5) {
			try {
				shape = new Circle(10);
			} catch (NegativeArgumentException e) {
				System.out.println("Your argument: " + e.getArgument());
			}
		}
		return shape;
	}
	
//	public static Shape getMeAShape() {
//		Shape shape = null;
//		int i = (int) (Math.random() * 10);
//		if (i > 5) {
//			try {
//				shape = new Circle(i);
//			} catch (NegativeArgumentException e) {
//				System.out.println("Your argument: " + e.getArgument());
//			}
//		} else
//			try {
//				shape = new Circle(0);
//			} catch (NegativeArgumentException e) {
//
//			}
//		return shape;
//	}

	public static void produceArrayIndexOutOfBoundsException() {
		int[] array = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < array.length; i++) // Use array.length
			System.out.println(array[i]);
		System.out.println(array[7]);
	}

	public static void produceStringIndexOutOfBoundsException() {
		String s = "I Love Java!";
		for (int i = 0; i <= 20; i++) // Use s.length()
			System.out.println(s.charAt(i));
	}
}
