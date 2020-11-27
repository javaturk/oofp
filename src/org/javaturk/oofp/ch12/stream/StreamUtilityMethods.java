package org.javaturk.oofp.ch12.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import static org.javaturk.oofp.ch12.util.StreamUtil.print;

public class StreamUtilityMethods {

	public static void main(String[] args) {
//		Stream<String> stream1 = Stream.of("Stream");
//		print(stream1);
//
//		stream1 = Stream.of("Stream", "BaseStream");
//		print(stream1);

		Stream<String> stream1 = Stream.empty();
		print(stream1);

		// This stream is null so it is a problem. Use Stream.ofNullable instead.
//		 stream1 = Stream.of(null);
//		 print(stream1);

		// This stream is not null, it is an empty stream even though it is constructed
		// using null
		stream1 = Stream.ofNullable(null);
		print(stream1);

		Stream<Integer> stream2 = Stream.iterate(10, i -> i + 1).limit(10);
		print(stream2);

		stream2 = Stream.iterate(0, i -> i < 10, i -> i + 1);
		print(stream2);

		System.out.println("\nRange");
		IntStream intStream = IntStream.range(4, 7);
		intStream.forEach(System.out::println);

		System.out.println("\nRange closed");
		intStream = IntStream.rangeClosed(4, 7);
		intStream.forEach(System.out::println);
		
		System.out.println("\nConcat stream");
		Stream<String> sStream1 = Stream.of("1", "2", "3", "4");
		Stream<String> sStream2 = Stream.of("5", "6", "7", "8");
		
		Stream<String> finalStream = Stream.concat(sStream1, sStream2);
//		Stream<String> finalStream = Stream.concat(sStream1.unordered(), sStream2.unordered());
		finalStream.forEach(s -> System.out.printf("%s ", s));
	}
}
