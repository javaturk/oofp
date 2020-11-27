package org.javaturk.oofp.ch06.ex.finaly;

import java.io.*;

public class TryWithoutCatch {

	public static void main(String[] args) {
		try {
			trySomething();
			System.out.println("in main");
		} catch (IOException e) {
			System.out.println("in catch()");
			System.out.println(e.getMessage());
		}
	}

	public static void trySomething() throws IOException {
		System.out.println("In trySomething()");
		InputStream is = null;
		try {
			System.out.println("In try");
			is = new FileInputStream(new File("/Users/akin/derby1.log"));
			
			is.close();
		} finally {
			System.out.println("In finally");
			try {
				if(is != null)
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void trySomethingElse() {
		InputStream is = null;
		try {
			try {
				is = new FileInputStream(new File(""));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
