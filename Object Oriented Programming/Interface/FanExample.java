package com.JSP.Interface;

interface Regulator {
	void increaseSpeed();
	void decreaseSpeed();
}
interface Switch {
	void on();
	void off();
}
class B implements Regulator, Switch {

	@Override
	public void on() 
	{
		System.out.println("Fan is On");
		
	}

	@Override
	public void off() 
	{
		System.out.println("Fan is Off");
		
	}

	@Override
	public void increaseSpeed() 
	{
		System.out.println("Speed Increased");
		
	}

	@Override
	public void decreaseSpeed() 
	{
		System.out.println("Speed Decreased");
		
	}
	
}

public class FanExample {

	public static void main(String[] args) 
	{	
		Switch s1 = new B();
		s1.on();
//		s1.increaseSpeed();
//		s1.decreaseSpeed();
		
		Regulator r1 = new B();
		r1.increaseSpeed();
		r1.decreaseSpeed();
//		r1.on();
//		r1.off();
		s1.off();
	}

}
