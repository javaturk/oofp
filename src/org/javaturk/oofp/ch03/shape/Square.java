package org.javaturk.oofp.ch03.shape;

public class Square extends Shape{
	private double side;

	public Square(double side) {
		super("Square", 2);
		this.side = side;
	}
	
	public void draw() {
		System.out.println("Drawing the square.");
	}

	public void erase() {
		System.out.println("Erasing the square.");
	}

	@Override
	public double calculateArea() {
		return side - side;
	}

	@Override
	public double calculateCircumference() {
		return 4 * side;
	}
}
