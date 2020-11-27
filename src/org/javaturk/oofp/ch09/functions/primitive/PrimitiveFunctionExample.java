package org.javaturk.oofp.ch09.functions.primitive;

import java.util.function.*;

public class PrimitiveFunctionExample {
	
	public static void main(String[] args) {
		examples1();
		examples2();
	}
	
	public static void examples1() {
		IntFunction<Double> intFunction = i -> Math.sqrt(i);
		System.out.println(intFunction.apply(6));
		
		LongFunction<Double> longFunction = l -> 1d/l;
		System.out.println(longFunction.apply(6));
		
		DoubleFunction<String> doubleFunction = d -> String.valueOf(d);
		System.out.println(doubleFunction.apply(3.1415));
	}
	
	public static void examples2() {
		IntToLongFunction intToLongFunction = i -> (long)i;
		System.out.println(intToLongFunction.applyAsLong(Integer.MAX_VALUE) + 1);
		
		IntToDoubleFunction intToDoubleFunction = i -> 1d/i;
		System.out.println(intToDoubleFunction.applyAsDouble(5));
		
		LongToIntFunction longToIntFunction = l -> (int)l;
		System.out.println(longToIntFunction.applyAsInt(3_315_429_438L));
	}
}
