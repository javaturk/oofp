package org.javaturk.oofp.ch12.terminal.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.*;

public class CollectorExample2 {
	public static void main(String[] args) {
		runSquaredCalculator();
	}

	public static void runSquaredCalculator() {
		System.out.println("\nNSquared calculator");
		IntStream intStream = generateIntStream();
		Supplier<List<Integer>> supplier = () -> new ArrayList<>();
		ObjIntConsumer<List<Integer>> accumulator = (list, i) -> list.add((int) Math.sqrt(i));
		// This is not in effect if it is not parallel.
		BiConsumer<List<Integer>, List<Integer>> combiner = (list1, list2) -> list1.addAll(list2);
		List<Integer> list = intStream.collect(supplier, accumulator, combiner);
		System.out.print("List: [");
		for (int i : list)
			System.out.print(i + ", ");
		System.out.println("]");
	}

	public static IntStream generateIntStream() {
		return IntStream.of(1, 4, 9, 16, 25, 36, 49, 64, 81, 100);
	}

}
