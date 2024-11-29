package com.JSP.Object;

public class ObjectAsReturnType {
	
	public static void m1()
	{
		System.out.println("M1() is Executed");
	}
	
	public static int m2()
	{
		System.out.println("M2() is Executed");
		return 18;
	}
	
	public static A m3()
	{
		System.out.println("M3() is Executed");
		A a = new A();
		return a;
	}
	
	public B m4()
	{
		System.out.println("M4() is Executed");
		return new B();
	}

	public static void main(String[] args) {
		
		m1();		
		int n = m2();
		A a = m3();
		ObjectAsReturnType ob = new ObjectAsReturnType();
		B b = ob.m4();
		
		System.out.println(n + "\n" + a + "\n" + b);
	}

}
