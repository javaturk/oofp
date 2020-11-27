package org.javaturk.oofp.ch09.functions.composition;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionComposition {

	public static void main(String[] args) {
//		composition1();
		composition2();
	}

	public static void composition1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer:");
		int i = sc.nextInt();
		
		Function<Integer, Integer> twice = k -> k * 2;
		Function<Integer, Integer> square = k -> k * k;

		int outcome = twice.apply(i);
		outcome = square.apply(outcome);
		System.out.println(outcome);

		outcome = square.apply(i);
		outcome = twice.apply(outcome);
		System.out.println(outcome);

		System.out.println();

		Function<Integer, Integer> twiceAndThenSquare = twice.andThen(square);
		outcome = twiceAndThenSquare.apply(i);
		System.out.println(outcome);

		System.out.println();

		Function<Integer, Integer> squareAndThenTwice = square.andThen(twice);
		outcome = squareAndThenTwice.apply(i);
		System.out.println(outcome);

		System.out.println();

		Function<Integer, Integer> twiceComposeSquare = twice.compose(square);
		outcome = twiceComposeSquare.apply(i);
		System.out.println(outcome);

		System.out.println();

		Function<Integer, Integer> squareComposeTwice = square.compose(twice);
		outcome = squareComposeTwice.apply(i);
		System.out.println(outcome);
	}

	public static void composition2() {

		Function<Double, Double> sin_asin = ((Function<Double, Double>) Math::sin).compose(Math::asin);
		System.out.println(sin_asin.apply(0.5)); // prints "0.5"

		System.out.println();

		String s1 = "I love Java very much!   ";
		String s2 = "Yess I do :)";

		// Apply three functions sequentially
		Function<String, String> trim = String::trim;
		s1 = trim.apply(s1);
		System.out.println(s1);

		Function<String, String> concat = s1::concat;
		s1 = concat.apply(s2);
		System.out.println(s1);

		Function<String, String> toUpperCase = String::toUpperCase;
		s1 = toUpperCase.apply(s1);
		System.out.println(s1);

		System.out.println("\nNow using andThen");

		s1 = "I love Java very much!   ";
		System.out.println(s1);
		Function<String, String> trimAndThenConcatAndThenToUpperCase = trim.andThen(concat).andThen(toUpperCase);
		s1 = trimAndThenConcatAndThenToUpperCase.apply(s2);
		System.out.println(s1);

		System.out.println("\nNow using compose");

		s1 = "I love Java very much!   ";
		System.out.println(s1);
		Function<String, String> composeTrimAndConcatAndToUpperCase = trim.compose(concat).compose(toUpperCase);
		s1 = composeTrimAndConcatAndToUpperCase.apply(s2);
		System.out.println(s1);
	}
}
