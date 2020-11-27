package org.javaturk.oofp.ch12.stream;

import java.util.List;
import java.util.stream.Stream;

import org.javaturk.oofp.ch12.domain.CollectionFactory;

public class StreamWithClosingHandler {

	public static void main(String[] args) {
		List<String> names = CollectionFactory.getNameList();

		Stream<String> sequentialStream = names.stream();
		Stream<String> sequentialStreamWithHandler1 = sequentialStream
				.onClose(() -> System.out.println("Handler on sequentialStreamWithHandler1"));
		Stream<String> sequentialStreamWithHandler2 = sequentialStream
				.onClose(() -> System.out.println("Handler on sequentialStreamWithHandler2"));
		
		sequentialStream.close();
//		sequentialStreamWithHandler1.close();
//		sequentialStreamWithHandler2.close();

		if (sequentialStream == sequentialStreamWithHandler1)
			System.out.println("The same");

		if (sequentialStreamWithHandler1 == sequentialStreamWithHandler2)
			System.out.println("The same");
	}
}
