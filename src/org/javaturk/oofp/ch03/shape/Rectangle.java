package org.javaturk.oofp.ch03.shape;

public class Rectangle extends Shape {
	double shortSide;
	double longSide;	

	public Rectangle(double shortSide, double longSide) {
		super("Rectangle", 4);
		this.shortSide = shortSide;
		this.longSide = longSide;
	}
	
	public Rectangle(String name, double shortSide, double longSide) {
		super(name, 4);
		this.shortSide = shortSide;
		this.longSide = longSide;
	}

	public double calculateArea() {
		return shortSide * longSide;
	}

	public double calculateCircumference() {
		return shortSide + longSide;
	}

	public void draw() {
		System.out.println("Drawing the rectangle.");
	}

	public void erase() {
		System.out.println("Erasing the rectangle.");
	}
}
