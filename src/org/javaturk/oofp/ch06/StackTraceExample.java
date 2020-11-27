package org.javaturk.oofp.ch06;

import java.util.Arrays;

public class StackTraceExample {

	public static void main(String[] args) {
		StackTraceExample ste = new StackTraceExample();
		ste.doThis();
	}

	public void doThis() {
		doThat();
	}

	private void doThat() {
		Throwable throwable = new Throwable("Just kidding :)");
//		throw throwable;
//		throwable.printStackTrace();
//		System.out.println();
//		printStackTraceForThrowable(throwable);
	}

	public void printStackTraceForThrowable(Throwable throwable) {
		System.out.println("\n* * * Stack Trace * * *");
		StackTraceElement[] traces = throwable.getStackTrace(); // Thread.currentThread().getStackTrace();
		for (StackTraceElement trace : traces) {
			System.out.println("\nNew stack info:");
			System.out.println("File name: " + trace.getFileName());
			System.out.println("Class name: " + trace.getClassName());
			System.out.println("Method name: " + trace.getMethodName());
			System.out.println("Line number: " + trace.getLineNumber());
		}
		System.out.println();

		// Optionally:
		// System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
	}
}
