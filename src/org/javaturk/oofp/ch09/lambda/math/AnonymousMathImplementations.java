package org.javaturk.oofp.ch09.lambda.math;

public class AnonymousMathImplementations {

	public static void main(String[] args) {
		
		Math adder = new Math(){
			@Override
			public double calculate(double  arg1, double arg2){
				return arg1 + arg2;
			}
		};
		
		doMath(adder, 3, 5);
		
		doMath(new Math(){
			@Override
			public double calculate(double  arg1, double arg2){
				return arg1 * arg2;
			}
		}, 3, 5);
		
		doMath(new Math(){
			@Override
			public double calculate(double  arg1, double arg2){
				return arg1 - arg2;
			}
		}, 3, 5);
		
		doMath(new Math(){
			@Override
			public double calculate(double  arg1, double arg2){
				return arg1 / arg2;
			}
		}, 3, 5);
	}
	
	public static void doMath(Math math, double arg1, double arg2){
		System.out.println(math.calculate(arg1, arg2));
	}
}
