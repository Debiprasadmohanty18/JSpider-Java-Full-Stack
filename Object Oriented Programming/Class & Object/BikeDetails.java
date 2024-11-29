package com.JSP.Object;

class Bike {
	String name;
	int bikeNum;
	String colour;
	
	public void addBike(String n, int b, String c)
	{
		name = n;
		bikeNum = b;
		colour = c;
	}
	
	public void display()
	{
		System.out.println(name + " " + bikeNum + " " + colour);
	}
	
}

public class BikeDetails {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.addBike("R15", 6372, "Blue");
		b1.display();  // R15 6372 Blue
		
		Bike b2 = new Bike();
		b2.addBike("Yamaha", 1234, "Red");
		b2.display();  // Yamaha 1234 Red
	}

}
