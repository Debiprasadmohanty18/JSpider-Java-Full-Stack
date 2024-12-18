package com.JSP.Has_A.Composition;

public class MainCarEngine {

	public static void main(String[] args) {
		
		Car c1 = new Car("BMW", 1234, "White", new Engine(1500, "Petrol"));
		c1.displayCar();
		System.out.println("==================");
//		c1.e.type = "Diesel"; --> We can change the type of Engine like this.
		c1.displayCar();

	}

}
