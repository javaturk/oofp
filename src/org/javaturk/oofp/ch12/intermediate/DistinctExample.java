package org.javaturk.oofp.ch12.intermediate;

import java.util.List;
import java.util.stream.Stream;

import static org.javaturk.oofp.ch12.domain.CollectionFactory.getDuplicatedNameList;
import static org.javaturk.oofp.ch12.util.StreamUtil.print;

public class DistinctExample {

	public static void main(String[] args) {
		List<String> duplicatedNameList = getDuplicatedNameList();
		print(duplicatedNameList);
		
		System.out.println("All names");
		
		Stream<String> stream1 = duplicatedNameList.stream();
		print(stream1);
		
		System.out.println("Distinct names");
		
		Stream<String> stream2 = duplicatedNameList.stream();
		stream2 = stream2.distinct();
		print(stream2);
	}
}
