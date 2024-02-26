package com.muthupradeesh.atm.cardprocess;

import java.util.Scanner;

import com.muthupradeesh.atm.changepin.ChangePinView;
import com.muthupradeesh.atm.checkbalance.CheckBalanceView;
import com.muthupradeesh.atm.deposite.DepositeMoneyView;
import com.muthupradeesh.atm.dto.Card;
import com.muthupradeesh.atm.withdraw.WithdrawMoneyView;


public class CardProcessView {
	private CardProcessViewModel processCardViewModel;

	public CardProcessView() {
		processCardViewModel = new CardProcessViewModel();
	}

	public void processCard(long number, int pin) {
		Card card = processCardViewModel.getCard(number, pin);
		if (card != null) {
			onSucess(card);
		} else {
			processCardViewModel.getErrorMessage();
		}

	}

	private void onSucess(Card card) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome " + card.getBankCustomer().getCustomerName());
		System.out.println(
				"Enter your option : \n1.Check Balance\n2.Withdraw Money\n3.Deposite Money\n4.Change PIN\n0.Exit");
		int option = scan.nextInt();
		switch (option) {
		case 1:
			CheckBalanceView checkBankBalance = new CheckBalanceView();
			checkBankBalance.checkBalance(card);
			break;
		case 2:
			WithdrawMoneyView withdrawMoney = new WithdrawMoneyView();
			withdrawMoney.withdrawMoney(card);
			break;
		case 3:
			DepositeMoneyView depositeMoney = new DepositeMoneyView();
			depositeMoney.depositeMoney(card);
			break;
		case 4:
			ChangePinView changePIN = new ChangePinView();
			changePIN.changePIN(card);
			break;
		case 0:
			return;
		default:
			System.out.println("Enter Valid Option");
		}
	}
}
