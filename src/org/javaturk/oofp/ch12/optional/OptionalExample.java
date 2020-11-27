package org.javaturk.oofp.ch12.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExample {
	public static void main(String[] args) {
		Optional<String> o = Optional.of("Selam");
		if (o.isPresent())
			System.out.println(o.get());
		else
			System.out.println("Nothing in there!");

		// o = Optional.of(null); // Don't use this, use Optional.ofNullable();
		o = Optional.ofNullable(null);
		if (o.isPresent())
			System.out.println(o.get());
		else
			System.out.println("Nothing in there!");

		Optional<Integer> i = getInteger();
		if (i.isPresent())
			System.out.println(i.get());
		else
			System.out.println("Nothing in there!");

		// ifPresent()
		i = getInteger();
		i.ifPresent((t) -> System.out.println("ifPresent: Value is " + t));

		// ifPresentOrElse()
		i = getInteger();
		i.ifPresentOrElse((t) -> System.out.println("ifPresentOrElse: Value is " + t),
				() -> System.out.println("Nothing present."));

		// or
		i = getInteger();
//		i = i.or(() -> (Optional.of((int) (1_000_000 * Math.random()))));
		i.ifPresent((t) -> System.out.println("or: Value is " + t));

		// orElse
		i = getInteger();
		int value = i.orElse(1000);
		System.out.println("orElse: Value is " + value);

		// orElseThrow
		i = getInteger();
		try {
			int newValue = i.orElseThrow(() -> new NoValueFoundException("orElseThrow: No value present."));
			System.out.println("orElseThrow: Value is " + newValue);
		} catch (NoValueFoundException e) {
			System.out.println("NoValueFoundException: " + e.getMessage());
		}

		// stream
		i = getInteger();
		Stream stream = i.stream();
		stream.forEach((s) -> System.out.println("Stream: Value is " + s));
	}

	public static Optional<Integer> getInteger() {
		Optional o;

		double d = Math.random();
		if (d > 0.6)
			o = Optional.ofNullable((int) (d * 100));
		else
			o = Optional.ofNullable(null);

		return o;
	}
}

class NoValueFoundException extends Exception {
	public NoValueFoundException(String message) {
		super(message);
	}
}
