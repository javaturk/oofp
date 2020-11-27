package org.javaturk.oofp.ch03.math.calculator2;


public class LogFunction extends AbstractMathFunction {

	public LogFunction(){
		super("log");
	}
	
	public double calculate(double arg) {
		return Math.log(arg);
	}
}
