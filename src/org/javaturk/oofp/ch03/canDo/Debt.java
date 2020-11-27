
package org.javaturk.oofp.ch03.canDo;

/**
 * @author akin
 *
 */
public class Debt implements Payable {

	@Override
	public double calculatePrice() {
		return 10;
	}

	@Override
	public double calculateTax() {
		return 1;
	}

	@Override
	public void pay(double price) {
		System.out.println("Debt is paid.");
	}
}
