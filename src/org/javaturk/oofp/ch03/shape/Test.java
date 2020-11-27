package org.javaturk.oofp.ch03.shape;

public class Test {

	public static void main(String[] args) {
		Geometry geometry = new Geometry();
//		
//		Shape shape = new Rectangle(3, 4);
//		System.out.println("\nName: " + shape.getName() + " and number of sides: " + shape.getNumberOfSides());
//		geometry.drawShape(shape);
//		
//		shape = new Square(5);
//		System.out.println("\nName: " + shape.getName() + " and number of sides: " + shape.getNumberOfSides());
//		geometry.drawShape(shape);
//		
//		shape = new Circle(5);
//		System.out.println("\nName: " + shape.getName() + " and number of sides: " + shape.getNumberOfSides());
//		geometry.drawShape(shape);
//		
//		shape = new Triangle(3, 4);
//		System.out.println("\nName: " + shape.getName() + " and number of sides: " + shape.getNumberOfSides());
//		geometry.drawShape(shape);
//		
//		geometry.eraseShape(shape);
		
		for(int i = 0; i < 5; i++) {
			Shape shape = ShapeFactory.produceShape();
			System.out.println(shape.getName());
			geometry.drawShape(shape);
			geometry.eraseShape(shape);
		}
	}
}
