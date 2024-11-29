package com.JSP.Object;

public class Test {
	
	public static void m1(int i)
	{
		System.out.println("M1(int i) Executed : " + i);
	}
	
	public static void m2(A a)
	{
		System.out.println("M2(A a) Executed");
	}
	
	public static void m3(Emp e)
	{
		System.out.println("M3(Emp e) Executed");
	}

//	public static void m4(Tea t)       --------> Compile Time Error because There is no "Tea" class present in Object package.
//	{
//		System.out.println("m4(Tea t) Executed");
//	}
	
	public static void main(String[] args) {
		
		m1(18);
		A a = new A();
		m2(a);
		
		m3(new Emp());
		
		

	}

}
