package org.javaturk.oofp.ch06.shape1;

public class ShapeTest {

	public static void main(String[] args) {
		ShapeTest test = new ShapeTest();
		for(int i = 0; i<5; i++) {
			Shape shape = null;
			shape = ShapeFactory.produceShape();
//			try {
//				shape = ShapeFactory.produceShape();
//			} catch (NegativeArgumentException e) {
//				processNegativeArgumentException(e);
//			}
			if(shape != null)
				test.display(shape);
			
//			new Circle(-10);
		}
	}
	
	public void display(Shape shape) {
		System.out.println();
		shape.draw();
		System.out.println("Area: " + shape.calculateArea());
		System.out.println("Circumference: " + shape.calculateCircumference());
	}
	
	private static void processNegativeArgumentException(NegativeArgumentException e){
		System.err.println("\n******************");
		System.err.println(e.getMessage());
		System.err.println(e.getArgument());
		System.err.println("******************\n");
	}
}
