package com.class26;

public class BankTest {

	public static void main(String[] args) {
		Bank bank=new PNC();
		bank.hasChecking();
		bank.hasCreditCard();
		bank.hasSavings();
		System.out.println(PNC.hello);
		
	}
}
