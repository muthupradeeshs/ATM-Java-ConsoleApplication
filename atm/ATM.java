package com.muthupradeesh.atm;

import java.util.Scanner;

import com.muthupradeesh.atm.cardprocess.CardProcessView;
import com.muthupradeesh.atm.util.Utility;

public class ATM {
	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.loadDefaultCustomer();
		atm.init();
	}

	void loadDefaultCustomer() {
		Utility utility = new Utility();
		utility.loadCustomers();
	}

	private void init() {
		Scanner scan = new Scanner(System.in);
		System.out.println("********* ATM **********");
		System.out.print("Enter Card Number : ");
		long cardNumber = scan.nextLong();
		System.out.print("Enter the PIN : ");
		int pin = scan.nextInt();
		scan.nextLine();
		CardProcessView processCard = new CardProcessView();
		processCard.processCard(cardNumber, pin);

	}

}
