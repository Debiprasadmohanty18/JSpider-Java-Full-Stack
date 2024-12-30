package com.JSP.Polymorphism.RuntimePolymorphism;

interface Sim {
	void connect();
}
class Jio implements Sim {
	@Override
	public void connect() 
	{
		System.out.println("Call Connected by Jio");
	}	
}
class Airtel implements Sim {
	@Override
	public void connect() 
	{
		System.out.println("Call Connected by Airtel");
	}	
}
class VI implements Sim {
	@Override
	public void connect() 
	{
		System.out.println("Call Connected by VI");
	}	
}
class BSNL implements Sim {
	@Override
	public void connect() 
	{
		System.out.println("Call Connected by BSNL");
	}	
}
class Phone {
	Sim s;

	public Phone(Sim s) 
	{
		this.s = s;
	}
	
	void call()
	{
		s.connect();
	}
	
}

public class PhoneExample {

	public static void main(String[] args) 
	{
		Phone p1 = new Phone(new Airtel());
		p1.call();
		System.out.println("==========================");
		Phone p2 = new Phone(new BSNL());
		p2.call();
	}

}
