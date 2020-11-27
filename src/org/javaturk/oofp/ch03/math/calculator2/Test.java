package org.javaturk.oofp.ch03.math.calculator2;

import java.util.Scanner;

public class Test {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		Calculator calculator1 = new Calculator(3);
		calculator1.addFunction(new SinFunction());
		calculator1.addFunction(new CosFunction());
		calculator1.addFunction(new LogFunction());

		
//		Calculator calculator2 = new Calculator(2);
//		calculator2.addFunction(new SinFunction());
//		calculator2.addFunction(new CosFunction());
		
		startCalculator(calculator1);
	}

	private static void startCalculator(Calculator calculator) {
		calculator.listMathFunction();
		System.out.println("Please enter the name of the function:");
		String functionName = in.next(); 
		if(functionName.equalsIgnoreCase("end"))
			System.exit(0);
		System.out.println("Please enter the argument of the function:");
		double functionArg = in.nextDouble(); 
		double result = calculator.doCalculation(functionName, functionArg);
		System.out.println(functionName + " of " + functionArg + " is " + result + "\n");
		
		startCalculator(calculator);
	}

}
