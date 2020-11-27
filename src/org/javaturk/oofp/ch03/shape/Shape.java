package org.javaturk.oofp.ch03.shape;

public abstract class Shape implements Drawable, Erasable{
	private String name;
	private int numberOfSides;
	
	public Shape(String name, int numberOfSides){
		super();
		this.name = name;
		this.numberOfSides = numberOfSides;
	}
	
	public abstract double calculateArea();

	public abstract double calculateCircumference();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}
}
