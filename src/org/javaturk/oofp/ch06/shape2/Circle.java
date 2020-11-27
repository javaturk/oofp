package org.javaturk.oofp.ch06.shape2;

public class Circle implements Shape{
	double radius;

	public Circle(double radius) {
		if(radius < 0)
			throw new IllegalArgumentException("Can not pass negative radius: " + radius);
//		throw new NegativeArgumentException("Can not pass negative radius: ", radius);
		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}

	public void draw() {
		System.out.println("Drawing the circle.");
	}

	public void erase() {
		System.out.println("Erasing the circle.");
	}
}
