package com.JSP.Has_A.Composition;

public class Engine {
	int cc;
	String type;
	
	public Engine(int cc, String type) {
		this.cc = cc;
		this.type = type;
	}
	
	public void display()
	{
		System.out.println("Engine CC :- " + cc);
		System.out.println("Fuel Type :- " + type);
	}
	
}
