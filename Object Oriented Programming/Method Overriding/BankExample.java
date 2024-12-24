package com.JSP.MethodOverriding;

class Bank {
	int rateOfInt()
	{
		return 0;
	}
}
class SBI extends Bank {
	@Override
	public int rateOfInt()
	{
		return 12;
	}
}
class ICICI extends Bank{
	@Override
	protected int rateOfInt()
	{
		return 18;
	}
}
class Axis extends Bank {
	@Override
	int rateOfInt()
	{
		return 10;
	}
}



public class BankExample {

	public static void main(String[] args) {
		
		SBI s1 = new SBI();
		ICICI i1 = new ICICI();
		Axis a1 = new Axis();
		
		System.out.println("SBI Rate Of Intrest :- "+s1.rateOfInt());
		System.out.println("ICICI Rate Of Intrest :- "+i1.rateOfInt());
		System.out.println("Axis Rate Of Intrest :- "+a1.rateOfInt());
		
	}

}
