package org.javaturk.oofp.ch03.shape;

public class Triangle extends Shape{
	
	private int base;
	private int height;
	
	public Triangle(int base, int height){
		super("Triangle", 3);
		this.base = base;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing the triangle.");
	}

	@Override
	public void erase() {
		System.out.println("Erasing the triangle.");
	}

	@Override
	public double calculateArea() {
		return (base * height) / 2;
	}

	@Override
	public double calculateCircumference() {
		double otherSide = Math.sqrt(Math.pow(height, 2) - Math.pow(base, 2));
		return base + height + otherSide;
	}
}
