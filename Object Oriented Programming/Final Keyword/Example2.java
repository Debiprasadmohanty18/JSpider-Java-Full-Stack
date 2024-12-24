package com.JSP.FinalKeyword;

class A {
	final int i = 10;
	void m1()
	{
		System.out.println("m1() - A");
	}
	
	final static void m2()
	{
		System.out.println("m2() - A");
	}
}
class B extends A {
	@Override
	public final void m1()
	{
//		i += 20; --> CTE
		System.out.println("m1() - B");
	}
	
//	final static void m2()
//	{
//		System.out.println("m2() - A");   --> Cann't be inherited because it is parent class's final method.
//	}
}
class C extends B {
	
//	public void m1()
//	{
//		System.out.println("C() - C"); --> Cann't be inherited because it is parent class's final method.
//	}
	
}

public class Example2 {

	public static void main(String[] args) {
		
		B ob1 = new B();
		System.out.println(ob1.i);
		ob1.m1();
		ob1.m2();

	}

}
