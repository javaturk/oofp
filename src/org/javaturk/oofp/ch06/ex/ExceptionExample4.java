package org.javaturk.oofp.ch06.ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.javaturk.oofp.util.ScannerUtil;

/**
 * Example input: /Users/akin/derby.log
 * 
 * @author akin
 *
 */
public class ExceptionExample4 {

	public static void main(String[] args) {
		String path = ScannerUtil.read("Please enter the path of the file to open:");
		
		try {
			openAndCloseFile1(path);
		} catch (FileNotFoundException e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with closing the file: " + path);
			System.out.println("Message: " + e.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
		}
		
		try {
			openAndCloseFile1(path);
		} 
		catch (Exception e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
		}
		
		try {
			openAndCloseFile2(path);
		} catch (IOException e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
		}
		
		try {
			openAndCloseFile3(path);
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
		}
		
		try {
			openAndCloseFile4(path);
		} catch (Throwable e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
		}
	}
	
	private static void openAndCloseFile1(String path) throws IOException, FileNotFoundException {
		File file = new File(path);
		InputStream in = new FileInputStream(file);
		System.out.println("File opened!");
		in.close();
		System.out.println("File closed!");
	}

	
	private static void openAndCloseFile2(String path) throws IOException {
		File file = new File(path);
		InputStream in = new FileInputStream(file);
		System.out.println("File opened!");
		in.close();
		System.out.println("File closed!");
	}
	
	private static void openAndCloseFile3(String path) throws Exception {
		File file = new File(path);
		InputStream in = new FileInputStream(file);
		System.out.println("File opened!");
		in.close();
		System.out.println("File closed!");
	}
	
	private static void openAndCloseFile4(String path) throws Throwable {
		File file = new File(path);
		InputStream in = new FileInputStream(file);
		System.out.println("File opened!");
		in.close();
		System.out.println("File closed!");
	}
	
//	/**
//	 * Can't declare an exception type that is not the parent type of the actually thrown object!
//	 * @param path
//	 * @throws ArithmeticException
//	 */
//	private static void openAndCloseFile4(String path) throws ArithmeticException {
//		File file = new File(path);
//		InputStream in = new FileInputStream(file);
//		System.out.println("File opened!");
//		in.close();
//		System.out.println("File closed!");
//	}
}
