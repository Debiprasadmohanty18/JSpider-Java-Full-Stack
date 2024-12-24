package com.JSP.MethodOverriding;

class A1 {
	void m1()
	{
		System.out.println("m1()-A1");
	}
}
class B1 extends A1 {
	@Override
	void m1()
	{
		System.out.println("m1()-B1");
	}
}

public class Example2 {

	public static void main(String[] args) {
		
		B1 b1 = new B1();
		b1.m1();

	}

}
