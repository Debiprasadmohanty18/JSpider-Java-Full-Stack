package com.ExceptionHandling;

class InsufficientBalException extends Exception {
	public InsufficientBalException(String message)
	{
		super(message);
	}
	
	public InsufficientBalException()
	{
		super("Less Amount");
	}
}

class Account {
	int bal;
	
	public Account(int bal)
	{
		this.bal = bal;
	}
	
	public void withdraw(int amount) throws InsufficientBalException
	{
		System.out.println("Available Bal : " + bal);
		if(amount > bal)
		{
			throw new InsufficientBalException();
		}
		
		bal -= amount;
		System.out.println(amount + " Withdraw Done");
		System.out.println("Available Bal After Withdraw : " + bal);
	}
}


public class BankExample {

	public static void main(String[] args) {
		
		Account a1 = new Account(6000);
		try {
			a1.withdraw(7000);
		} catch (InsufficientBalException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("Handled");
		}
	
	}

}
