
package org.javaturk.oofp.ch09.examples.stringAnalyzer;

import java.util.function.BiFunction;

public class StringAnalyzerTest {
	private static String[] strList = { "tomorrow", "toto", "to", "timbukto", "the", "hello", "heat" };
	private static String searchStr = "to";

	public static void main(String[] args) {
//		System.out.println("Searching for: " + searchStr);
//		search1();

//		search2(strList, searchStr, new ContainsAnalyzer());

//		ContainsAnalyzer contains = new ContainsAnalyzer();
//		search2(strList, searchStr, contains);
//		
//		search2(strList, searchStr, new StringAnalyzer(){
//
//			@Override
//			public boolean analyze(String target, String searchStr) {
//				return target.contains(searchStr);
//			}
//		});
////		
		StringAnalyzer sa = (String target, String search) -> target.contains(search);
		search2(strList, searchStr, sa);
////		
		search2(strList, searchStr, (String target, String search) -> {
			return target.contains(search);
		});

		StringAnalyzer sa2 = (target, search) -> target.endsWith(search);
		search2(strList, searchStr, sa2);

		StringAnalyzer sa3 = (target, search) -> target.startsWith(search);
		search2(strList, searchStr, sa3);

		StringAnalyzer sa4 = (target, search) -> target.length() > search.length();
		search2(strList, searchStr, sa4);
	}

	public static void search1() {
		System.out.println("\nin search1()");
		// Call concrete class that implements StringAnalyzer
		StringAnalyzer contains = new ContainsAnalyzer();

		System.out.println("*** Contains ***");
		for (String currentStr : strList) {
			if (contains.analyze(currentStr, searchStr)) {
				System.out.println("Match: " + currentStr);
			}
		}
	}

	public static void search2(String[] strList, String searchStr, StringAnalyzer analyzer) {
		System.out.println("\nin search2()");
		System.out.println("*** Contains ***");
		for (String currentStr : strList) {
			if (analyzer.analyze(currentStr, searchStr)) {
				System.out.println("Match: " + currentStr);
			}
		}
	}

//	public static void search3(String[] strList, String searchStr, StringAnalyzer analyzer) {
//		System.out.println("\n*** Contains ***");
//		for (String currentStr : strList) {
//			if (analyzer.analyze(currentStr, searchStr)) {
//				System.out.println("Match: " + currentStr);
//			}
//		}
//	}
}
