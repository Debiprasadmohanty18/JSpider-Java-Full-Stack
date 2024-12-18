package com.JSP.Has_A.Aggregation;

public class SimCard {
	String name;
	long num;
	
	public SimCard(String name, long num) 
	{
		this.name = name;
		this.num = num;
	}
	
	public void display()
	{
		System.out.println("SimCard Name :- " + name);
		System.out.println("SimCard Num :- " + num);
	}
	
}


