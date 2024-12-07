package com.JSP.Object;
class Water {
	String name;
	String colour;
	String type;
	int size;
	double price;
	boolean water;
	
	public void drinkWater()
	{
		if(water) 
			System.out.println("Drink Water...");
		else
			System.out.println("Fill Water!!!");
		water = false;
	}
	
	public void fillWater()
	{
		water = true;
	}
	
	public void display()
	{
		System.out.println("Name :- "+name + ", Colour :- "+ colour + ", Type :- "+type + ", Price :- "+price);
	}
}
public class WaterBottleExample {

	public static void main(String[] args) {
		
		Water ob1 = new Water();
		ob1.name = "Bisleri";
		ob1.colour = "Sky";
		ob1.type = "Plastic";
		ob1.size = 2;
		ob1.price = 40.40;
		ob1.water = true;
		
		ob1.drinkWater(); // Drink Water
		ob1.drinkWater(); // Fill Water
		
		ob1.fillWater(); 
		
		ob1.drinkWater(); // Drink Water
		
		ob1.display();  // Bisleri Sky Plastic 40.40
		
	}

}
