package com.class30;

public abstract class CreditCard {
public String creditCardName;
	
	public CreditCard(String creditCardName) {
		this.creditCardName=creditCardName;
	}
	public void openAccount() {
		System.out.println("Open "+creditCardName+" credit card");
	}
	public abstract void interestRate();
	public abstract void annualFee();
}
class Visa extends CreditCard {
	public Visa(String creditCardName) {
		super(creditCardName);
	}
	@Override
	public void interestRate() {
		System.out.println(creditCardName+" card has ineterest rate of 25%");
	}
	@Override
	public void annualFee() {
		System.out.println(creditCardName+" card has annual fee of $250");
	}
}
class AX extends CreditCard {
	public AX(String creditCardName) {
		super(creditCardName);
	}
	@Override
	public void interestRate() {
		System.out.println(creditCardName+" card has interest rate of 22%");
	}
	@Override
	public void annualFee() {
		System.out.println(creditCardName+" card has annual fee of $200");
	}
}
class MasterCard extends CreditCard {
	public MasterCard(String creditCardName) {
		super(creditCardName);
	}
	@Override
	public void interestRate() {
		System.out.println(creditCardName+" card has interest rate of 20%");
	}
	@Override
	public void annualFee() {
		System.out.println(creditCardName+" card has NO annual fee");
	}
}