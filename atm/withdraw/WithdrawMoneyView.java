package com.muthupradeesh.atm.withdraw;

import java.util.Scanner;

import com.muthupradeesh.atm.dto.Card;

public class WithdrawMoneyView {
	private WithdrawMoneyViewModel withdrawMoneyViewModel;

	public WithdrawMoneyView() {
		withdrawMoneyViewModel = new WithdrawMoneyViewModel();
	}

	public void withdrawMoney(Card card) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Eneter the Amounts in 100,500 : ");
		double amount = scan.nextDouble();
		scan.nextLine();
		withdrawMoneyViewModel.getTransaction(card, amount);

	}
}
