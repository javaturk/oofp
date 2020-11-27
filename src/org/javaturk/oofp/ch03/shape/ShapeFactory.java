package org.javaturk.oofp.ch03.shape;

public class ShapeFactory {

	public static Shape produceShape() {
		Shape shape = null;
		int i = (int) ( 3 + Math.random() * 4);
//		System.out.println(i);
		switch (i) {
		case 3:
			shape = new Circle(3*i); break;
		case 4:
			shape = new Rectangle(3*i, 5*i); break;
		case 5:
			shape = new Square(2*i); break;
		case 6:
			shape = new Triangle(2*i, 4*i); break;
		}
		
		return shape;
	}
}
