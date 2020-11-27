package org.javaturk.oofp.ch09.functions;

public class CommonFunctionalInterfaces {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		UniIntegerChecker isZero = (i) -> i == 0;
		UniIntegerChecker isOne = (i) -> i == 1;
		UniIntegerChecker isPositive = (i) -> i >= 0;
		UniIntegerChecker isNegative = (i) -> i < 0;
		UniIntegerChecker isGreaterThan100 = (i) -> i > 100;

		BiIntegerChecker isEqual = (i, j) -> i == j;
		BiIntegerChecker isNotEqual = (i, j) -> i != j;
		BiIntegerChecker isGreaterThan = (i, j) -> i > j;
		BiIntegerChecker isLessThan = (i, j) -> i < j;
	}
}

@FunctionalInterface
interface UniIntegerChecker {
	boolean method(int i);
}

@FunctionalInterface
interface BiIntegerChecker {
	boolean method(int i, int j);
}
