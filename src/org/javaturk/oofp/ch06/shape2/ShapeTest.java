package org.javaturk.oofp.ch06.shape2;

public class ShapeTest {

	public static void main(String[] args) {
		ShapeTest test = new ShapeTest();
		for (int i = 0; i < 5; i++) {
			Shape shape = ShapeFactory.produceShape();
			test.display(shape);
		}
	}

	public void display(Shape shape) {
		System.out.println();
		shape.draw();
		System.out.println("Area: " + shape.calculateArea());
		System.out.println("Circumference: " + shape.calculateCircumference());
	}
}
