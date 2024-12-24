package com.JSP.ThisKeyword;

class Rectangle {
	int length;
	int breadth;
	
	public void initializer(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public void getArea()
	{
		System.out.println("Area of Rectangle :- " + this.length * this.breadth);
	}
	
	public void perimeter()
	{
		System.out.println("Perimeter of Rectangle :- " + 2 * (this.length + this.breadth));
	}
	
	public void display()
	{
		System.out.println("Length :- " + length);
		System.out.println("Breadth :- " + breadth);
	}
}

public class RectangleDetails {

	public static void main(String[] args) {
		Rectangle  r = new Rectangle();
		r.initializer(20, 30);
		r.getArea();
		r.perimeter();
		r.display();
	}

}
