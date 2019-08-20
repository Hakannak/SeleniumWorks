package com.class26;

public  interface Bank {

	static String name="Bank";//by default all variables inside the interface are public static final
	String hello="hi";//by default it will be public static final
	
	//by default compiler adds public & abstract to every method
	public void hasChecking();
	void hasSavings();
	void hasCreditCard();
	
	//static void hasLoan(); cannot have static abstract methods

}
class BOA implements Bank{
	@Override
	public void hasChecking() {
		System.out.println("BOA has 2 checking account");
	}
	@Override
	public void hasSavings() {
		System.out.println("BOA has 2 savvings account");
	}
	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 10 different cc");
	}
}
class PNC implements Bank{
	@Override
	public void hasChecking() {
		System.out.println("PNC has 3 checking account");
	}
	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 savings account");
	}
	@Override
	public void hasCreditCard() {
		System.out.println("PNC has 7 different cc");
	}
	
	public void hasLoan() {
		System.out.println("PNC has loan");
	}
}
