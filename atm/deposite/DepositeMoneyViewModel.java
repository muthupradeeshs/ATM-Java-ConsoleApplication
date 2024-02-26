package com.muthupradeesh.atm.deposite;

import com.muthupradeesh.atm.dto.Card;

class DepositeMoneyViewModel {
	private DepositeMoneyView depositeMoney;


	public void depositeMoney(Card card, double amount) {
		if (amount % 100 != 0) {
			System.out.println("Enter the amount in Multiples of 100");
			return;
		}
		if (amount < 0) {
			System.out.println("InvalidInput ");
			return;
		}
		double depositedBalance = card.getBalance() + amount;
		card.setBalance(depositedBalance);
		System.out.println("Your Balance : " + depositedBalance);

	}

}
