package org.javaturk.oofp.ch09.lambda.evenNumber;

public class EvenNumberOperationsWithLambda {
	
	private static int total;
	private static int product = 1;
	private static int[] squares = new int[5];

	public static void main(String[] args) {
		EvenNumberOperation printer = (i) -> System.out.print(i + " ");
		pickEvenNumber(10, printer);
		
		System.out.println();
		
		pickEvenNumber(10, (i) -> total += i);
		System.out.println("Sum: " + total);

		pickEvenNumber(10, (i) -> product *= i);
		System.out.println("Product: " + product);
		
		pickEvenNumber(10, (i) -> {
			squares[i/2-1] = i * i;
		});
		
		System.out.print("Squares: ");
		for(int i : squares)
			System.out.print(i + " ");
	}

	public static void pickEvenNumber(int n, EvenNumberOperation operation) {
		for (int i = 2; i <= n; i += 2) 
			operation.operate(i);
	}
}
