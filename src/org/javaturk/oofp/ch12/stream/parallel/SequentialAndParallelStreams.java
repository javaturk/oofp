package org.javaturk.oofp.ch12.stream.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.javaturk.oofp.ch12.domain.CollectionFactory;

public class SequentialAndParallelStreams {

	public static void main(String[] args) {
		List<String> names = CollectionFactory.getNameList();

		Stream<String> sequentialStream1 = names.stream();
		System.out.println("Stream: " + sequentialStream1);
		System.out.println("Is it parallel: " + sequentialStream1.isParallel());

		Stream<String> parallelStream1 = names.parallelStream();
		System.out.println("Parallel stream: " + parallelStream1);
		System.out.println("Is it parallel: " + parallelStream1.isParallel());

		System.out.println();

		Stream<String> sequentialStream2 = names.stream();
		System.out.println("Sequential Stream: " + sequentialStream2);

		Stream<String> parallelStream2 = sequentialStream2.parallel();
		System.out.println("Parallel stream:  " + parallelStream2);

		Stream<String> sequentialStream3 = sequentialStream2.parallel();
		System.out.println("Sequential stream: " + sequentialStream3);

		System.out.println();

		int[] intArray = CollectionFactory.getIntArray();
		IntStream intStream = Arrays.stream(intArray);
		System.out.println("Int sequential stream: " + intStream);
		System.out.println("Is it parallel: " + intStream.isParallel());
		IntStream intParallelStream = intStream.parallel();
		System.out.println("Int parallel stream: " + intParallelStream);
		System.out.println("Is it parallel: " + intStream.isParallel());
	}
}
