package com.JSP.AbstractKeyword;

abstract class Shape {
   String colour;
   public Shape(String colour) 
   {
	   this.colour = colour;
   }
   
   abstract void getArea();
   abstract void display();
}

class Rectangle extends Shape {

	int length;
	int breadth;

	public Rectangle(String colour, int length, int breadth) {
		super(colour);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void getArea() 
	{	
		System.out.println("Rectangle Area is : " + (length * breadth));
	}

	@Override
	void display() 
	{
		System.out.println("Colour Of Rectangle : " + colour);
		System.out.println("Length Of Rectangle : " + length);
		System.out.println("Breadth of Rectangle : " + breadth);		
	}
	
}

class Circle extends Shape {
	
	int radius;

	public Circle(String colour, int radius) {
		super(colour);
		this.radius = radius;
	}

	@Override
	void getArea() 
	{
		System.out.println("Circle Area is : " + (3.14 * (radius * radius)));
	}

	@Override
	void display() 
	{
		System.out.println("Colour Of Circle : " + colour);
		System.out.println("Radius Of Circle : " + radius);
	}
	
}

public class Example4 {

	public static void main(String[] args) {
		Shape s1;
		s1 = new Rectangle("Red", 10, 20);
		s1.display();
		s1.getArea();
		System.out.println("==========================================");
		s1 = new Circle("Blue", 20);
		s1.display();
		s1.getArea();
	}

}
