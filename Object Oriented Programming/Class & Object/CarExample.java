package com.JSP.Object;

class Car {
	static String bName;
	String carName;
	String colour;
	int carNum;
	int price;
	
	public void display()
	{
		System.out.println("Car Brand Name :- "+bName+"\n"+"Car Name :- "+carName+"\n"+"Car Colour :- "+carNum+"\n"+"Car Price :- "+price);
	}
}

public class CarExample {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car.bName = "Suzuki";
		c1.carName = "Baleno";
		c1.carNum = 1355;
		c1.colour = "Blue";
		c1.price = 1900000;
		c1.display();
		System.out.println("=============================");
		
		Car c2 = new Car();
		c2.carName = "Dezire";
		c2.carNum = 6755;
		c2.colour = "Red";
		c2.price = 2900000;
		c2.display();

	}

}
