package org.javaturk.oofp.ch09.lambda.math;

public class LambdaMathImplementations {
public static void main(String[] args) {
		
		Math adder = (double arg1, double arg2) -> { return arg1 + arg2;};
		doMath(adder, 3, 5);
		
		Math multiplier = (double arg1, double arg2) -> { return arg1 * arg2;};
		doMath(multiplier, 3, 5);
		
		Math subtracter = (double arg1, double arg2) -> { return arg1 - arg2;};
		doMath(subtracter, 3, 5);
		
		Math divider = (double arg1, double arg2) -> { return arg1 / arg2;};
		doMath(divider, 3, 5);
		
		doMath((double arg1, double arg2) -> { return arg1 + arg2;}, 3, 5);
		
		doMath((double arg1, double arg2) -> { return arg1 * arg2;}, 3, 5);
		
		doMath((double arg1, double arg2) -> { return arg1 - arg2;}, 3, 5);
		
		doMath((double arg1, double arg2) -> { return arg1 / arg2;}, 3, 5);
		
		// variations
		doMath((double arg1, double arg2) -> { return arg1 + arg2;}, 3, 5);
		doMath((arg1, arg2) -> { return arg1 + arg2;}, 3, 5);
		doMath((arg1, arg2) -> arg1 + arg2, 3, 5);
		
//		doMath((arg1, double arg2) -> { return arg1 + arg2;}, 3, 5); // Both types must be omitted.
//		doMath((float arg1, float arg2) -> { return arg1 + arg2;}, 3, 5); // Types of the parameters must be exactly the same
		
		Math mod = (a, b) -> a % b;
		doMath(mod, 100, 3);
		
		Math power = (double a, double b) -> {return java.lang.Math.pow(a, b);};	
		System.out.println(power.calculate(3, 5));
		
		doMath(power, 3, 5);
		
//		(double arg1, double arg2) -> { return arg1 + arg2;};
	}
	
	public static void doMath(Math math, double arg1, double arg2){
		double outcome = math.calculate(arg1, arg2);
		System.out.println(outcome);
	}
}
