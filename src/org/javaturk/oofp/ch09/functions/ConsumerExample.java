package org.javaturk.oofp.ch09.functions;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// Consumer example
		Consumer<String> lowerCaseConverter = s -> System.out.println(s.toLowerCase());
		lowerCaseConverter.accept("ABCDefghijKlmnopQRSTuvWxyZ");

		// Consumer example
		BiConsumer<String, String> concat = (s1, s2) -> System.out.println(s1 + s2);
		concat.accept("Mehmet", "Ünlü");
	}
}
