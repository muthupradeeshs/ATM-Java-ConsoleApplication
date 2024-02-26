package com.muthupradeesh.atm.checkbalance;

import com.muthupradeesh.atm.dto.Card;

public class CheckBalanceView {
	private CheckBalanceViewModel checkBankBalanceViewModel;

	public CheckBalanceView() {
		checkBankBalanceViewModel = new CheckBalanceViewModel();
	}

	public void checkBalance(Card card) {
		checkBankBalanceViewModel.showBalance(card);
	}
}
