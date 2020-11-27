package org.javaturk.oofp.ch03.math.calculator2;


public class SinFunction extends AbstractMathFunction  {
	
	public SinFunction(){
		super("sin");
	}
	
	public double calculate(double arg) {
		return Math.sin(arg);
	}
}
