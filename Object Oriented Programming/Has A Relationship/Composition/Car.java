package com.JSP.Has_A.Composition;

public class Car {
	String name;
	int carNum;
	String colour;
	Engine e;
	
	public Car(String name, int carNum, String colour, Engine e) {
		this.name = name;
		this.carNum = carNum;
		this.colour = colour;
		this.e = e; // Has-A (Composition)
	}
	
	public void displayCar()
	{
		System.out.println("Car Name :- " + name);
		System.out.println("Car Number :- " + carNum);
		System.out.println("Colour :- " + colour);
		e.display();
	}
	
}
