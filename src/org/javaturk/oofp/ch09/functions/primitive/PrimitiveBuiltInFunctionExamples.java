package org.javaturk.oofp.ch09.functions.primitive;

import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.IntConsumer;
import java.util.function.ToDoubleFunction;

public class PrimitiveBuiltInFunctionExamples {
	public static void main(String[] args) {

		DoubleFunction<Integer> integerConverter = (num) -> (int) num;
		System.out.println(integerConverter.apply(Math.PI));

		ToDoubleFunction<Integer> doubleMaker = (num) -> (double) num;
		System.out.println(doubleMaker.applyAsDouble(10));
		
		IntConsumer le1 = i -> System.out.println(i);
		le1.accept(2222);
		
		DoublePredicate isPi  = (d) -> d == Math.PI;
        System.out.println(isPi.test(Math.PI));
 	}
}
