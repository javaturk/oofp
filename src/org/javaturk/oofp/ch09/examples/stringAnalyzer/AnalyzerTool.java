package org.javaturk.oofp.ch09.examples.stringAnalyzer;

public class AnalyzerTool {

	public void showResult(String[] strList, String searchStr, StringAnalyzer analyzer) {
		for (String current : strList) {
			if (analyzer.analyze(current, searchStr)) {
				System.out.println("Match: " + current);
			}
		}
	}
}
