package org.javaturk.oofp.ch01.fruit;

import java.util.Collection;

public class FruitCollectionTest {

	public static void main(String[] args) {
		FruitCollection coll = new FruitCollection();
		coll.add(new Apple());
		coll.add(new Banana());
		coll.add(new Melon());

		Object o = coll.get(0);
		Melon m = (Melon) o;   // Isn’t this risky?
		m.cut();       // Are you sure it is a melon?
		m.eat();
		
		o = coll.get(1);
		Banana b = (Banana) o;   // Isn’t this risky?
		b.peel();       // Are you sure it is a banana?
		m.eat();
	}
}
