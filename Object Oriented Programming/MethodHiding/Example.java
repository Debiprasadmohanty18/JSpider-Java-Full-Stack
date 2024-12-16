package com.JSP.MethodHiding;


class A {
	void m1()
	{
		System.out.println("M1()-A");
	}
	
	static void m2()
	{
		System.out.println("M2()-A");
	}
}
class B extends A {
	@Override 
	void m1()
	{
		System.out.println("M1()-B");
	}
	static void m2()
	{
		System.out.println("M2()-B"); // Method Hiding
	}
}

public class Example {

	public static void main(String[] args) {
		
		B ob1 = new B();
		ob1.m1(); // Method Overriding
		ob1.m2(); // Method Shadowing or Method Hiding

	}

}
