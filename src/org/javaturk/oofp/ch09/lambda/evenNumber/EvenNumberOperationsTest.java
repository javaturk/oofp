package org.javaturk.oofp.ch09.lambda.evenNumber;

public class EvenNumberOperationsTest {

	public static void main(String[] args) {

		printEvenNumbers(10);

		int result = calculateSumOfEvenNumbers(10);
		System.out.println("Sum: " + result);

		result = calculateProductOfEvenNumbers(10);
		System.out.println("Product: " + result);

		int[] square = calculateSquareOfEvenNumbers(10);
		System.out.print("Squares: [ ");
		for(int i : square)
			System.out.print(i + " ");
		System.out.println("]");
	}

	static void printEvenNumbers(int n) {
		for (int i = 2; i <= n; i += 2)
			System.out.print(i + " ");
		System.out.println();
	}

	static int calculateSumOfEvenNumbers(int n) {
		int sum = 0;
		for (int i = 2; i <= n; i += 2)
			sum += i;
		return sum;
	}

	static int calculateProductOfEvenNumbers(int n) {
		int product = 1;
		for (int i = 2; i <= n; i += 2)
			product *= i;
		return product;
	}

	static int[] calculateSquareOfEvenNumbers(int n) {
		int[] square = new int[5];
		for (int i = 2; i <= n; i += 2)
			square[i / 2 - 1] = i * i;
		return square;
	}
}