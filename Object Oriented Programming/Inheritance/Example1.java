package com.JSP.Inheritance;

class A 
{
	int i=10;
	void m1()
	{
		System.out.println("m1() of A class");
	}
}

class B extends A
{
	int j = 20;
}

public class Example1 {

	public static void main(String[] args) {
		
		B ob1 = new B();
		System.out.println(ob1.i); // 10
		ob1.m1();
		System.out.println(ob1.j); // 20
		System.out.println("===========");
		A ob2 = new A();
		System.out.println(ob2.i); // 10
		ob2.m1();
//		System.out.println(ob2.j); --> CTE

	}

}
