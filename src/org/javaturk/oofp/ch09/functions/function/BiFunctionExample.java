package org.javaturk.oofp.ch09.functions.function;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionExample {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Double> doubleConstructor = (num1, num2) -> new Double(Integer.toString(num1) + "." + Integer.toString(num2));
		System.out.println("Constructing a double using 3 and 1415: " + doubleConstructor.apply(3, 1415));
		System.out.println("Constructing a double using 0 and 26: " + doubleConstructor.apply(0, 26));

		BiFunction<Integer, Integer, String> concat = (num1, num2) -> Integer.toString(num1) + Integer.toString(num2);
		System.out.println("215 and 89 are concat'd: " + concat.apply(215, 89));
		
		BiFunction<Integer, Integer, Boolean> isGreaterThan = (num1, num2) -> num1 > num2;
		System.out.println(isGreaterThan.apply(37, 19));
		System.out.println(isGreaterThan.apply(19, 37));
		
//		BiPredicate<Integer, Integer> isGreaterThanPredicate = (num1, num2) -> num1 > num2;
//		System.out.println(isGreaterThanPredicate.test(37, 19));
//		System.out.println(isGreaterThanPredicate.test(19, 37));

		BiFunction<Integer, Integer, Boolean> isEqual = (num1, num2) -> num1 == num2;
		System.out.println(isEqual.apply(3, 3));
		System.out.println(isEqual.apply(4, 1));
		       
        BiFunction<Integer, Integer, Integer> power = (num1, num2) -> (int) Math.pow(num1, num2);
        System.out.println("7 ^ 3: " + power.apply(7, 3));
               
        BiFunction<Integer, Integer, Integer> max = (num1, num2) -> {
        		if(num1 > num2)
        			return num1;
        		else
        			return num2;
        			
        };
        
        System.out.println("7 ? 3: " + max.apply(7, 3));
        
		BiFunction<String, String, Boolean> bf1 = (target, search) -> target.length() > search.length();
		String s1 = "I love Java very much";
		String s2 = "Akin Kaldiroglu";
		System.out.println("Is \"" + s1 + "\" longer than \"" + s2 + "\"? " + bf1.apply(s1, s2));
	}
}
