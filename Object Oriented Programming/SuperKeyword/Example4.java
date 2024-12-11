package com.JSP.Inheritance.SuperKeyword;

class I {
	I()
	{
		System.out.println("I() Constructor."); // 1st , 4th
	}
	I(int i)
	{
		System.out.println("I(int i) Constructor.");
	}
}
class J extends I {
	J()
	{
		System.out.println("J() Constructor."); // 2nd , 5th
	}
	J(int i)
	{
		System.out.println("J(int i) Constructor.");
	}
}
class K extends J {
	K()
	{
		System.out.println("K() Constructor."); // 3rd
	}
	K(int i)
	{
		System.out.println("K(int i) Constructor."); // 6th
	}
}

public class Example4 {

	public static void main(String[] args) {
		
		new K();
		new K(10);

	}

}
