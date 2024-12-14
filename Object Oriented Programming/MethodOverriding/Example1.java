package com.JSP.MethodOverriding;

class A {
	void m1()
	{
		System.out.println("m1() - A");
	}
}
class B extends A {
	void m1()
	{
		System.out.println("m1() - B");
	}
}

public class Example1 {

	public static void main(String[] args) {
		
		B ob1 = new B();
		ob1.m1();

	}

}
