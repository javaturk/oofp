package org.javaturk.oofp.ch06.ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.javaturk.oofp.util.ScannerUtil;

/**
 * Example input: /Users/akin/derby.log /Users/akin/Desktop/a.txt
 * 
 * @author akin
 *
 */
public class ExceptionExample1 {

	public static void main(String[] args) {
		String path = ScannerUtil.read("Please enter the path of the file to open:");
		openFile(path);
		openAndCloseFile(path);
//		openAndCloseFile2(path);
	}

	private static void openFile(String path) {
		File file = new File(path);
		
		try {
			InputStream in = new FileInputStream(file);
			System.out.println("File opened!");
		} catch (FileNotFoundException e) {
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private static void openAndCloseFile(String path) {
		File file = new File(path);
		try {
			InputStream in = new FileInputStream(file);
			System.out.println("File opened!");
			try {
				Thread.currentThread().sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int availableByteCount = in.available();
			System.out.println("Available Byte Count: " + availableByteCount);
			in.close();
			System.out.println("File closed!");
		} catch (FileNotFoundException e) {
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problem with closing the file: " + path);
			System.out.println("Message: " + e.getMessage());
			// e.printStackTrace();
		}
	}

	private static void openAndCloseFile2(String path) {
		File file = new File(path);
		try {
			OutputStream out = new FileOutputStream(file);
			System.out.println("File opened!");
			
			try {
				Thread.currentThread().sleep(10_000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			String s = "Java Forever!";
			byte[] bytes = s.getBytes("US-ASCII");
			out.write(bytes);
			out.close();
			System.out.println("File closed!");
		} catch (FileNotFoundException e) {
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problem with closing the file: " + path);
			System.out.println("Message: " + e.getMessage());
			// e.printStackTrace();
		}
	}
}
