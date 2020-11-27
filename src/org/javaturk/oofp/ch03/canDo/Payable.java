package org.javaturk.oofp.ch03.canDo;

public interface Payable {
	
	double calculatePrice();
	
	double calculateTax();
	
	void pay(double price);

}
