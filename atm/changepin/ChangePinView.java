package com.muthupradeesh.atm.changepin;

import java.util.Scanner;

import com.muthupradeesh.atm.dto.Card;

public class ChangePinView {
	private ChangePinViewModel changePINViewModel;

	public ChangePinView() {
		changePINViewModel = new ChangePinViewModel();
	}

	public void changePIN(Card card) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Mobile Number : ");
		long mobileNumber = scan.nextLong();
		scan.nextLine();
		boolean choise = changePINViewModel.changePIN(card, mobileNumber);
		if (choise)
			getInputPIN(card);
		else
			changePIN(card);
	}

	public void getInputPIN(Card card) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the PIN : ");
		short pin = scan.nextShort();
		System.out.print("Confirm Your PIN : ");
		short confirmPIN = scan.nextShort();
		scan.nextLine();
		changePINViewModel.confirmChangePIN(card, pin, confirmPIN);
	}
}
