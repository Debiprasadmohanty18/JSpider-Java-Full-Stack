package com.JSP.Non_Primitive_Type_Casting.Upcasting;

class A {
	
}
class B extends A {
	
}
class C {
	
}
class D {
	
}

public class Example {
	
	public static void m1(Object o)
	{
		System.out.println("M1(Object o) is Executed.");
	}
	
	public static void main(String[] args) {
		m1(10);// CTS
		m1(new A());
		m1(new B());
		m1(new C());
		m1(new D());
	}
}
