package org.javaturk.oofp.util;

import java.util.Scanner;

public class ScannerUtil {
	
	private static Scanner scanner;
	
	static{
		scanner = new Scanner(System.in);
	}
	
	public static String read(String prompt){
		System.out.println(prompt);
		return scanner.next();
	}

}
