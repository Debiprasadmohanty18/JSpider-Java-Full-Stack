package com.JSP.Constructor.ConstructorOverloading;

public class Box {
	int length;
	int breadth;
	int height;
	
	Box() { }
	Box(int n)
	{
		length = n;
	}
	
	Box(int length, int breadth, int height)
	{
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public void display()
	{
		System.out.println("Length : " + length + ", " + "Breadth : " + breadth + ", " + "Height : " + height);
	}

	public static void main(String[] args) {
		
		Box b1 = new Box();
		b1.display(); // 0 0 0
		Box b2 = new Box(18);
		b2.display(); // 18 18 18
		Box b3 = new Box(10, 20, 30);
		b3.display(); // 10 20 30

	}

}
