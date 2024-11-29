package com.JSP.Object;

public class ObjectAsReturnTypeEx2 {
	
	public static A m1(B b)
	{
		System.out.println("M1(B b) Executed");
		return new A();
	}
	
	public static B m2(A a)
	{
		System.out.println("M2() Executed");
		return new B();
	}

	public static void main(String[] args) {
		
		A ob = m1(new B());
		
		A objA = new A();
		B obj = m2(objA);
		
		System.out.println(ob + "\n" + obj);
	}

}
