package org.javaturk.oofp.ch12.optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class IntLongDoubleOptionalExample {

	public static void main(String[] args) {
		OptionalInt intOptional = getInteger();
		if (intOptional.isPresent()) {
			int intValue = intOptional.getAsInt();
			if (intValue != -1)
				System.out.println("OptionalInt: Value is " + intValue);
			else
				System.out.println("OptionalInt: Value isn't present.");
		}
		
		OptionalLong longOptional = getLong();
		if (longOptional.isPresent()) {
			long longValue = longOptional.orElse(-1L);
			if (longValue != -1)
				System.out.println("OptionalLong: Value is " + longValue);
			else
				System.out.println("OptionalLong: Value isn't present.");
		}
		

		OptionalDouble doubleOptional = getDouble();
		if (doubleOptional.isPresent()) {
			double doubleValue = doubleOptional.orElseGet(() -> -1.0);
			if (doubleValue != -1.0)
				System.out.println("OptionalDouble: Value is " + doubleValue);
			else
				System.out.println("OptionalDouble: Value isn't present.");
		}
	}

	public static OptionalInt getInteger() {
		OptionalInt o;

		double d = Math.random();
		if (d > 0.6)
			o = OptionalInt.of((int) (d * 100));
		else
			o = OptionalInt.of(-1);

		return o;
	}

	public static OptionalLong getLong() {
		OptionalLong o;

		double d = Math.random();
		if (d > 0.6)
			o = OptionalLong.of((long) (d * 100));
		else
			o = OptionalLong.of(-1);

		return o;
	}

	public static OptionalDouble getDouble() {
		OptionalDouble o;

		double d = Math.random();
		if (d > 0.6)
			o = OptionalDouble.of((int) (d * 100));
		else
			o = OptionalDouble.of(-1.0);

		return o;
	}
}
