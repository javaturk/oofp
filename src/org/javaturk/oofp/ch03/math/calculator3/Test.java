package org.javaturk.oofp.ch03.math.calculator3;

import java.util.Scanner;

public class Test {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		Calculator calculator1 = new FlexCalculator(4);
		calculator1.addFunction(new SinFunction());
		calculator1.addFunction(new CosFunction());
		calculator1.addFunction(new LogFunction());
		calculator1.addFunction(new ExponentialFunction());

		
//		Calculator calculator2 = new Calculator(2);
//		calculator2.addFunction(new SinFunction());
//		calculator2.addFunction(new CosFunction());
		
		startCalculator(calculator1);
	}

	private static void startCalculator(Calculator calculator) {
		calculator.listMathFunction();
		System.out.println("Please enter the name of the function (or \"x\" for exit):");
		String functionName = in.next(); 
		if(functionName.equalsIgnoreCase("x")) {
			System.out.println("bye!");
			System.exit(0);
		}
		System.out.println("Number of the arguments:");
		String argumentCount = in.next(); 
		
		double functionArg1;
		double functionArg2;
		if(argumentCount.equals("1")){
			System.out.println("Please enter the argument of the function:");
			functionArg1 = in.nextDouble();
			double result = calculator.doCalculation(functionName, functionArg1);
			System.out.println(functionName + " of " + functionArg1 + " is " + result + "\n");
		}
		else{
			System.out.println("Please enter the first argument of the function:");
			functionArg1 = in.nextDouble();
			System.out.println("Please enter the second argument of the function:");
			functionArg2 = in.nextDouble();
			double result = calculator.doCalculation(functionName, functionArg1, functionArg2);
			System.out.println(functionName + " of " + functionArg1 + " and " + functionArg2 + " is " + result + "\n");
			
		}
		startCalculator(calculator);
	}

}
