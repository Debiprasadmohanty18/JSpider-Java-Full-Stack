package com.JSP.Has_A.Aggregation;

public class Mobile {
	String mobName;
	String color;
	int ram;
	int rom;
	SimCard s; // Has-A (Aggregation)
	
	public Mobile(String mobName, String color, int ram, int rom) {
		this.mobName = mobName;
		this.color = color;
		this.ram = ram;
		this.rom = rom;
	}
	
	public void insertSim(SimCard s)
	{
		this.s = s;
	}
	
	public void displayMobile()
	{
		System.out.println("Phone Brand :- " +mobName);
		System.out.println("Colour :- " +color);
		System.out.println("Ram :- "+ram);
		System.out.println("Rom :- "+rom);
		
		if(s != null)
			s.display();
		else 
			System.out.println("No Sim Card Inserted");
	}
	
	
}
