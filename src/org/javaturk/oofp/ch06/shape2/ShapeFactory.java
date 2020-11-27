package org.javaturk.oofp.ch06.shape2;

import java.util.Random;

public class ShapeFactory {

	private static Random random = new Random();

	public static Shape produceShape() {
		Shape shape = null;
		
		int i = Math.abs(random.nextInt() % 100);
		if(i < 50)
			shape = new Circle(i);
		else
			shape = new Rectangle(i, 2 * i);

		return shape;
	}
}
