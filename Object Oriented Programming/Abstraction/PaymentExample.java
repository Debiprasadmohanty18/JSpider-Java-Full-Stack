package com.JSP.Abstraction;

import java.util.Scanner;

interface Payble {
	void pay();
}
class UPI implements Payble {

	@Override
	public void pay() 
	{
		System.out.println("Paid by using UPI");
	}
	
}
class NetBank implements Payble {
	
	@Override
	public void pay() 
	{
		System.out.println("Paid by using NetBanking");
	}
	
}
class CreditCard implements Payble {
	
	@Override
	public void pay() 
	{
		System.out.println("Paid by using Credit Card");
	}
	
}
class DebitCard implements Payble {
	
	@Override
	public void pay() 
	{
		System.out.println("Paid by using Debit Card");
	}
	
}
class GetPayment {
	static Payble getPaymentBy()
	{
		System.out.println("Payment Options Are :- \n 1 - UPI \n 2 - NetBanking \n 3 - Credit Card \n 4 - Debit Card");
		System.out.print("Chhose a Option to Pay :- ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n)
		{
		case 1 : return new UPI();
		case 2 : return new NetBank();
		case 3 : return new CreditCard();
		case 4 : return new DebitCard();
		default : System.out.println("Choosed Wrong Option!!!");
				  return null;
		}
	}
}

public class PaymentExample {

	public static void main(String[] args) 
	{
		Payble p1 = GetPayment.getPaymentBy(); // internally up-casting
		p1.pay();
	}

}
