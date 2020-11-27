package org.javaturk.oofp.ch07.account.account2;

import org.javaturk.oofp.ch07.account.ex.InsufficentBalanceException;

public interface AccountAction {
	
	public double act(double balance, double amount) throws InsufficentBalanceException;

}
