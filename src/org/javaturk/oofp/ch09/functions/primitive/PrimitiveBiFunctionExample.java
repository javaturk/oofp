package org.javaturk.oofp.ch09.functions.primitive;

import java.util.function.*;

public class PrimitiveBiFunctionExample {
	public static void main(String[] args) {
		examples();
	}
	
	public static void examples() {
		ToIntBiFunction<String, String> toIntBiFunction = (s1, s2) -> s1.length() + s2.length();
		System.out.println(toIntBiFunction.applyAsInt("Selam", "Ayse"));
		
		ToLongBiFunction<Integer, Integer> toLongBiFunction = (i1, i2) -> i1 * i2;
		System.out.println(toLongBiFunction.applyAsLong(1_621_310, 8_329-771));
		
		ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (i1, i2) -> 1.0d * i1 / i2;
		System.out.println(toDoubleBiFunction.applyAsDouble(2, 3));
	}
}
