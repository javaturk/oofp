package org.javaturk.oofp.ch09.functions.composition;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateCompositionExample {

	public static void main(String[] args) {
		Predicate<Integer> isEven = t -> t % 2 == 0;
		System.out.println("is 6 even?: " + isEven.test(6));

		Predicate<Integer> isEvenNot = Predicate.not(isEven);
		System.out.println("is 6 not even?: " + isEvenNot.test(6));

		Predicate<Integer> isPositive = t -> t > 0;
		System.out.println("is 7 positive?: " + isPositive.test(7));

		Predicate<Integer> isBothEvenAndPositive = isEven.and(isPositive);
		System.out.println("is -70 both even and positive?: " + isBothEvenAndPositive.test(-70));

		Predicate<Integer> isEvenOrPositive = isEven.or(isPositive);
		System.out.println("is -70 even or positive?: " + isEvenOrPositive.test(-70));
		
		System.out.println();
		
		BiPredicate<String, Integer> longerThanPredicate = (s, i) -> s.length() > i;
		System.out.println(longerThanPredicate.test("Çekoslovakyalılaştırdıklarımızdan mısınız", 40));
		
		BiPredicate<String, Integer> longerThanPredicateNegated = longerThanPredicate.negate();
		System.out.println(longerThanPredicateNegated.test("Çekoslovakyalılaştırdıklarımızdan mısınız", 40));

		BiPredicate<String, Integer> shorterThanPredicate = (s, i) -> s.length() < i;
		System.out.println(shorterThanPredicate.test("Çekoslovakyalılaştırdıklarımızdan mısınız", 50));
		
		BiPredicate<String, Integer> longerAndShorterThanPredicate = longerThanPredicate.and(shorterThanPredicate);
		System.out.println(longerAndShorterThanPredicate.test("Çekoslovakyalılaştırdıklarımızdan mısınız", 41));

		BiPredicate<String, Integer> longerOrShorterThanPredicate = longerThanPredicate.or(shorterThanPredicate);
		System.out.println(longerOrShorterThanPredicate.test("Çekoslovakyalılaştırdıklarımızdan mısınız", 41));
	}
}
