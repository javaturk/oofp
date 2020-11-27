
package org.javaturk.oofp.ch03.math.calculator2;

public abstract class AbstractMathFunction implements MathFunction {

	protected String name;
	
	public AbstractMathFunction(String name){
		this.name = name;
	}

	@Override
	public final String getName() {
		return name;
	}
}
