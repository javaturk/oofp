package org.javaturk.oofp.ch07.account.ex;

public class NegativeAmountException extends Exception {
	private static final String prefix = "Negative amount can't be provided. ";
	public NegativeAmountException(double amount) {
		super(prefix + amount);
	}
	
	public String getMessage(){
		return prefix + super.getMessage();
	}
}
