package com.muthupradeesh.atm.cardprocess;

import com.muthupradeesh.atm.dto.Card;
import com.muthupradeesh.atm.repository.Repository;

class CardProcessViewModel {
	private CardProcessView processCardViewModel;

	
	Card getCard(long number, int pin) {
		Card card = Repository.getInstance().getCardList().get(number);
		if (card != null) {
		int pinNumber = card.getPin();
			if (pin != pinNumber) {
				System.out.println("Invalid PIN number");
				return null;
			}

		}
		return card;
	}
	void getErrorMessage() {
		System.out.println("Sorry could not process your card");

	}

}
