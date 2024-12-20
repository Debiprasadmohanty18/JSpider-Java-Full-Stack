package com.JSP.Non_Primitive_Type_Casting.Downcasting;

class A {
	void m1()
	{
		System.out.println("M1()-A");
	}
}
class B extends A {
	@Override
	void m1()
	{
		System.out.println("M1()-B");
	}
	void m2()
	{
		System.out.println("M2()-B");
	}
}

public class Example1 {

	public static void main(String[] args) {
		A a = new B(); // Upcasting (B to A)
		a.m1(); // M1()-B
//		a.m2(); --> CTE
		
//		B b = a; --> CTE
		B b = (B) a; // Downcasting (A to B)
		b.m1(); // M1()-B
		b.m2(); // M2()-B
	}

}
