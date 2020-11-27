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
public class ExceptionExample2 {

	public static void main(String[] args) {
		String path = ScannerUtil.read("Please enter the path of the file to open:");
		try {
			openAndCloseFile(path);
		} catch (IOException e) {
			System.out.println("Problem with closing the file: " + path);
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Catches one exception and throws the second one.
	 * @param path
	 * @throws IOException
	 */
	private static void openAndCloseFile(String path) throws IOException {
		File file = new File(path);
		try {
			InputStream in = new FileInputStream(file);
			System.out.println("File opened!");
			in.close();
			System.out.println("File closed!");
		} catch (FileNotFoundException e) {
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
