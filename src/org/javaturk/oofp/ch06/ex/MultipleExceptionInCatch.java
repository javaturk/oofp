package org.javaturk.oofp.ch06.ex;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class MultipleExceptionInCatch {

	public static void main(String[] args) {
		
		try {
			doSomething1();
			doSomething2();
		}
		catch(FileNotFoundException | ParseException e) {
			e.printStackTrace();
		}
		
//		try {
//			doSomething1();
//			doSomething2();
//		}
//		catch(FileNotFoundException e1| ParseException e2) {
//			e.printStackTrace();
//		}
	}

	private static void doSomething1() throws FileNotFoundException {

	}

	private static void doSomething2() throws ParseException {

	}
}
