package org.javaturk.oofp.ch12.terminal.reduce;

import static org.javaturk.oofp.ch12.domain.CollectionFactory.*;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * This uses: Optional<T> reduce(BinaryOperator<T> accumulator))
 * 
 * @author akin
 *
 */
public class ReduceExample3 {
	public static void main(String[] args) {
//		runExamples();
//		 runNamesExamples();
	}

	public static void runExamples() {
		Optional<Integer> optionalSum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce((i, j) -> i + j);
		int sum = optionalSum.orElse(-1);
		System.out.println(sum);

		optionalSum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(Integer::sum);
		sum = optionalSum.orElse(-1);
		System.out.println(sum);

		Optional<Integer> optionalProduct = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce((i, j) -> i * j);
		int product = optionalProduct.orElse(0);
		System.out.println(product);

		BinaryOperator<Double> averageOperator = (i, j) -> i + j / 9;
		Optional<Double> optionalAverage = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0)
				.reduce(averageOperator);
		double average = optionalAverage.orElse(-1.0);
		System.out.println(average);
	}

	public static void runNamesExamples() {
		BinaryOperator<String> nameConcat1 = (names, name) -> names.concat(name);
		Optional<String> optionalNames = getNameList().stream().reduce(nameConcat1);
		String names = optionalNames.orElse("-");
		System.out.println("Names: " + names);

		System.out.println();

		BinaryOperator<String> nameConcat2 = (names2, name2) -> names2.concat(name2);
		Optional<String> optionalNames2 = getEmptyNameList().stream().reduce(nameConcat2);
		String names2 = optionalNames2.orElse("-");
		System.out.println("Names: " + names2);
	}
}
