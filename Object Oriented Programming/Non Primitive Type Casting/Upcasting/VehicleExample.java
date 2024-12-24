package com.JSP.Non_Primitive_Type_Casting.Upcasting;

class Vehicle {
	
}
class BMW extends Vehicle {
	
}
class BMWX extends Vehicle {
	
}
class BENZ extends Vehicle {
	
}
class AUDI extends Vehicle {
	
}

public class VehicleExample {

	public static void drive(Vehicle v)
	{
		System.out.println("Driving...");
	}
	
	public static void main(String[] args) {
		
		drive(new BMW());
		drive(new BMWX());
		drive(new BENZ());
		drive(new AUDI());

	}

}
