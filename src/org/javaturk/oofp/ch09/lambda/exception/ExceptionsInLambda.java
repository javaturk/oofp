package org.javaturk.oofp.ch09.lambda.exception;

public class ExceptionsInLambda {

	public static void main(String[] args) {

		ExceptionThrowingInterface1 le = (i, j) -> {
			if (i < 0 && j < 0)
				throw new AllNegativeArgumentException("All arguments must be positive: " + i + ", " + j);

			if (i < 0 || j < 0) {
				if (i < 0)
					throw new NegativeArgumentException("First argument must be positive: " + i);
				else
					throw new NegativeArgumentException("Second argument must be positive: " + j);
			}

			if (j == 0)
				throw new ArithmeticException("Second argument can't be zero: " + j);

			return (double) i / j;
		};

		try {
			System.out.println("10/2 = " + le.divideOnlyPositives(10, 2));
			// Uncomment following lines in order.
//			System.out.println("-10/2 = " + le.divideOnlyPositives(-10, 2));
//			System.out.println("10/-2 = " + le.divideOnlyPositives(10, -2));
//			System.out.println("-10/-2 = " + le.divideOnlyPositives(-10, -2));
		} catch (NegativeArgumentException e) {
			System.out.println("*************** Problem ***************");
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("***************************************");
		}
		
		try {
			System.out.println("10/0 = " + le.divideOnlyPositives(10, 0));
		} catch (NegativeArgumentException e) {
			e.printStackTrace();
		}
	}
}

@FunctionalInterface
interface ExceptionThrowingInterface1 {

	double divideOnlyPositives(int i, int j) throws NegativeArgumentException;
}

class NegativeArgumentException extends Exception {

	public NegativeArgumentException(String message) {
		super(message);
	}
}

class AllNegativeArgumentException extends NegativeArgumentException {

	public AllNegativeArgumentException(String message) {
		super(message);
	}
}
