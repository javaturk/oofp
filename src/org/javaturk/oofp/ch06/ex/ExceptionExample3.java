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
public class ExceptionExample3 {

	public static void main(String[] args){
		String path = ScannerUtil.read("Please enter the path of the file to open:");

		try {
			openAndCloseFile(path);
		} catch (FileNotFoundException e) {
			System.out.println("Problem with closing the file: " + path);
			System.out.println("Message: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
		}
	}

	private static void openAndCloseFile(String path) throws IOException, FileNotFoundException {
		File file = new File(path);
		InputStream in = new FileInputStream(file);  // FileNotFoundException
		System.out.println("File opened!");
		in.close();									// IOException
		System.out.println("File closed!");
	}
}
