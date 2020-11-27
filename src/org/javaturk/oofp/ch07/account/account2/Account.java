package org.javaturk.oofp.ch07.account.account2;

import java.util.logging.Logger;

import org.javaturk.oofp.ch07.account.ex.InsufficentBalanceException;
import org.javaturk.oofp.ch07.account.ex.NegativeAmountException;

public class Account {
	private int id;
	private double balance;
	private Logger log;

	public void changeBalance(AccountAction action, double amount)
			throws InsufficentBalanceException, NegativeAmountException {
		if (amount < 0)
			throw new NegativeAmountException(amount);

		balance = action.act(balance, amount);

		log.info(action + " : " + amount + " for account id: " + id);
	}
}
