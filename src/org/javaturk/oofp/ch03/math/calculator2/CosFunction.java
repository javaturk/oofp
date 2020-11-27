package org.javaturk.oofp.ch03.math.calculator2;


public class CosFunction extends AbstractMathFunction {
	
	public CosFunction(){
		super("cos");
	}
	
	public double calculate(double arg) {
		return Math.cos(arg);
	}
}
