package org.javaturk.oofp.ch09.lambda.evenNumber;

public class Cevap {
	int sum = 0;
	int product = 1;
	int[] squares = new int[5];
	
	public static void main(String[] args) {

		doIt(10, (int k) -> System.out.println(k));

		Cevap c = new Cevap();
		
		doIt(10, (int k) -> c.sum += k);
		System.out.println("Sum: " + c.sum);

		doIt(10, (int k) -> c.product *= k);
		System.out.println("Product: " + c.product);

		doIt(10, (int k) -> c.squares[k/2 -1] = k * k);
		System.out.println("Squares");
		
		for(int i : c.squares)
			System.out.print(i + " ");
	}
	
	public static void doIt(int n, EvenNumberOperation operation) {
		for (int i = 2; i <= n; i += 2)
			operation.operate(i);
	}
}
