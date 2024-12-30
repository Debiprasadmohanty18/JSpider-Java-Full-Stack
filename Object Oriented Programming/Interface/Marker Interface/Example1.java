package com.JSP.Interface.MarkerInterface;

interface Washable {
	
}
class Car implements Washable {
	
}
class Laptop {
	
}
class Bike implements Washable {
	
}
class Mobile {
	
}
class WasherMan {
	static void wash(Object o)
	{
		if( o instanceof Washable )
			System.out.println( o.getClass().getSimpleName() + " is Washable.");
		else 
			System.out.println( o.getClass().getSimpleName() + " is not Washable.");
	}
}

public class Example1 {

	public static void main(String[] args) 
	{
		Car c = new Car();
		Laptop l = new Laptop();
		Bike b = new Bike();
		Mobile m = new Mobile();
		
		WasherMan.wash(c);
		WasherMan.wash(l);
		WasherMan.wash(b);
		WasherMan.wash(m);
	}

}
