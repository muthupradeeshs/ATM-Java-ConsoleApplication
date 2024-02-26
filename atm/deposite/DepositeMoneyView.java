package com.muthupradeesh.atm.deposite;

import java.util.Scanner;

import com.muthupradeesh.atm.dto.Card;

public class DepositeMoneyView {
	private DepositeMoneyViewModel depositeMoneyViewModel;

	public DepositeMoneyView() {
		depositeMoneyViewModel = new DepositeMoneyViewModel();
	}

	public void depositeMoney(Card card) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Amount in Multiples of 100 : ");
		double amount = scan.nextDouble();
		scan.nextLine();
		depositeMoneyViewModel.depositeMoney(card, amount);
	}
}
