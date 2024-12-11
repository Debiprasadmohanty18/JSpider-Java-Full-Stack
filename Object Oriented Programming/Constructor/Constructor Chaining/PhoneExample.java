package com.JSP.Constructor.ConstructorChaining;

class Phone {
	
	String name;
	String colour;
	
	Phone(String name, String colour) 
	{
		this.name = name;
		this.colour = colour;
	}
}
class SmartPhone extends Phone {
	
	int ram;
	int rom;
	int pixel;
	
	SmartPhone(String name, String colour, int ram, int rom, int pixel)
	{
		super(name, colour);
		this.ram = ram;
		this.rom = rom;
		this.pixel = pixel;
	}
	
	public void display()
	{
		System.out.println("Phone Name :- " + name + "\n" + "Colour :- " + colour + "\n" + "Ram :- " + ram + "\n" + "Rom :- " + rom + "\n" + "Camera Pixel :- " + pixel);
	}
}

public class PhoneExample {
	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("Google Pixel", "Red", 16, 512, 50);
		ph1.display();
	}
}
