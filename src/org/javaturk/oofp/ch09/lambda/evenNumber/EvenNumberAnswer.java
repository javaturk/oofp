package org.javaturk.oofp.ch09.lambda.evenNumber;

import java.util.function.IntConsumer;

public class EvenNumberAnswer {
	private int sum = 0;
	private int product = 1;
	private int[] squared = new int[5];

	public static void main(String[] args) {
		EvenNumberAnswer ena = new EvenNumberAnswer();
		
		EvenNumberOperation operation = null;
		IntConsumer consumer = null;
		
		operation = i -> System.out.print(i + " ");
		ena.doEvenNumberOperation(operation, 10);
		
		System.out.println();
		
		consumer = i -> System.out.print(i + " ");
		ena.doEvenNumberOperation(consumer, 10);
		
		System.out.println();
		
		operation = i -> ena.sum += i;
		ena.doEvenNumberOperation(operation, 10);
		System.out.println(ena.sum);
		
		System.out.println();
		
		ena.sum = 0;
		
		consumer = i -> ena.sum += i;
		ena.doEvenNumberOperation(consumer, 10);
		System.out.println(ena.sum);
		
		System.out.println();
		
		operation = i -> ena.product *= i;
		ena.doEvenNumberOperation(operation, 10);
		System.out.println(ena.product);
		
		System.out.println();
		
		ena.product = 1;
		
		consumer = i -> ena.product *= i;
		ena.doEvenNumberOperation(consumer, 10);
		System.out.println(ena.product);
		
		operation = i -> ena.squared[i/2 - 1] = i * i;
		ena.doEvenNumberOperation(operation, 10);
		for(int j : ena.squared)
			System.out.println(j);
		
		System.out.println();
		
		consumer = i -> ena.squared[i/2 - 1] = i * i;
		ena.doEvenNumberOperation(consumer, 10);
		for(int j : ena.squared)
			System.out.println(j);
	}
	
	public void doEvenNumberOperation(EvenNumberOperation operation, int n) {
		for(int i = 1; i <= n; i++)
			if(i % 2 == 0)
				operation.operate(i);
	}
	
	public void doEvenNumberOperation(IntConsumer operation, int n) {
		for(int i = 1; i <= n; i++)
			if(i % 2 == 0)
				operation.accept(i);
	}
}
