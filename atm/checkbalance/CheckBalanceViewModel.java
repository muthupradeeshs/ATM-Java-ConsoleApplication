package com.muthupradeesh.atm.checkbalance;

import com.muthupradeesh.atm.dto.Card;

class CheckBalanceViewModel {
	private CheckBalanceView checkBankBalance;


	public void showBalance(Card card) {
		System.out.println("Your Balance is : " + card.getBalance());
	}

}
