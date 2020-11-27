package org.javaturk.oofp.ch09.lambda;

public class LambdaVariations2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			BinaryDoubleChecker checker = binaryDoubleCheckerFactory();
			binaryDoubleCheckerExecutor(checker, 10.22, 7.81);
		}
	}

	public static BinaryDoubleChecker binaryDoubleCheckerFactory() {
		BinaryDoubleChecker tautology = (d1, d2) -> true;
		BinaryDoubleChecker contradiction = (d1, d2) -> false;

		BinaryDoubleChecker equalityChecker = (d1, d2) -> d1 == d2;
		BinaryDoubleChecker firstArgumentGreaterChecker = (d1, d2) -> d1 > d2;
		BinaryDoubleChecker secondArgumentGreaterChecker = (d1, d2) -> d1 < d2;

		BinaryDoubleChecker checker = null;

		int i = (int) (Math.random() * 5);

		switch (i) {
		case 0:
			checker = tautology;
			System.out.println("Tautology");
			break;
			
		case 1:
			checker = contradiction;
			System.out.println("contradiction");
			break;
			
		case 2:
			checker = equalityChecker;
			System.out.println("equalityChecker");
			break;
			
		case 3:
			checker = firstArgumentGreaterChecker;
			System.out.println("firstArgumentGreaterChecker");
			break;
			
		case 4:
			checker = secondArgumentGreaterChecker;
			System.out.println("secondArgumentGreaterChecker");
			break;
		}

		return checker;
	}

	public static void binaryDoubleCheckerExecutor(BinaryDoubleChecker checker, double d1, double d2){
		boolean outcome = checker.check(d1, d2);
		System.out.println(outcome);
	}
}

@FunctionalInterface
interface BinaryDoubleChecker {

	public boolean check(double d1, double d2);
}
