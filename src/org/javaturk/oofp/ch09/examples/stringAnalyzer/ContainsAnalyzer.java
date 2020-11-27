package org.javaturk.oofp.ch09.examples.stringAnalyzer;

public class ContainsAnalyzer implements StringAnalyzer {
	
	@Override
	public boolean analyze(String target, String searchStr) {
		return target.contains(searchStr);
	}
}
