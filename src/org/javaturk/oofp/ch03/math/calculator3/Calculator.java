
package org.javaturk.oofp.ch03.math.calculator3;

public interface Calculator {
	
	public double doCalculation(String functionName, double arg);
	
	public double doCalculation(String functionName, double arg1, double arg2);
	
	public void addFunction(MathFunction function);
	
	public void listMathFunction();
}
