package com.JSP.Inheritance.SuperKeyword;

class X {
	X()
	{
		this(200);
		System.out.println("X() Constructor"); // 2nd
	}
	X(int i)
	{
		System.out.println("X(int i) Constructor" + " " + "I = "+i); // 1st
	}
}
class Y extends X {
	Y()
	{
		System.out.println("Y() Constructor"); // 3rd
	}
	Y(int i)
	{
		this();
		System.out.println("Y(int i) Constructor" + " " + "I = "+i); // 4th
	}
}
class Z extends Y {
	Z()
	{
		this(200);
		System.out.println("Z() Constructor"); // 6th
	}
	Z(int i)
	{
		super(i);
		System.out.println("Z(int i) Constructor" + " " + "I = "+i); // 5th
	}
}
public class Example5 {

	public static void main(String[] args) {
		
		new Z();

	}

}
