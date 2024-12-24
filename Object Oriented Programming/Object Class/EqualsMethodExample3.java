package com.JSP.ObjectClass;

import java.util.Objects;

class Car {
	String name;
	String color;
	int carNum;
	public Car(String name, String color, int carNum) 
	{
		this.name = name;
		this.color = color;
		this.carNum = carNum;
	}
	
	@Override 
	public String toString()
	{
		return "Car Name : " + name + "\n" + "Car Color : " + color + "\n" + "Car Number : " + carNum;
	}

	@Override
	public boolean equals(Object obj) 
	{
		Car c1 = (Car) obj;
		return carNum == c1.carNum && Objects.equals(color, c1.color) && Objects.equals(name, c1.name);
	}	
	
}

public class EqualsMethodExample3 {

	public static void main(String[] args) {
		
		Car c1 = new Car("BMW", "White", 1234);
		Car c2 = new Car("BMW", "White", 1234);
		
		System.out.println(c1.equals(c2)); // true
		System.out.println(c1 == c2); // false

	}

}
