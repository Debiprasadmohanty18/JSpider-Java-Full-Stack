package com.JSP.Constructor;

public class RectangleExample {
	
	int length;
	int breadth;
	
	public RectangleExample(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public void display()
	{
		System.out.println("Length :- " + length);
		System.out.println("Breadth :- " + breadth);
	}

	public static void main(String[] args) {
		
		RectangleExample ob1 = new RectangleExample(5, 10);
		ob1.display();  // 5 10
		System.out.println("================");
		RectangleExample ob2 = new RectangleExample(15, 20);
		ob2.display();  // 15 20
		
	}

}
