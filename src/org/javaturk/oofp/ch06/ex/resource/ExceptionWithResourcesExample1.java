package org.javaturk.oofp.ch06.ex.resource;

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
public class ExceptionWithResourcesExample1 {

	public static void main(String[] args) throws IOException {
		String path = ScannerUtil.read("Please enter the path of the file to open:");
		openFile(path);
//		openAndCloseFile(path);
	}

	private static void openFile(String path) throws IOException {
		File file = new File(path);
		InputStream in = null;
		try {
			 in = new FileInputStream(file);
			System.out.println("File opened!");
			doSomethingWithFile(in);
			in.close();
		} catch (FileNotFoundException e) {
			in.close();
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
		} catch (IOException e) {
			in.close();
			System.out.println("Problem with closing the file: " + path);
			System.out.println("Message: " + e.getMessage());
		}
		finally{
			if(in != null)
				in.close();
		}
		
		try (InputStream in2 = new FileInputStream(file)) {
			System.out.println("File opened!");
			doSomethingWithFile(in2);
		} catch (FileNotFoundException e) {
			System.out.println("Problem with opening the file: " + path);
			System.out.println("Message: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem with closing the file: " + path);
			System.out.println("Message: " + e.getMessage());
		}
	}
	
	private static void doSomethingWithFile(InputStream in) {
		System.out.println("Printing file to the console");
		try {
			int c = 0;
			while((c = in.read()) != -1)
				System.out.println(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void openAndCloseFile(String path) {
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
		} catch (IOException e) {
			System.out.println("Problem with closing the file: " + path);
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
