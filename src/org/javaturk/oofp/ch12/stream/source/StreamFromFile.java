package org.javaturk.oofp.ch12.stream.source;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class StreamFromFile {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(
				new FileReader("src/org/javaturk/oofp/ch12/stream/source/Beklenen.txt"));
				Stream<String> fileLines = br.lines()) {
			fileLines.forEach(element -> System.out.printf("%s\n", element));
//			System.out.printf("Number of lines in the file: %d\n\n", fileLines.count());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("\n\n");

		BufferedReader br = null;
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("src/org/javaturk/oofp/ch12/stream/source/Beklenen.txt");
			br = new BufferedReader(fileReader);
			Stream<String> fileLines = br.lines();
			fileLines.forEach(element -> System.out.printf("%s\n", element));
//			System.out.printf("Number of lines in the file: %d\n\n", fileLines.count());
			fileReader.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			try {
				fileReader.close();
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
			try {
				fileReader.close();
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
