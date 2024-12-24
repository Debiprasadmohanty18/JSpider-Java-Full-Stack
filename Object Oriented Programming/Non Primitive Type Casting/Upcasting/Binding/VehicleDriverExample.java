package com.JSP.Non_Primitive_Type_Casting.Upcasting.Binding;

import java.util.Scanner;

class Vehicle {
	void start()
	{
		
	}
	void accelerate()
	{
		
	}
	void stop()
	{
		
	}
}
class BMW extends Vehicle {
	@Override
	void start()
	{
		System.out.println("BMW Started.");
	}
	@Override
	void accelerate()
	{
		System.out.println("BMW Going...");
	}
	@Override
	void stop()
	{
		System.out.println("BMW Stopped.");
	}
}
class AUDI extends Vehicle {
	@Override
	void start()
	{
		System.out.println("AUDI Started.");
	}
	@Override
	void accelerate()
	{
		System.out.println("AUDI Going...");
	}
	@Override
	void stop()
	{
		System.out.println("AUDI Stopped.");
	}
}
class BENZ extends Vehicle {
	@Override
	void start()
	{
		System.out.println("BENZ Started.");
	}
	@Override
	void accelerate()
	{
		System.out.println("BENZ Going...");
	}
	@Override
	void stop()
	{
		System.out.println("BENZ Stopped.");
	}
}

class Driver {
	public static Vehicle getCar()
	{
		System.out.println(" 1 - BMW \n 2 - AUDI \n 3 - BENZ");
		System.out.print("Enter The Number Of Vehicle You Want To Ride :- "); 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n)
		{
		case 1 : return new BMW();
			
		case 2 : return new AUDI();
			
		case 3 : return new BENZ();
			
		default : return null;
		}
	}
	
	public static void drive(Vehicle v)
	{
		v.start();
		v.accelerate();
		v.stop();
	}
}

public class VehicleDriverExample {

	public static void main(String[] args) {		
		Vehicle v = Driver.getCar();
		Driver.drive(v);
	}

}
