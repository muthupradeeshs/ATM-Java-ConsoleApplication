package com.muthupradeesh.atm.util;

import java.util.HashMap;
import com.muthupradeesh.atm.dto.*;
import com.muthupradeesh.atm.repository.Repository;


public class  Utility {

	public void loadCustomers() {
		HashMap<Long, Bank_Customer> usersList = Repository.getInstance().getUsersList();
		HashMap<Long, Card> cardList = Repository.getInstance().getCardList();
		Card card1 = new Card("TMB Bank", "Erode", 12345678913L, 98765432109864L, 3456, 6000.0);
        Bank_Customer customer1= new Bank_Customer("Muthu", 7890123456L, "10/904 East Street, Erode");
        card1.setBankCustomer(customer1);
        customer1.setCard(card1);
        Card card2 = new Card("SBI Bank", "Ooty", 12345678914L, 98765432109863L, 7890, 7000.0);
        Bank_Customer customer2 = new Bank_Customer("Pradeesh", 6543210980L, "11/905 Hill Road, Ooty");
        card2.setBankCustomer(customer2);
        customer2.setCard(card2);
        Card card3 = new Card("Indian Bank", "Salem", 12345678915L, 98765432109862L, 1234, 8000.0);
        Bank_Customer customer3 = new Bank_Customer("Kannan", 8901234567L, "12/906 West Main Street, Salem");
        card3.setBankCustomer(customer3);
        customer3.setCard(card3);
        Card card4 = new Card("IOB Bank", "Pavoorchathram", 12345678916L, 98765432109861L, 5678, 9000.0);
        Bank_Customer customer4 = new Bank_Customer("Buvan", 7654321098L, "13/907 South Street, Pavoorchathram");
        card4.setBankCustomer(customer4);
        customer4.setCard(card4);
        Card card5 = new Card("IOB Bank", "Tuticorin", 12345678917L, 98765432109860L, 9012, 10000.0);
        Bank_Customer customer5 = new Bank_Customer("Ava", 5432109876L, "14/908 Port Road, Tuticorin");
        card5.setBankCustomer(customer5);
        customer5.setCard(card5);
		usersList.put(customer1.getCard().getAccountNumber(), customer1);
		cardList.put(card1.getCardNumber(), card1);
		usersList.put(customer2.getCard().getAccountNumber(), customer2);
		cardList.put(card2.getCardNumber(), card2);
		usersList.put(customer3.getCard().getAccountNumber(), customer3);
		cardList.put(card3.getCardNumber(), card3);
		usersList.put(customer4.getCard().getAccountNumber(), customer4);
		cardList.put(card4.getCardNumber(), card4);
		usersList.put(customer5.getCard().getAccountNumber(), customer5);
		cardList.put(card5.getCardNumber(), card5);
	}
}
