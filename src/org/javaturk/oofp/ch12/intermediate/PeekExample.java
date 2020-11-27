package org.javaturk.oofp.ch12.intermediate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.javaturk.oofp.ch12.util.StreamUtil.*;

public class PeekExample {

	public static void main(String[] args) {
		List<String> list = Stream.of("one", "two", "three", "four")
        .filter(e -> e.length() > 3)
        .peek(e -> System.out.println("Filtered value: " + e))
        .map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped value: " + e))
        .collect(Collectors.toList());
		
		print(list);
	}
}
