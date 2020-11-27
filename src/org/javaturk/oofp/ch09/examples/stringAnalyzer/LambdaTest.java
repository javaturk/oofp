
package org.javaturk.oofp.ch09.examples.stringAnalyzer;

public class LambdaTest {

	public static void main(String[] args) {
		String[] strList01 = { "tomorrow", "toto", "to", "timbukto", "the", "hello", "heat" };

		AnalyzerTool stringTool = new AnalyzerTool();
		String searchStr = "to";

		System.out.println("Searching for: " + searchStr);

		System.out.println("\n*** Contains ***");
		StringAnalyzer sa = (t, s) -> t.contains(s);
		System.out.println("tomorrow has to: " + sa.analyze("tomorrow", searchStr));
		
		stringTool.showResult(strList01, searchStr, (t, s) -> t.contains(s));

		System.out.println("\n*** Starts With ***");
		stringTool.showResult(strList01, searchStr, (t, s) -> t.startsWith(s));

		System.out.println("\n*** Equals ***");
		stringTool.showResult(strList01, searchStr, (t, s) -> t.equals(s));

		System.out.println("\n*** Ends With ***");
		// Your code here
		
		sa = (a, b) -> a.endsWith(b);
		
		sa = (String a, String b) -> {
			return a.endsWith(b);
		};

		System.out.println("\n Which one islonger?");
		// Your Code here
		StringAnalyzer isLonger = (String a, String b) -> {
			int lengthOfA = a.length();
			int lengthOfB = b.length();
			return lengthOfA > lengthOfB;
//			if( lengthOfA > lengthOfB)
//				return true;
//			else
//				return false;
		};
		
		System.out.println("\n*** Greater than 5==");
		// Your code here
	}

}
